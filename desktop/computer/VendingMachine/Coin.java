package project.models;

public enum Coin {
    C50(50, "50"),
    C100(100, "100"),
    C500(500, "500");
    
    public int value;
    public String name;
    
    Coin(int value, String name) {
        this.value = value;
        this.name = name;
    }
}