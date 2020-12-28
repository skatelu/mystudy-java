/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author yjl
 * @version $Id: LogAspect.java, v 0.1 2020-12-28 9:11 yjl Exp $$
 */
@Aspect // 表明这是一个切面类
@Component // 将当前类注入到Spring容器中
public class LogAspect {

    // @Pointcut 切入点，其中execution用于使用切面的连接点。使用方法：execution(方法修饰符(可选) 返回类型 方法名 参数 异常模式(可选)) ，可以使用通配符匹配字符，*可以匹配任意字符。
    @Pointcut("execution(public * testhttp.demo.controller.AopController.aopTest(..))")
    public void LogAspect() {
    }


    @Before("LogAspect()") // 在切面的方法执行前执行
    public void doBefore(JoinPoint joinPoint){
        System.out.println("切面方法执行前。。。。。。");
    }

    @After("LogAspect()") // 在切面的方法执行后执行
    public void doAfter(JoinPoint joinPoint){
        System.out.println("切面方法执行后。。。。。。");
    }

    @AfterReturning("LogAspect()") // 在切面方法执行后返回一个结果后执行
    public void doAfterReturning(JoinPoint joinPoint){
        System.out.println("切面方法执行返回结果后。。。。。。。");
    }

    @AfterThrowing("LogAspect()") // 在方法执行过程中抛出异常的时候执行
    public void deAfterThrowing(JoinPoint joinPoint){
        System.out.println("切面方法执行抛出异常后。。。。。。。");
    }

    /**
     *  环绕通知，就是可以在执行前后都使用这个方法的参数必须为：ProceedingJoinPoint
     *  proceed 方法就是被切面的方法，上面四个方法可以使用JoinPoint，JoinPoint包含了类名，被切面的方法名，参数等信息
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around("LogAspect()")
    public Object deAround(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("环绕通知开始执行。。。。。。");
        return joinPoint.proceed();
    }

}