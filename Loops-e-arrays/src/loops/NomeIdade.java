package loops;

import java.util.Scanner;

public class NomeIdade {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String nome;
        int idade;
        
        while (true) {
            System.out.println("Nome: ");
            nome=scan.next();
            System.out.println("idade: ");
            idade=scan.nextInt();  
        }
        


    }
}
