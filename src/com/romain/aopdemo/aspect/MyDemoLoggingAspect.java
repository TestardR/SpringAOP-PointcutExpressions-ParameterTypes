package com.romain.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	// this is where we add all of our related advices for logging
	
	// lets start with an @Before advice
	
	@Before("execution(* com.romain.aopdemo.dao.*.*(..))")
//	@Before("execution(* add*(com.romain.aopdemo.Account, ..))")
	public void beforeAddAcountAdvice() {
		System.out.println("\n====>>> Executing @Before advice on addAccount()");
		
	}
}
