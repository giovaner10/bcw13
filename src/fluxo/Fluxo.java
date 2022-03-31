package fluxo;

import javax.swing.*;
import java.awt.*;

public class Fluxo {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        if(nome.length() == 0) System.exit(400);
        JOptionPane.showMessageDialog(null, nome, "seu nome", 3);
        System.exit(400);
    }
}
