package tipos;

public class Tipos {

    static final Double L = 10.0;
    public static void main(String[] args) {

        double resultado = dobro(L);
        System.out.println(resultado);

        int x = 10;
        x++;
        System.out.println(x++);
        System.out.println(x);

    }

    public static Double dobro(Double valor){
        return Math.pow(valor, 2);
    }

}
