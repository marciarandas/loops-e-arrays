package loops;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int entrada=scan.nextInt();
        int mesada = 50;
        int count = 0;
        
        mesada = mesada * entrada;
        
        System.out.print("Voce tera"+ mesada +"reais");
    }
    
}
