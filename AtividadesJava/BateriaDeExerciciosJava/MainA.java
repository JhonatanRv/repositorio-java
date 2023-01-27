package BateriaDeExerciciosJava;

import javax.swing.JOptionPane;

public class MainA {
    public static void main(String[] args){

        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
        int Ft, cont;
        cont = 1;
        Ft= 1;

        if(n > 0){
            while(cont <= n){
                Ft = Ft * cont;
                cont++;
            }
            JOptionPane.showMessageDialog(null, "O fatorial deste número é: " + Ft, "Fatorial", JOptionPane.INFORMATION_MESSAGE);

        }else{
            JOptionPane.showMessageDialog(null, "Insira um valor valido ", "ERRO", JOptionPane.ERROR_MESSAGE);
        }



    }
}