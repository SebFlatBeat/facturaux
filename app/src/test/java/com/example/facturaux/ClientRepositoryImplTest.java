package com.example.facturaux;

import android.content.Context;
import androidx.room.Room;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import com.example.facturaux.dao.AppDataBase;
import com.example.facturaux.dao.ClientDao;
import com.example.facturaux.entity.Client;
import com.example.facturaux.repository.ClientRepositoryImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(AndroidJUnit4.class)
public class ClientRepositoryImplTest {
    private ClientDao clientDao;
    private ClientRepositoryImpl clientRepositoryImpl;

    @Before
    public void createDb() {
        Context context = ApplicationProvider.getApplicationContext();
        AppDataBase db = Room.inMemoryDatabaseBuilder(context, AppDataBase.class).build();
        clientDao = db.clientDao();
        clientRepositoryImpl = new ClientRepositoryImpl(context);
    }

    @After
    public void closeDb() {
        clientDao.clear();
    }

    @Test
    public void insertClient() throws Exception {
        // given
        Client client = new Client("Doe", "John", 12, "B", "Rue de la Paix", 75008, "Paris", "johndoe@example.com", 1234567890,0987654321);

        // when
        clientRepositoryImpl.insert(client);

        // then
        List<Client> clients = LiveDataTestUtil.getValue(clientDao.getAllClients());
        assertThat(clients.size(), is(1));
        assertThat(clients.get(0).getFirstName(), is(client.getFirstName()));
        assertThat(clients.get(0).getLastName(), is(client.getLastName()));
    }
}
