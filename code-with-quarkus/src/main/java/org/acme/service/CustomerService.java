package org.acme.service;

import org.acme.entity.customer;
import org.acme.repository.CustomerRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped // implementa para que tambem possa ser gerenciada pelo framework do quarkus

public class CustomerService 
{
    @Inject // injeta a classe customer repository dentro da classe atual customerservice, para utilizar
    
    CustomerRepository customerRepository; // tem acesso a todos os metodos dentro de customer repository

    // metodos especificos para salvar informações

    //informa que deverá retornar algo de customer da pasta entiry
    public List<customer> findAllCustomers() 
    {

    return customerRepository.findAll().list(); // utiliza metodos da bilbioteca do panache equivalente ao list
    }

    public void addCustomer(customer Customer) // objeto que virá do endpoint rest
    {
        customerRepository.persist(Customer);//metodo salva objeto dentro do banco de dados
    }
}
