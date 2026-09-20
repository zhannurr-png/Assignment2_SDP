package app;

import logistics.Logistics;
import ui.Button;
import ui.Checkbox;
import ui.GUIFactory;
public class DeliveryApplication {
    private GUIFactory guiFactory;
    private Logistics logistics;

    public DeliveryApplication(GUIFactory guiFactory, Logistics logistics){
        this.guiFactory = guiFactory;
        this.logistics = logistics;
    }
    public void run(String cargo, String destination){
        Button button = guiFactory.createButton();
        Checkbox checkbox = guiFactory.createCheckbox();

        button.paint();
        checkbox.paint();
        logistics.planDelivery(cargo, destination);
    }
}
