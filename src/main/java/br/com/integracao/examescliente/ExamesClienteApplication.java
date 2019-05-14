package br.com.integracao.examescliente;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.integracao.examescliente.soap.BuscaExameRequisicao;
import br.com.integracao.examescliente.soap.ExameResposta;

@SpringBootApplication
public class ExamesClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamesClienteApplication.class, args);
	}

	@Bean
	public CommandLineRunner lookup(SOAPConnector soapConnector) {
		return args -> {
			long id = 1l;
			BuscaExameRequisicao request = new BuscaExameRequisicao();
			request.setId(id);
			request.setCodigo("teste");
			ExameResposta response =(ExameResposta) soapConnector.callWebService("http://localhost:8080/service/integracao-exames", request);
			System.out.println("Got Response As below ========= : ");
			System.out.println("Id : "+response.getExame().getId());
			System.out.println("Código : "+response.getExame().getCodigo());
			System.out.println("Nome : "+response.getExame().getNome());
			System.out.println("Descrição : "+response.getExame().getDescricao());

		};
	}

}
