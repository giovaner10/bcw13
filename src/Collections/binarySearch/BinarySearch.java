package Collections.binarySearch;

import java.util.*;

public class BinarySearch {

    public static void main(String[] args) {

        Random aleatory = new Random();

        List<Integer> binarySearch = new ArrayList<>();

        //binarySearch.add(1); //importante para o nosso exemplo
        binarySearch.add(1001); //importante para o nosso exemplo


        int i = 0;
        while (i < 20){
            binarySearch.add(aleatory.nextInt(1000));
            i++;
        }

        System.out.println(binarySearch);
        //nossa lista precisa estar ordenada
        Collections.sort(binarySearch);

        System.out.println(binarySearch);

        //ponto onde deveria ser inserido caso nao exista

        int valuePosition = Collections.binarySearch(binarySearch, 1);
        System.out.println("Posicao do indice: " + valuePosition);

        valuePosition = Collections.binarySearch(binarySearch, 1001);
        System.out.println("Posicao do indice: " + valuePosition);



    }
}
