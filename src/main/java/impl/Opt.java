package impl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Opt {
    public static void main(String[] args) {

//        ArrayList<String> arr=List.of("A","B");

        //Creo un Optional non vuoto
        Optional<Oggetto> oggetto = Optional.of(new Oggetto(2, 3));
        //Creo un optional vuoto
        Optional<Oggetto> secOggetto = Optional.empty();

        String str = null;
        //Creo un optional con un valore o vuoto
        Optional<String> strOpt = Optional.ofNullable(str);

        //Restituisco true se l'optional ha un valore
        if(oggetto.isPresent())
            System.out.println("OK");

        //se l'optional contiene un oggetto viente eseguita la prima lambda (Consumer<T>) altrimenti la seconda (Runnable)
        oggetto.ifPresentOrElse(
                (x)->System.out.println("l'attezza dell'oggetto : "+x.getAltezza()),
                ()->System.out.println("NO")
        );

        //Restituisco il valore dell'optional o la stringa "no"
        System.out.println(strOpt.orElse("no"));
        //Restituisco il valore dell'optional o restituisce una lambda Supplier<T>
        Oggetto sampleOggetto=oggetto.orElseThrow(()->new RuntimeException());
        //Restituisco il valore dell'optional. Nel casso fosse vuoto lancia un eccezione
        System.out.println(strOpt.get());


        //Se la condizione sul campo altezza di 'oggetto' è soddisfatta restituisco il campo altezza di oggetto, altrimenti 4
        System.out.println(oggetto.filter(altezza -> altezza.isAltezza(2)).map(x -> x.getAltezza()).orElse(4));
        //Se l'optional secOggetto ha un valore restituisco il valore di altezza, altrimenti 0
        System.out.println(secOggetto.map(x -> x.getAltezza()).orElse(0));

    }

    public void metodo(){
        Integer [] vett= {2,3,4,1,0};
        Integer app;
        boolean flag=false;
        for (int i=0; i<vett.length;i++){
            if(vett[i]>vett[i+1]){
                app=vett[i];
                vett[i]=vett[i+1];
                vett[i+1]=app;
                flag=true;
            }
        }
    }

}