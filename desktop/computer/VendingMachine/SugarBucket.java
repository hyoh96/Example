package project.containers;

public class SugarBucket implements Container {
    public int grams;
    
    public SugarBucket(int grams) {
        this.grams = grams;
    }
    
    @Override
    public int getVolumn() {
        return this.grams;
    }
    
    @Override
    public int consume(int n) {
        this.grams -= n;
        return this.grams;
    }
}