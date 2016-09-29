package org.yk.activemq.listener;

import javax.jms.Message;
import javax.jms.MessageListener;

/**
 * Created by Administrator on 2016/9/29.
 */
public class MyMessageListener implements MessageListener {
    @Override
    public void onMessage(Message message) {
        System.out.println(message);
    }
}
