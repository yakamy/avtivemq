package org.yk.activemq.queue;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.Session;

/**
 * Created by Administrator on 2016/9/29.
 */
public class Producer {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        JmsTemplate jmsTemplate = (JmsTemplate) applicationContext.getBean("jmsTemplate");
        //ActiveMQQueue queue = (ActiveMQQueue) applicationContext.getBean("queueDestination");

        ActiveMQTopic topic = (ActiveMQTopic) applicationContext.getBean("topicDestination");

        jmsTemplate.send(topic, (Session session) -> session.createTextMessage("hello world!"));

    }
}
