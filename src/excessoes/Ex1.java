package excessoes;

public class Ex1 {
    public static void main(String[] args) {


        System.out.println(divisao(2,2));

    }

    /**
     *
     * @param a divisor
     * @param b dividendo, nao pode ser zero
     * @return retorna a/b
     * @throws IllegalArgumentException , caso b = 0
     */
    private static int divisao(int a , int b) throws IllegalArgumentException{

        if(b == 0){
            throw new IllegalArgumentException("Nao eh possivel dividir por zero");
        }
        return a/b;

    }
}
