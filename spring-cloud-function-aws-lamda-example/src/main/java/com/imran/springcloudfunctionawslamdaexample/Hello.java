package com.imran.springcloudfunctionawslamdaexample;

import java.util.function.Function;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

@Component
public class Hello implements Function<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent>
{

	

	@Override
	public APIGatewayProxyResponseEvent apply(APIGatewayProxyRequestEvent input)
	{
		Log.logger.info("input.getHttpMethod = " + input.getHttpMethod());
		Log.logger.info("input.getBody = " + input.getBody());
		Log.logger.info("input.getHttpPath = " + input.getPath());
//		String getHttpMethod = (input.getRequestContext().getHttpMethod() != null) ?  input.getRequestContext().getHttpMethod() : " Empty"; 
//		Log.logger.info("input.getRequestContent.getHttpMethod = " + getHttpMethod);
//		
//		String getPath = (input.getRequestContext().getPath() != null) ? input.getRequestContext().getPath() : " Empty";
//		Log.logger.info("input.getRequestContent.getPath = " + getPath);
//		
//		String apiId = (input.getRequestContext().getApiId() != null) ? input.getRequestContext().getApiId() : " Empty";
//		Log.logger.info("input.getRequestContent.getApiId = " + apiId);
//		
//		String requestId = (input.getRequestContext().getRequestId() != null) ? input.getRequestContext().getRequestId() : " Empty";
//		Log.logger.info("input.getRequestContent.getREquestID = " +  requestId);
//		
//		String stage  = (input.getRequestContext().getStage() != null) ? input.getRequestContext().getStage() : " Empty";
//		Log.logger.info("input.getRequestContent.getStage = " + stage);
//		
//		String accountId = (input.getRequestContext().getAccountId() != null) ? input.getRequestContext().getAccountId() : " Empty";
//		Log.logger.info("input.getRequestContent.getAccountID = " + accountId);
		APIGatewayProxyResponseEvent apiGatewayProxyResponseEvent = new APIGatewayProxyResponseEvent();
		apiGatewayProxyResponseEvent.setStatusCode(200);
		apiGatewayProxyResponseEvent.setBody("Hello from imran shaikh !!!");

		return apiGatewayProxyResponseEvent;
	}

}
