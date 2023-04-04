package br.com.souza.producerkafka.controller;

import br.com.souza.producerkafka.config.KafkaProducerConfig;
import br.com.souza.producerkafka.dto.UsuarioRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UsuarioController {

    private final KafkaProducerConfig producer;

    public UsuarioController(KafkaProducerConfig producer) {
        this.producer = producer;
    }

    @PostMapping(value = "/new")
    public ResponseEntity<String> newUser(@RequestBody UsuarioRequest request){
        producer.send(request);
        return new ResponseEntity<>("Usuário criado", HttpStatus.CREATED);
    }

}
