package oo;

public class Aluno {

    int id;
    String nome;

    public void insertRecord(int i, String n){
        id = i;
        nome = n;
    }

    public void displayInformation(){
        System.out.println("id: " + id + " nome: " + nome);
    }

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();


        a1.insertRecord(1 , "tu");
        a2.insertRecord(2 , "outro");

        a1.displayInformation();
        a2.displayInformation();

    }
}
