import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<INotificador> lista = new ArrayList<>();
        lista.add(new NotificadorEmail());
        lista.add(new NotificadorSMS());
        lista.add(new NotificadorPush());

        GestorDeAlertas gestor = new GestorDeAlertas(lista);
        System.out.println("If you are seeing this message, it means that you are par of the FBI.");
        System.out.println("This is the list of suspects. \nIf any of them are confirmed to have committed crimes, please send notification to deactivate their devices. \nI Please only do this once we are outside the suspect's home.");
        System.out.println("\n1. William Afton \n2. King Bowser Koopa \n3.Mojo Jojo \n4.Team Rocket \n5. Doctor Eggman");
        String option = sc.nextLine();
        switch (option){
            case "1":
                gestor.shootMaximumAlert("We are disabling all your devices, and the FBI is surrounding your house.", "William Afton");
                break;
            case "2":
                gestor.shootMaximumAlert("We are disabling all your devices, and the FBI is surrounding your house.", "King Bowser Koopa");
                break;
            case "3":
                gestor.shootMaximumAlert("We are disabling all your devices, and the FBI is surrounding your house.", "Mojo Jojo");
                break;
            case "4":
                gestor.shootMaximumAlert("We are disabling all your devices, and the FBI is surrounding your house.", "Team Rocket");
                break;
            case "5":
                gestor.shootMaximumAlert("We are disabling all your devices, and the FBI is surrounding your house.", "Doctor Eggman");
                break;
            default:
                System.out.println("Invalid option. Exiting.");
                sc.close();
                return;

        }
    }
}