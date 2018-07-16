package com.redhat.refarch.spring.boot.lambdaair.flights;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class RestApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run( RestApplication.class, args );
	}
}