package com.hydu.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import static javafx.scene.input.KeyCode.T;

/**
 * Created on 2020/6/1 @author heyong
 */
@Component
public class TransactionUtil {

    private  DataSourceTransactionManager transactionManager;

    public void  setTransactionManager(DataSourceTransactionManager transactionManager){
        this.transactionManager =transactionManager;
    }


    public  TransactionStatus begin(){
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW); // 事物隔离级别，开启新事务，这样会比较安全些。
        TransactionStatus status = transactionManager.getTransaction(def); // 获得事务状态
        return status ;
    }
    public void commit(TransactionStatus status){
        if(status!=null){

            transactionManager.commit(status);
        }
    }

    public void rollback(TransactionStatus status){
        if(status!=null){

            transactionManager.rollback(status);
        }
    }
}