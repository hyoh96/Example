package project.containers;

public class WaterBucket implements Container {
    public int milliliter;
    
    public WaterBucket(int milliliter) {
        this.milliliter = milliliter;
    }
    
    @Override
    public int getVolumn() {
        return this.milliliter;
    }
    
    @Override
    public int consume(int n) {
        this.milliliter -= n;
        return this.milliliter;
    }
}