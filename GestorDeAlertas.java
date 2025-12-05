import java.util.List;

public class GestorDeAlertas {

    private List<INotificador> notifiers;

    public GestorDeAlertas(List<INotificador> notifiers) {
        this.notifiers = notifiers;
    }

    public void shootMaximumAlert(String message, String recipient) {
        System.out.println("WARNING: MAXIMUM ALERT ACTIVATED");
        for (INotificador notifier : notifiers) {
            notifier.enviar(message, recipient);
        }
    }
}
