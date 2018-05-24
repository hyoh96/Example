package project.models;

import project.containers.*;
import project.buttons.*;

public class VendingMachine {
    public Container coffeeBucket;
    public Container cupContainer;
    public Container sugarBucket;
    public Container milkBucket;
    public Container waterBucket;
    
    public Button blackCoffeeButton;
    public Button sugarCoffeeButton;
    public Button milkCoffeeButton;
    public Button ejectButton;
    
    public int balance;
    
    public VendingMachine() {
        this.coffeeBucket = new CoffeeBucket(20);
        this.cupContainer = new CupContainer(50);
        this.sugarBucket = new SugarBucket(100);
        this.milkBucket = new MilkBucket(20);
        this.waterBucket = new WaterBucket(50);
        
        this.blackCoffeeButton = new Button(this, v -> {v.ejectBlackCoffee();});
        this.sugarCoffeeButton = new Button(this, v -> {v.ejectSugarCoffee();});
        this.milkCoffeeButton = new Button(this, v -> {v.ejectMilkCoffee();});
        this.ejectButton = new Button(this, v -> {v.ejectCoin();});
        
        this.balance = 0;
    }
    
    public Coffee ejectBlackCoffee() {
        if (this.isEnableBlackCoffee()) {
            this.balance -= Coffee.Black.price;
            this.coffeeBucket.consume(1);
            this.waterBucket.consume(1);
            System.out.println("블랙커피 나왔습니다.");
            return Coffee.Black;
        }
        System.out.println("실패");
        return null;
    }
    
    public Coffee ejectSugarCoffee() {
        if (this.isEnableSugarCoffee()) {
            this.balance -= Coffee.Black.price;
            this.coffeeBucket.consume(1);
            this.sugarBucket.consume(1);
            this.waterBucket.consume(1);
            System.out.println("설탕커피 나왔습니다.");
            return Coffee.Sugar;
        }
        System.out.println("실패");
        return null;
    }
    
    public Coffee ejectMilkCoffee() {
        if (this.isEnableMilkCoffee()) {
            this.balance -= Coffee.Black.price;
            this.coffeeBucket.consume(1);
            this.sugarBucket.consume(1);
            this.milkBucket.consume(1);
            this.waterBucket.consume(1);
            System.out.println("우유커피 나왔습니다.");
            return Coffee.Milk;
        }
        System.out.println("실패");
        return null;
    }
    
    public boolean isEnableBlackCoffee() {
        return this.balance >= Coffee.Black.price
            && this.isEnoughBlackCoffee();
    }
    
    public boolean isEnableSugarCoffee() {
        return this.balance >= Coffee.Sugar.price
            && this.isEnoughSugarCoffee();
    }
    
    public boolean isEnableMilkCoffee() {
        return this.balance >= Coffee.Milk.price
            && this.isEnoughMilkCoffee();
    }
    
    public boolean isEnoughBlackCoffee() {
        return this.coffeeBucket.getVolumn() > 0
            && this.waterBucket.getVolumn() > 0;
    }
    
    public boolean isEnoughSugarCoffee() {
        return this.coffeeBucket.getVolumn() > 0 
            && this.sugarBucket.getVolumn() > 0
            && this.waterBucket.getVolumn() > 0;
    }
    
    public boolean isEnoughMilkCoffee() {
        return this.coffeeBucket.getVolumn() > 0 
            && this.sugarBucket.getVolumn() > 0
            && this.milkBucket.getVolumn() > 0
            && this.waterBucket.getVolumn() > 0;
    }
    
    public String viewMenu() {
        String menu = "(1) 블랙커피 " + (this.isEnableBlackCoffee() ? "* ": "") + "\n"
            + "(2) 설탕커피 "  + (this.isEnableSugarCoffee() ? "* ": "") + "\n"
            + "(3) 밀크커피 "  + (this.isEnableMilkCoffee() ? "* ": "") + "\n"
            + "(0) 반환 "  + (this.balance > 0 ? "* ": "") + "\n";
        return menu;    
    }
    
    public String viewStatus() {
        String status = "잔액: " + this.balance + "원\n";
        return status;
    }
    
    public void insertCoin(Coin coin) {
        this.balance += coin.value;
    }
    
    public int ejectCoin() {
        int changes = this.balance;
        this.balance = 0;
        System.out.println("" + changes + "원이 반환되었습니다.");
        return changes;
    }
    
}