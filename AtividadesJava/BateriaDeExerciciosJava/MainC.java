package BateriaDeExerciciosJava;

import javax.swing.JOptionPane;

public class MainC {
    public static void main(String[] args) {

        Float n = Float.parseFloat(JOptionPane.showInputDialog("Insira o número de termos: "));
        Float A1 = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor inicial: "));
        Float An = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor final: "));

        Float Sn = n*(A1 + An)/2;

        JOptionPane.showMessageDialog(null, "O valor de Sn é: " + Sn, "Valor Sn", JOptionPane.INFORMATION_MESSAGE);

    }
}