import app.DeliveryApplication;
import logistics.Logistics;
import logistics.RoadLogistics;
import logistics.SeaLogistics;
import ui.GUIFactory;
import ui.MacOSFactory;
import ui.WindowsFactory;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter delivery mode (ROAD or SEA): ");
        String deliveryMode = scanner.nextLine().trim().toUpperCase();
        if (deliveryMode.isEmpty()) {
            System.out.println("Delivery mode can`t be empty.");
            return;
        }

        System.out.print("Enter UI platform (WINDOWS or MACOS): ");
        String platform = scanner.nextLine().trim().toUpperCase();
        if (platform.isEmpty()) {
            System.out.println("UI platform can`t be empty.");
            return;
        }

        Logistics logistics;
        if (deliveryMode.equals("ROAD")) {
            logistics = new RoadLogistics();
        } else if (deliveryMode.equals("SEA")) {
            logistics = new SeaLogistics();
        } else {
            System.out.println("Invalid delivery mode: " + deliveryMode);
            return;
        }

        GUIFactory guiFactory;
        if (platform.equals("WINDOWS")) {
            guiFactory = new WindowsFactory();
        } else if (platform.equals("MACOS")) {
            guiFactory = new MacOSFactory();
        } else {
            System.out.println("Invalid UI platform: " + platform);
            return;
        }

        DeliveryApplication application = new DeliveryApplication(guiFactory, logistics);

        System.out.println();
        System.out.println("Delivery mode: " + deliveryMode);
        System.out.println("UI platform: " + platform);

        application.run(
                "electronic equipment",
                "Almaty"
        );
    }
}