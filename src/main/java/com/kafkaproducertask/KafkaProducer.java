package com.kafkaproducertask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
	@Autowired
	KafkaTemplate<String,String> kt ;
	@Value("${myTopic}")
	private String topic;
	
	public String sendMessageToTopic(String msg) {

		kt.send(topic,msg);
	
		return "Message sent successfully to topic";
	}

}
