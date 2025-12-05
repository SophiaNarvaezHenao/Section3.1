public class NotificadorEmail  implements INotificador{
    @Override
    public void enviar(String message, String recipient) {
        System.out.println("Sending an email to " + recipient + ": " + message);
    }
}
