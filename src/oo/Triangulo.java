package oo;

public class Triangulo {

    double base;
    double altura;

    public void insertRecord(double bs, double alt){
        base = bs;
        altura = alt;
    }

    public void displayInformation(){

        System.out.println("ÁREA: " + base * altura + "m^2");
    }

    public static void main(String[] args) {

        Triangulo a1 = new Triangulo();

        a1.insertRecord(5 , 3);

        a1.displayInformation();

    }
}
