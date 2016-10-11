package com.lanhun.framework.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LogInterceptor {
	private static Logger logger = LoggerFactory
			.getLogger(LogInterceptor.class);

	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable { 
		Object o=null;
		Object args[]=joinPoint.getArgs();
			long t=System.currentTimeMillis();
			try{
				o=joinPoint.proceed(args);
			}catch(Throwable e){
				t=System.currentTimeMillis()-t;
				logger.warn("invoke fail:"+joinPoint.getTarget().getClass().getSimpleName()+"."+joinPoint.getSignature().getName()+" take "+t+" ms");
				throw e;
			}
			t=System.currentTimeMillis()-t;
			logger.info("invoke success:"+joinPoint.getTarget().getClass().getSimpleName()+"."+joinPoint.getSignature().getName()+" take "+t+" ms");
		return o;
	}
}
