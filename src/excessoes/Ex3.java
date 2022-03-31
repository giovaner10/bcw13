package excessoes;

public class Ex3 {
    public static void main(String[] args) {

        novoMetodo();

    }

    private static void novoMetodo() {
        try{
            System.out.println("abrindo");
            System.out.println("rodando");
            System.out.println("frechando");
            throw new RuntimeException();

        }catch (Exception e){
            e.printStackTrace();

        }finally {
            System.out.println("fechando recurso liberado pelo so");
        }
    }
}
