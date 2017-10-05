package com.seungdols.ex.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @PACKAGE com.seungdols.ex.aop
 * @AUTHOR seungdols
 * @DATE 2017. 10. 5.
 */
public class LogAop {

	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {
		String signatureString = joinPoint.getSignature().toShortString();
		System.out.println(signatureString + " is start.");

		long st = System.currentTimeMillis();

		try {
			Object object = joinPoint.proceed();
			return object;
		} finally {
			long et = System.currentTimeMillis();
			System.out.println(signatureString + " is finished. ");
			System.out.println(signatureString + " is took " + ((et - st) / 1000) + " seconds.");
		}

	}

	public void beforeLog() {
		System.out.println("Before()");
	}

	public void afterLog() {
		System.out.println("After()");
	}

	public void afterReturning() {
		System.out.println("After Returning()");
	}

	public void afterThrowing() {
		System.out.println("After Throwing()");
	}


}
