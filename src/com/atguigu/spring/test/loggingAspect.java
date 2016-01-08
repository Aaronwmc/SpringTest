package com.atguigu.spring.test;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class loggingAspect {
	@Before("execution(public double com.atguigu.spring.test.CalculatorImpl.*(double,double))")
	public void beforeMethod(JoinPoint joinPoint){
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println("The method "+methodName+" begins with"+args);
	}
	
	@After("execution(public double com.atguigu.spring.test.CalculatorImpl.*(double,double))")
	public void afterMethod(JoinPoint joinPoint){
		String methodName = joinPoint.getSignature().getName();
		System.out.println("The method "+methodName+" ends");
	}
	
	@AfterReturning(value="execution(public double com.atguigu.spring.test.CalculatorImpl.*(double,double))",returning="result")
	public void afterReturnning(JoinPoint joinPoint,Object result){
		String methodName = joinPoint.getSignature().getName();
		System.out.println("The method "+methodName+" ends with " +result);
	}
	
	@AfterThrowing(value="execution(public double com.atguigu.spring.test.CalculatorImpl.*(..))",throwing="e")
	public void afterThrowing(JoinPoint joinPoint,Exception e){
		String methodName = joinPoint.getSignature().getName();
		System.out.println("The method "+methodName+" occurs exception " +e);
	}
}
