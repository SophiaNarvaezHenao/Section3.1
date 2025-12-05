public class NotificadorSMS implements INotificador{
    @Override
    public void enviar(String message, String recipient) {
        System.out.println("Sending an SMS to " + recipient + ": " + message);
    }
}
