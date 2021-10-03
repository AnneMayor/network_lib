import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.channels.ServerSocketChannel;

public class ChatServer {

    private ServerSocketChannel serverChannel;
    private ServerSocket serverSocket;

    public InetSocketAddress createSocketAddress(int port) {
        return new InetSocketAddress(port);
    }

    public ServerSocket openServerSocket() {
        try {
            serverChannel = ServerSocketChannel.open();
            serverSocket = serverChannel.socket();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return serverSocket;
    }

//    public boolean setUpServer() {
//        serverSocket.setReceiveBufferSize();
//    }

}
