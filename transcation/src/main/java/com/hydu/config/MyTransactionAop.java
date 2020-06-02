package com.hydu.config;

import com.hydu.utils.TransactionUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;

/**
 * Created on 2020/6/1 @author heyong
 */
@Aspect
@Component
public class MyTransactionAop {

    @Autowired
    private TransactionUtil transactionUtil;

    @Pointcut(value = "@annotation(com.hydu.annotation.MyTranscation)")
    public void process(){

    }

    @Around(value = "process()")
    public void myTransaction(ProceedingJoinPoint  joinPoint) throws Throwable{
        TransactionStatus status = null;
        try{
             status =  transactionUtil.begin();
            joinPoint.proceed();
            transactionUtil.commit(status);
        }catch (Exception e){
            e.printStackTrace();
            transactionUtil.rollback(status);
        }

    }


}