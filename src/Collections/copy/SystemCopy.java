package Collections.copy;

import java.util.Random;

public class SystemCopy {

    public static void main(String[] args) {

        Random aleatory = new Random();

        int[] list1 = new int[20];
        int[] list2 = new int[20];


        int i = 0;
        while (i < 20){
            list1[i] = (aleatory.nextInt(10));
            i++;
        }

        System.arraycopy(list1,0, list2, 0, list1.length);


        for(int item : list1) {
            System.out.print(item + " ");
        }

        System.out.println();


        for(int item : list2) {
            System.out.print(item + " ");
        }

        System.out.println();
        for(int j = 0; j < list1.length; j++){
            System.out.print(list2[j] + " ");
        }

    }
}
