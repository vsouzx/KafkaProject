package br.com.souza.producerkafka.config;

import br.com.souza.producerkafka.dto.UsuarioRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerConfig {

    private final KafkaTemplate<String, UsuarioRequest> kafkaTemplate;
    private static final String TOPIC = "souza-topic";

    public KafkaProducerConfig(KafkaTemplate<String, UsuarioRequest> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(UsuarioRequest request){
        Message<UsuarioRequest> message = MessageBuilder
                .withPayload(request)
                .setHeader(KafkaHeaders.TOPIC, TOPIC)
                .build();

        kafkaTemplate.send(message);
    }
}
