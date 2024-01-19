package impl;

public class KeywordThrows {
    public static void main(String[] args) {
        try {
            stampa();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //con throws delego la gestione dell'eccezione al metodo che invoca stampa()
    public static void stampa() throws Exception{
        throw new Exception();}
}
