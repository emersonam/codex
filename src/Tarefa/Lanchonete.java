package Tarefa;

import java.util.Scanner;

public class Lanchonete {

    public static void main(String[] args) {
    	
    	
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cardápio:");
        System.out.println("1 - Cachorro Quente - R$ 20.00");
        System.out.println("2 - X-Salada - R$ 35.50");
        System.out.println("3 - X-Bacon - R$ 40.00");
        System.out.println("4 - Torrada Simples - R$ 5.00");
        System.out.println("5 - Refrigerante - R$ 7.50");

        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        double total = 0;

        switch (codigo) {
            case 1:
                total = quantidade * 20.00;
                break;
            case 2:
                total = quantidade * 35.50;
                break;
            case 3:
                total = quantidade * 40.00;
                break;
            case 4:
                total = quantidade * 5.00;
                break;
            case 5:
                total = quantidade * 7.50;
                break;
            default:
                System.out.println("Código inválido!");
                return; // Encerra o programa se o código for inválido
        }

        System.out.printf("Total a pagar: R$ %.2f%n", total);

        scanner.close();
    }
}