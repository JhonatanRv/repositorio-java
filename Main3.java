import java.util.Scanner;
public class Main3 {
   

    public static void main(String[] args){ 
    
        Scanner letras = new Scanner(System.in);
            System.out.println("Escreva algo!");
                String texto = letras.nextLine();
            System.out.print("A quantidade de caracteres nesse texto é de: " + texto.length());        

        letras.close();
}

}
