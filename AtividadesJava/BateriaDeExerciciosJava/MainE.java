package BateriaDeExerciciosJava;

import javax.swing.JOptionPane;

public class MainE {
    public static void main(String[] args) throws Exception {

        Float Vo = Float.parseFloat(JOptionPane.showInputDialog("Insira a valocidade inicial: "));
        Float So = Float.parseFloat(JOptionPane.showInputDialog("Insira a espaço inicial: "));
        Float a = Float.parseFloat(JOptionPane.showInputDialog("Insira a aceleração: "));
        Float t = Float.parseFloat(JOptionPane.showInputDialog("Insira o tempo: "));

        Float s = So + (Vo * t) + (a * t) / 2;
        JOptionPane.showMessageDialog(null, "O valor de S é: " + s, "Valor S", JOptionPane.INFORMATION_MESSAGE);
    }
}