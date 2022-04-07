package fluxo;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        char[] respoostas = {'a', 'b', 'd', 'c'};

        char[] aluno = new char[respoostas.length];
        double nota = 0;

        for(int i = 0; i < aluno.length; i++){
            System.out.println("inform a " + i + " nota");
            aluno[i] = leitor.next().charAt(0);

        }

        for (int i = 0; i < respoostas.length; i++){

            if(respoostas[i] == aluno[i]) {
                nota += 2.5;
            }

        }

        System.out.println(nota);
    }
}
