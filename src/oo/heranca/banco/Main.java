package oo.heranca.banco;

public class Main {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(2000);

        cc.mostrarSaldo();
        cc.sacar(20001);
        cc.mostrarSaldo();
        cc.sacar(200);
        cc.mostrarSaldo();
    }
}
