package BateriaDeExerciciosJava;

import javax.swing.JOptionPane;

public class MainB {
    public static void main(String[] args) {

        int n1 = 3;
        int n2 = 5;
        int soma = 0;

        for (int cont = 0; cont < 1000; cont++){
            if (cont % n1 == 0 || cont % n2 == 0){
                soma += cont;
            }
        }
        JOptionPane.showMessageDialog(null, "A soma dos multiplos de 3 e 5 em uma contagem até 1000 é: " + soma, "Contagem", JOptionPane.INFORMATION_MESSAGE);
    }
}