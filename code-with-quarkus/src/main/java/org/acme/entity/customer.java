package org.acme.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity //O Hibernate entende que essa classe faz uma ligação co banco de dados
@Data // anotação do lombok
@NoArgsConstructor // anotação do lombok (gera metodos getters and setters)

public class customer
{
    //Atributos para salvar informações do cliente
    //Anotações do Hibernate e JPA
    //As anotações @id  diz para nosso banco de dados que as informação id da classe se refere ao id do banco de dados
    // @generated value serve para criar automaticamente ao se criar usuario ou algo no banco de dados
    @Id
    @GeneratedValue

    private Long id;

    private String name;

    private String lastName;

    private Integer age;

    private String email;

    
}
