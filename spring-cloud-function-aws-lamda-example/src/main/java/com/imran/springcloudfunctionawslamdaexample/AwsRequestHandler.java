package com.imran.springcloudfunctionawslamdaexample;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

public class AwsRequestHandler extends SpringBootRequestHandler<APIGatewayProxyRequestEvent,APIGatewayProxyResponseEvent>
{

}
