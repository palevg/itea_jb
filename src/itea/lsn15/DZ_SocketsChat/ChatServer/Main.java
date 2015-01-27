package itea.lsn15.DZ_SocketsChat.ChatServer;

/**
 * Сделать ф-ю приватных сообщений. Реализовать передачу файлов между клиентами.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Server s = new Server(5000);
        s.start();
    }
}
