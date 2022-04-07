package Collections.equals;

import java.util.Objects;

public class Celular {


    private long imei;
    private String model;

    public Celular(long imei, String model) {
        this.imei = imei;
        this.model = model;
    }

    // na criacao de um obj eh criado o codigo hash, ele pode nao ser unico, e para identificar esse ob, temos o equals

    public boolean equalsImei(Object o) {
        Celular celular = (Celular) o; //cria um cell
        return imei == celular.imei; //verificaa se esse cell tem os imeis iguais
    }

    public boolean equalsClass(Object o) {
        return ((o instanceof Celular)); // verifica se sao instancias da mesma classe
    }

    public boolean equalsObj(Object o) {
        return  (this == o) ; //verifica se eh o mesmo obj, ou seja se aponta para o mesmo local
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Celular)) return false;
        Celular celular = (Celular) o;
        return imei == celular.imei;
    }

    @Override
    public int hashCode() {
        return Objects.hash(imei);
    }
}
