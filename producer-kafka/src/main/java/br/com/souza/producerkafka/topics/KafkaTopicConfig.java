package br.com.souza.producerkafka.topics;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.stereotype.Service;

@Service
public class KafkaTopicConfig {

    @Bean
    public NewTopic topic(){
        return TopicBuilder
                .name("souza-topic")
                .build();
    }

}
