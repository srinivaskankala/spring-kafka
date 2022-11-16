package com.example.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
   // private ProducerService producerService;
    //public KafkaController(ProducerService producerService){
      //  this.producerService=producerService;
    //
   // }
    @Autowired
    private ProducerService producerService;
    @GetMapping(value="/publish")
        public void sendMessageToKafkaTopic(@RequestParam String message){
            producerService.sendMessage(message);
        }


}
