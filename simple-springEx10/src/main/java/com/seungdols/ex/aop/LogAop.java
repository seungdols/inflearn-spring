package com.seungdols.ex.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @PACKAGE com.seungdols.ex.aop.aop
 * @AUTHOR seungdols
 * @DATE 2017. 10. 5.
 */
@Aspect
public class LogAop {

	//	@Pointcut("execution(public void get*(..))")	// public void인 모든 get메소드
//	@Pointcut("execution(* com.seungdols.ex.aop.*.*())")	// com.seungdols.ex.aop 패키지에 파라미터가 없는 모든 메소드
//	@Pointcut("execution(* com.seungdols.ex.aop..*.*())")	// com.seungdols.ex.aop 패키지 & com.seungdols.ex.aop 하위 패키지에 파라미터가 없는 모든 메소드
//	@Pointcut("execution(* com.seungdols.ex.aop.Worker.*())")	// com.seungdols.ex.aop.Worker 안의 모든 메소드

//	@Pointcut("within(com.seungdols.ex.aop.*)")	//com.seungdols.ex.aop 패키지 안에 있는 모든 메소드
//	@Pointcut("within(com.seungdols.ex.aop..*)")  //com.seungdols.ex.aop 패키지 및 하위 패키지 안에 있는 모든 메소드
//	@Pointcut("within(com.seungdols.ex.aop.Worker)") //com.seungdols.ex.aop.Worker 모든 메소드

	//	@Pointcut("bean(student)")	//student 빈에만 적용
	@Pointcut("bean(*ker)")
	private void pointcutMethod() {

	}

	@Around("pointcutMethod()")
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {
		String signatureStr = joinPoint.getSignature().toShortString();
		System.out.println(signatureStr + " is start.");
		long st = System.currentTimeMillis();

		try {
			Object obj = joinPoint.proceed();
			return obj;
		} finally {
			long et = System.currentTimeMillis();
			System.out.println(signatureStr + " is finished.");
			System.out.println(signatureStr + " 경과시간 : " + (et - st));
		}
	}

	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("beforeAdvice()");
	}

	public void afterReturningAdvice() {
		System.out.println("afterReturningAdvice()");
	}

	public void afterThrowingAdvice() {
		System.out.println("afterThrowingAdvice()");
	}

	public void afterAdvice() {
		System.out.println("afterAdvice()");
	}

}
