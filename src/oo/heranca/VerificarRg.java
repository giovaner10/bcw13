package oo.heranca;

public interface VerificarRg {

    public  void VerificarNota(); //necessario implementar nesse caso

    default void naoPrecisaVerficar(){

    }; //como o nome ja sugera nao existe a necessidade de implementar esse metodo



}
