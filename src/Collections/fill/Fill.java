package Collections.fill;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Fill {

    public static void main(String[] args) {

        Random aleatory = new Random();

        List<Integer> arrayList = new ArrayList<>();


        int i = 0;
        while (i < 20) {
            arrayList.add(aleatory.nextInt(1000));
            i++;
        }

        System.out.println(arrayList);

        Collections.fill(arrayList, 1987);

        System.out.println(arrayList);

    }
}
