package net.likelion.bebc25.spring.aop.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect//횡단 관심사 클래스 정의
public class LoggingAspect {

    @Pointcut("execution(* net.likelion.bebc25.spring.aop.springaop.*Driver.*(..))")
    private void springaopPackageMethods(){}

    @Before("execution(* net.likelion.bebc25.spring.aop.springaop.*Driver.*(..))")
    public void logBefore(JoinPoint joinPoint){//메서드 수행 전에 로그 메세지 출력 기능

        System.out.println("[AOP로그 before] 메서드 실행 전에 처리할 코드를 작성합니다.");
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
    }

    @After("execution(* net.likelion.bebc25.spring.aop.springaop.*Driver.*(..))")
    public void logAfter(){//메서드 수행 후에 로그 메세지 출력
        System.out.println("[AOP로그 after ] 메서드 실행 후에 처리할 코드를 작성합니다.");

    }
    @Around("springaopPackageMethods()")
    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {//특정 메서드 수행 전/후에 로그 메시지 출력
        System.out.println("[AOP로그 around] 메서드 실행 전에 처리할 코드를 작성합니다.");
        joinPoint.proceed();
        System.out.println("[AOP로그 around] 메서드 실행 후에 처리할 코드를 작성합니다.");
    }
}
