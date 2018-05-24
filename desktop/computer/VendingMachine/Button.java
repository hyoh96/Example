package project.buttons;

import java.util.function.Consumer;
import project.models.VendingMachine;

public class Button {
    public VendingMachine vendingMachine;
    public Consumer<VendingMachine> callback;
    
    public Button(VendingMachine vendingMachine, Consumer<VendingMachine> callback) {
        this.vendingMachine = vendingMachine;
        this.callback = callback;
    }
    
    public void pushButton() {
        this.callback.accept(this.vendingMachine);
    }
}