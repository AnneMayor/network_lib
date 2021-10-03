import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.when;

public class TestChatServer {

    @Mock
    private ChatServer server;

    @Test
    public void openServerSocket() throws IOException {
        MockitoAnnotations.openMocks(this);
        when(server.openServerSocket()).thenReturn(new ServerSocket());
        ServerSocket serverSocket = server.openServerSocket();
        Assert.assertNotNull(serverSocket);
    }

    @Test
    public void crateSocketAddress() {
        MockitoAnnotations.openMocks(this);
        InetSocketAddress address;
        when(server.createSocketAddress(8000)).thenReturn(new InetSocketAddress(8080));
    }

    

//    public void setUpServer() {
//        MockitoAnnotations.openMocks(this);
//        when(server.setUpServer()).thenReturn(true);
//        when(server.setUpServer()).thenReturn(false);
//        when(server.setUpServer()).thenReturn(false);
//    }

}
