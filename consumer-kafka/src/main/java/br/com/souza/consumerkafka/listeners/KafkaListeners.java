package br.com.souza.consumerkafka.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListeners {

    @KafkaListener(topics = "souza-topic", groupId = "myGroup")
    public void listener(String data){
        System.out.println("-------------------------------------------------------------");
        System.out.println(String.format("Novo usuário: %s \n", data));
    }
}
