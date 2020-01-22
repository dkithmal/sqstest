package com.dsta.enterprise.demosqsmessaging;

import javax.jms.JMSException;

public class AWSSQSPublisher {

    public static AWSQSPublisherBase publisher;

    private AWSSQSPublisher(){}

    private static void initPublisher() throws Exception {
        if(publisher == null){
            publisher = new AWSQSPublisherBase();
            publisher.runPublisher();
        }
    }

    public static void publishMessage(String message){

        try {
            initPublisher();
        } catch (Exception e) {
            publisher = null;
            e.printStackTrace();
        }

        if(publisher != null){
            try {
                publisher.publishMessage(message);
                System.out.println("message submitted");
            } catch (JMSException e) {
               e.printStackTrace();
            }
        }

    }
}
