package com.example.facturaux.repository;

import com.example.facturaux.entity.Client;

import java.util.List;

public interface ClientRepository {
    void insert(Client client);
    void update(Client client);
    void delete(Client client);
    List<Client> getAllClients();
    Client getClientById(long clientId);
}
