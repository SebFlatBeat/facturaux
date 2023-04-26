package com.example.facturaux.dao;

import androidx.room.*;
import com.example.facturaux.entity.Client;

import java.util.List;

@Dao
public interface ClientDao {
    @Query("SELECT * FROM client")
    List<Client> getAll();

    @Query("SELECT * FROM client WHERE id IN (:userIds)")
    List<Client> loadAllByIds(long[] userIds);

    @Query("SELECT * FROM client WHERE nom LIKE :nom AND "
            + "prenom LIKE :prenom LIMIT 1")
    Client findByName(String nom, String prenom);

    @Insert
    void insert(Client client);

    @Update
    void update(Client client);

    @Delete
    void delete(Client client);

    @Query("SELECT * FROM client")
    List<Client> getAllClients();

    @Query("SELECT * FROM client WHERE id = :clientId")
    Client getClientById(long clientId);


}
