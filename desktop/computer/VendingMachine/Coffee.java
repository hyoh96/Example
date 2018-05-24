package project.models;

public enum Coffee {
    Black(100, "블랙커피"),
    Sugar(200, "설탕커피"),
    Milk(300, "밀크커피");
    
    public final int price;
    public final String name;
    
    Coffee(int price, String name) {
        this.price = price;
        this.name = name;
    }
}