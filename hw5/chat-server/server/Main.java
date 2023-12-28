package chat-server.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.rmi.UnknownHostException;

public class Main {
    public static final int PORT = 8181;
    private static long clientCounter = 1L;

    public static void main(String[] args) throws IOException {
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            Server server = new Server(serverSocket);
            System.out.println("Сервер запущен на порту " + PORT);
            server.runServer();
        }
        catch (UnknownHostException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}