package excessoes;

import java.io.File;
import java.io.IOException;

public class Ex {
    public static void main(String[] args) {

        criarNovoArquivo();

    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo\\teste.txt");
        try {

            boolean criado = file.createNewFile();
            System.out.println(criado + " arquivo criado");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("deu pau");
        }
    }
}
