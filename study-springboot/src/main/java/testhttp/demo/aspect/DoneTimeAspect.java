/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.aspect;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;

/**
 * @author yjl
 * @version $Id: DoneTimeAspect.java, v 0.1 2020-12-28 10:59 yjl Exp $$
 */
@Aspect
@Component
public class DoneTimeAspect {

    @Around("@annotation(doneTime)")
    public Object around(ProceedingJoinPoint joinPoint, DoneTime doneTime) throws Throwable {
        System.out.println("方法开始时间是:"+new Date());
        String s = JSON.toJSONString(doneTime.param());
        String join = String.join(s, "   这是获取的参数");
        System.out.println(join);
        Object o = joinPoint.proceed();
        System.out.println("方法结束时间是:"+new Date()) ;
        return o;
    }
}