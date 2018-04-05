package com.lk1314.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author: william
 * @Date: 2018/4/5 10:06
 */
@Aspect
@Component
@Order(0)
public class DataSourceAspect {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    // 指定切入点表达式： 拦截哪些方法； 即为哪些类生成代理对象
    @Pointcut("execution(* com.lk1314.controller.*.*(..))")
    public void pointCut(){
    }

    // 前置通知 : 在执行目标方法之前执行
    @Before("pointCut()")
    public void begin(){
        logger.info("开始事务/异常");
    }

    @Pointcut("@annotation(com.lk1314.aop.DataSource)")
    public void dataSourcePointCut() {

    }

    @Around("dataSourcePointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();

        DataSource ds = method.getAnnotation(DataSource.class);
        if(ds == null){
            logger.info("set datasource is 111111111111111111111111 " );
        }else {
            logger.info("set datasource is 222222222222222222222222" );
        }

        try {
            return point.proceed();
        } finally {
            logger.info("clean datasource");
        }
    }

}
