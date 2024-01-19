package impl;

public class Oggetto {
    private int altezza;
    private int larghezza;

    public Oggetto(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public boolean isAltezza(int val){
        return this.altezza==2;
    }
    public int getAltezza(){
        return altezza;
    }
}
