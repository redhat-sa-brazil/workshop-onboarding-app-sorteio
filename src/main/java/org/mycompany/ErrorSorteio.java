package org.mycompany;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ErrorSorteio implements Processor {
	@Override
	public void process(Exchange ex) throws Exception {
		ex.getIn().setBody("Body precisa ser preenchido");
        ex.getIn().setHeader(Exchange.CONTENT_TYPE, "text/plain");
        ex.getIn().setHeader(Exchange.HTTP_RESPONSE_CODE, 400);
	}
}
