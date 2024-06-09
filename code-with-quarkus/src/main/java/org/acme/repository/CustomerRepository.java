package org.acme.repository;


import org.acme.entity.customer;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped // anotação diz ao quarkus que essa classe , quando a aplicação for inicializada, poderá utilizar todos os recursos do quarkus
public class CustomerRepository implements PanacheRepository<customer>//Passa parametro customer e implementa o panache que podemos utilizar metodos que inserem e mechem no banco de dados
{
//faz referencia a tabela customer do banco de dados
    
}
