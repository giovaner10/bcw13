package fluxo;

import javax.swing.*;

public class Switch {
    public static void main(String[] args) {

        int mes = Integer.parseInt(JOptionPane.showInputDialog("Informeo o numero do mes"));
        System.out.println(mes);
        String nomeMes = "";


        if(mes < 0 || mes >12 ){
            JOptionPane.showMessageDialog(null, "erro");
            System.exit(400);

        }
        switch (mes){
            case 1:
                nomeMes = "janeiro";
                break;
            case 2:
                nomeMes = "Fevereiro";
                break;
            case 3:
                nomeMes = "Marco";
                break;
            case 4:
                nomeMes = "Abril";
                break;
            case 5:
                nomeMes = "Maio";
                break;
            case 6:
                nomeMes = "Junho";
                break;
            case 7:
                nomeMes = "Julho";
                break;
            case 8:
                nomeMes = "Agosto";
                break;
            case 9:
                nomeMes = "Setembro";
                break;
            case 10:
                nomeMes = "Outubro";
                break;
            case 11:
                nomeMes = "Novembro";
                break;
            case 12:
                nomeMes = "Dezembro";
                break;

        }

        JOptionPane.showMessageDialog(null, nomeMes, "mes selecionado", 1);
        //System.exit(0);
    }
}
