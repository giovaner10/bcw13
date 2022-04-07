package oo.heranca.banco;

public class ContaCorrente extends ContaNormal{


    public ContaCorrente(double montante) {
        super(montante);
    }

    public void sacar(double valor){
        if(super.getMontante() >= valor){
            super.setMontante(getMontante() - valor);
        }
    }

    public void mostrarSaldo(){
        System.out.println(super.getMontante());
    }
}
