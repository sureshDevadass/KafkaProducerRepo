package com.kafkaproducertask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducerController {
	
	@Autowired
	KafkaProducer kp;
	@PostMapping("sendMessageToTopic/{msg}")
	public String sendMessageToTopic(@PathVariable String msg) {
		
		return kp.sendMessageToTopic(msg);
	}

}
