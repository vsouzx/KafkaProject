package br.com.souza.producerkafka.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioRequest {

    private String nome;
    private String sobrenome;
    private String email;
    private Integer estadoCivil;
}
