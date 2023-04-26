package com.example.facturaux.repository;

import android.content.Context;
import com.example.facturaux.dao.ClientDao;
import com.example.facturaux.entity.Client;
import com.example.facturaux.dao.AppDataBase;

import java.util.List;

public class ClientRepositoryImpl implements ClientRepository {
    private final ClientDao clientDao;

    public ClientRepositoryImpl(Context context) {
        AppDataBase db = AppDataBase.getInstance(context);
        clientDao = db.clientDao();
    }

    @Override
    public void insert(Client client) {
        clientDao.insert(client);
    }

    @Override
    public void update(Client client) {
        clientDao.update(client);
    }

    @Override
    public void delete(Client client) {
        clientDao.delete(client);
    }

    @Override
    public void deleteAllClients() {
        clientDao.clear();
    }

    @Override
    public List<Client> getAllClients() {
        return clientDao.getAllClients();
    }

    @Override
    public Client getClientById(long clientId) {
        return clientDao.getClientById(clientId);
    }
}