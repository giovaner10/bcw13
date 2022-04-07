package Collections.equals;

public class Main {

    public static void main(String[] args) {

        String nome1 = "soul";
        String nome2 = "soul";
        String nome3 = new String("soul");

        System.out.println();
        System.out.println("Com nosso nomes:");

        System.out.println("nome1 == nome2: " + nome1 == nome2);
        System.out.println("nome1 == nome3: " + nome1 == nome3);
        System.out.println("nome1.equals(nome3): " + nome1.equals(nome3));

        System.out.println();
        System.out.println("Com nossa classe celular");
        System.out.println();


        Celular c1 = new Celular(121212, "S22 ultra");
        Celular c2 = new Celular(121212, "S22 ultra");
        Celular c3 = new Celular(131313, "S22 ultra");


        System.out.println("c1.equals(c2): " + c1.equals(c2));
        System.out.println("c1.equalsImei(c2): " + c1.equalsImei(c2));
        System.out.println("c1.equalsClass(c3): " + c1.equalsClass(c3));
        System.out.println("c1.equalsClass(nome3): " + c1.equalsClass(nome3));
        System.out.println("c1.equalsImei(c3): " + c1.equalsImei(c3));



    }

}
