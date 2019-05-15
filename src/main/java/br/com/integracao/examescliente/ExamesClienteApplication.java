package br.com.integracao.examescliente;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.integracao.examescliente.soap.BuscaExameRequisicao;
import br.com.integracao.examescliente.soap.Exame;
import br.com.integracao.examescliente.soap.ExameResposta;

@SpringBootApplication
public class ExamesClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamesClienteApplication.class, args);
	}

	@Bean
	public CommandLineRunner lookup(SOAPConnector soapConnector) {
		return args -> {
		    try (Scanner scanner = new Scanner(System.in)){;
			    System.out.print("Digite o id do exame: ");
			    long id = scanner.nextLong();
			    
				BuscaExameRequisicao request = new BuscaExameRequisicao();
				request.setId(id);
	
				ExameResposta response =(ExameResposta) soapConnector.callWebService("http://localhost:8080/service/integracao-exames", request);
				Exame exame = response.getExame();
				
				if(exame != null) {
					System.out.println("Exame encontrado: ========= : ");
					System.out.println("Id : "+response.getExame().getId());
					System.out.println("Código : "+response.getExame().getCodigo());
					System.out.println("Nome : "+response.getExame().getNome());
					System.out.println("Descrição : "+response.getExame().getDescricao());
				}else {
					System.out.println("Nenhhum exame encontrado! ");
				}
		    }
			
		};
	}

}
