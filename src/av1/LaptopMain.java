package av1;

import java.util.Scanner;

public class LaptopMain {

    /*
        IDE utilizada para os testes: Intelij IDEA
     */

    public static void main(String[] args) {
        //Scanner para interação com usuário
        Scanner scan = new Scanner(System.in);

        //Classe Processador pode ser utilizada tanto implícita como explícita
        Processador proc = new Processador("AMD","Ryzen 5");

        System.out.println("Quantas Gb de RAM seu Laptop possui?");

        int ram = scan.nextInt();

        System.out.println("Quantas polegadas tem a sua tela?");

        int polegadas = scan.nextInt();

        //Criação da Classe Laptop com todos os parâmetros inseridos anteriormente
        Laptop laptop = new Laptop(polegadas, proc, ram);

        //Teste para evidenciar que foi criado corretamente
        System.out.println(laptop);

    }
}
