package org.yk.activemq.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/9/29.
 */
public class Demo {
    @Test
    public void testQueueConsumer() throws Exception{
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        System.in.read();
    }
}
