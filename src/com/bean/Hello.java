package com.bean;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(portName = "HelloPort", targetNamespace = "HelloTargetNameSpace")
@SOAPBinding(style = Style.RPC)
public class Hello {

	public Hello() {

	}

	@WebMethod
	public String sayHelloWorld(@WebParam(name = "name") String name) {
		return "Hello : " + name;
	}
}
