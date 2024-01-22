package impl;

import java.util.ArrayList;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<String> stringList= new ArrayList<>();
        stringList.add("Ciao");
        stringList.add("Mondo");
        List<String> strResultList= getInitFromInput(stringList);
        for(String let:strResultList){
            System.out.println(let);
        }

        strResultList = getInitDispWords(stringList);
        for(String let:strResultList){
            System.out.println(let);
        }
    }

    //Prendo da una lista la lettera iniziale delle stringhe
    public static List<String> getInitFromInput(List<String> inputList){
        return inputList.stream().map(stringa -> stringa.substring(0,1)).toList();
    }

    //Prende da una lista la lettera iniziale delle stringhe che hanno dimensioni dispari
    public static List<String> getInitDispWords(List<String> inputList){
        return inputList.stream().filter( word -> (word.length()%2) == 1).map(word-> word.substring(0,1)).toList();
    }
}
