public class NotificadorPush implements INotificador{
    @Override
    public void enviar(String message, String recipient) {
        System.out.println("sending an PUSH to " + recipient + ": " + message);
    }
}
