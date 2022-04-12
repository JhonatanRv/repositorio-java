import java.util.Scanner;
public class Main4 {
   

    public static void main(String[] args){ 
    
        Scanner palavras = new Scanner(System.in);
            System.out.println("Escreva algo!");
                String texto = palavras.nextLine();
            System.out.print(texto.toUpperCase());        

        palavras.close();

} 


}       
