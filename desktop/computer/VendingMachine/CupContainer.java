package project.containers;

public class CupContainer implements Container {
    public int cups;
    
    public CupContainer(int cups) {
        this.cups = cups;
    }
    
    @Override
    public int getVolumn() {
        return this.cups;
    }
    
    @Override
    public int consume(int n) {
        this.cups -= n;
        return this.cups;
    }
}