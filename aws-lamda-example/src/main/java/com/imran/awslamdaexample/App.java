package com.imran.awslamdaexample;

import java.util.Collections;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Hello world!
 *
 */
public class App implements RequestHandler<Object, GatewayResponse>
{

	@Override
	public GatewayResponse handleRequest(Object input, Context context)
	{
		String message = "Hello Imran !";
		System.out.println("message = " + message);
		System.out.print("Input = " + input);
		System.out.println("Context request id = " + context.getAwsRequestId());
		context.getLogger().log("Input from context logger = " + input);
		GatewayResponse gatewayResponse = new GatewayResponse(message, 200, Collections.singletonMap("X-Powered-By", "Imran Shaikh!"),false);
		return gatewayResponse;
	}
    
}
