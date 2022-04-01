package fluxo;

import javax.swing.*;

public class fibonacci {
    public static void main(String[] args) {

        /**
         * fibonacci -
         */
        extracted();

        /**
         * primo
         */
        for(int i = 2; i <=100 ; i++){
            int cont = 0;

            for (int j = 2; j <= i/2 ; j++ ){

                if( i % j == 0){
                    cont ++;
                    break;
                }
            }

            if (cont == 0){
                System.out.println(i + " primo");
            }
        }

        /**
         * fatorial
         */
        int num = Integer.parseInt(JOptionPane.showInputDialog("Informar valor"));
        int fatorial = 1;


        for (int i = num; i > 0; i--){
            fatorial *= i;
        }
        System.out.println( num + "! = " + fatorial);
    }

    private static void extracted() {
        int a = 0;
        int b = 1;

        for(int i = 0; i < 10 ; i++){
            System.out.println(a);
            int aux = a + b;
            a = b;
            b = aux;
        }
    }
}



