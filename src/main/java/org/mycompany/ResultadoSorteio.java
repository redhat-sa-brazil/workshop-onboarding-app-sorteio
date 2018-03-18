package org.mycompany;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ResultadoSorteio implements Processor {

	@Override
	public void process(Exchange ex) throws Exception {
//		if((boolean) ex.getProperty(Exchange.DUPLICATE_MESSAGE)) {
//			ex.getOut().setBody("Valor já sorteado");
//		}
	}
}
