package org.mycompany;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class Sorteio implements Processor {
	
	@Override
	public void process(Exchange ex) throws Exception {
		ListaAlunos listaAlunos = ex.getIn().getBody(ListaAlunos.class);
		List<Aluno> alunos = listaAlunos.getAlunos();
		Integer randomAluno = ThreadLocalRandom.current().nextInt(0,alunos.size());
		alunos.get(randomAluno).setSorteado(true);
		listaAlunos.setAlunos(alunos);
		ex.getOut().setBody(listaAlunos);
	}
}
