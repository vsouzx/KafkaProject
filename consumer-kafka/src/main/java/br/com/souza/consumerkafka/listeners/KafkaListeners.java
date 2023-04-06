package br.com.souza.consumerkafka.listeners;

import br.com.souza.consumerkafka.dto.UsuarioRequest;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "souza-topic")
    void listener(UsuarioRequest data){
        System.out.println("-------------------------------------------------------------");
        System.out.println(String.format("Novo usuário: %s %s \n", data.getNome(), data.getSobrenome()));
        System.out.println(String.format("Email: %s", data.getEmail()));
        System.out.println(String.format("Estado Civil: %s", data.getEstadoCivil()));
    }
}
