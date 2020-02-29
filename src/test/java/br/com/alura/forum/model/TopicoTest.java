package br.com.alura.forum.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TopicoTest {

	@Test
	public void o_estado_inicial_de_um_topico_deve_ser_nao_respondido() {
		// Dado
		Usuario autor = new Usuario("Newton", "newton@caelum.com", "abc123");
		Categoria categoria = new Categoria("Programação");
		Curso curso = new Curso("Java Básico", categoria );
		Topico topico = new Topico("Me ajudem", "O Java não funciona no meu computador!", autor , curso );
				
		// Então
		Assertions.assertEquals(StatusTopico.NAO_RESPONDIDO, topico.getStatus());
	}
	
	@Test
	public void o_estado_deve_ser_fechado_quando_fechar_um_topico() {
		// Dado
		Usuario autor = new Usuario("Newton", "newton@caelum.com", "abc123");
		Categoria categoria = new Categoria("Programação");
		Curso curso = new Curso("Java Básico", categoria );
		Topico topico = new Topico("Me ajudem", "O Java não funciona no meu computador!", autor , curso );
		
		// Quando
		topico.fechar();
		
		// Então
		Assertions.assertEquals(StatusTopico.FECHADO, topico.getStatus()); 
	}
	
	@Test
	public void ao_adicionar_uma_resposta_a_lista_de_respostas_deve_ter_mais_uma_resposta() {
		// Dado
		Usuario autor = new Usuario("Newton", "newton@caelum.com", "abc123");
		Categoria categoria = new Categoria("Programação");
		Curso curso = new Curso("Java Básico", categoria );
		Topico topico = new Topico("Me ajudem", "O Java não funciona no meu computador!", autor , curso );
				
		Resposta resposta = new Resposta("Adicione o Java no PATH", topico, autor);
		
		// Quando
		topico.addResposta(resposta);
		
		// Então
		Assertions.assertEquals(2, topico.getRespostas().size());
	}

}
