package BateriaDeExerciciosJava;

import javax.swing.JOptionPane;

public class MainD {
    public static void main(String[] args){

        Float a1 = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor inicial: "));
        Float q = Float.parseFloat(JOptionPane.showInputDialog("Insira a quantidade: "));
        Float n = Float.parseFloat(JOptionPane.showInputDialog("Insira a razão: "));

        Float Sn = a1*(q*n - 1)/q - 1;
        if(n>= 2){
            JOptionPane.showMessageDialog(null, "O valor de Sn é: " + Sn, "Valor Sn", JOptionPane.INFORMATION_MESSAGE);

        }else{
            JOptionPane.showMessageDialog(null, "Insira um valor valido para a razão", "ERRO", JOptionPane.ERROR_MESSAGE);
        }



    }
}