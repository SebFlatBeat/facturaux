package com.example.facturaux.model;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;

import com.example.facturaux.entity.Client;
import com.example.facturaux.repository.ClientRepositoryImpl;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class HomeModel extends AndroidViewModel {
    private ClientRepositoryImpl clientRepositoryImpl;
    private ExecutorService executorService;

    public HomeModel(Application application) {
        super(application);
        clientRepositoryImpl = new ClientRepositoryImpl(application);
        executorService = Executors.newSingleThreadExecutor();
    }

    public Future<List<Client>> getAllClients() {
        return executorService.submit(clientRepositoryImpl::getAllClients);
    }

    public Future<Client> getClientById(long clientId) {
        return executorService.submit(() -> clientRepositoryImpl.getClientById(clientId));
    }

    public void insert(Client client) {
        executorService.submit(() -> clientRepositoryImpl.insert(client));
    }

    public void update(Client client) {
        executorService.submit(() -> clientRepositoryImpl.update(client));
    }

    public void delete(Client client) {
        executorService.submit(() -> clientRepositoryImpl.delete(client));
    }
}
