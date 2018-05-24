package project;

import project.models.VendingMachine;
import project.models.Coin;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Hello goorm!");
        
        VendingMachine v = new VendingMachine();
        System.out.println(v.viewMenu());
        System.out.println(v.viewStatus());
        
        v.insertCoin(Coin.C100);
        
        System.out.println(v.viewMenu());
        System.out.println(v.viewStatus());
        
        v.insertCoin(Coin.C100);
        
        System.out.println(v.viewMenu());
        System.out.println(v.viewStatus());
        
        v.sugarCoffeeButton.pushButton();
        
        System.out.println(v.viewMenu());
        System.out.println(v.viewStatus());
        
        v.insertCoin(Coin.C500);
        
        System.out.println(v.viewMenu());
        System.out.println(v.viewStatus());
        
        v.milkCoffeeButton.pushButton();
        
        System.out.println(v.viewMenu());
        System.out.println(v.viewStatus());
        
        v.ejectButton.pushButton();
        
        System.out.println(v.viewMenu());
        System.out.println(v.viewStatus());
    }

}
