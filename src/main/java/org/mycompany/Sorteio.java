package org.mycompany;

import java.util.concurrent.ThreadLocalRandom;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class Sorteio implements Processor {
	
	@Override
	public void process(Exchange ex) throws Exception {
		String[] dados = ex.getIn().getBody(String.class).split("\n");
		Integer randomNum = ThreadLocalRandom.current().nextInt(0,dados.length);
    	ex.getOut().setBody(dados[randomNum]);
	}
}
