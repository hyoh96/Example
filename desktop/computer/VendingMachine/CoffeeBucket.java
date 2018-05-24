package project.containers;

public class CoffeeBucket implements Container {
    public int beans;
    
    public CoffeeBucket(int beans) {
        this.beans = beans;
    }
    
    @Override
    public int getVolumn() {
        return this.beans;
    }
    
    @Override
    public int consume(int n) {
        this.beans -= n;
        return this.beans;
    }
}