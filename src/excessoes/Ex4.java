package excessoes;

import java.io.*;

public class Ex4 {
    public static void main(String[] args) {

        lerArquivo();

    }

    private static void lerArquivo()  {
        Reader reader = null;
        try {

            reader = new BufferedReader(new FileReader("teste.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
