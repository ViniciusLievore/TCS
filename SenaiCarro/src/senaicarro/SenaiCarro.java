package senaicarro;

import java.util.Scanner;


public class SenaiCarro {

    
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Moto m1 = new Moto();
        Caminhao t1 = new Caminhao();
        
        Scanner sc = new Scanner(System.in);
        
        int opcao = 0;
        
        do {
		System.out.println("\n      =========================");
		System.out.println("         |     1 - Carro         |");
		System.out.println("         |     2 - Moto          |");
		System.out.println("         |     3 - Caminhao      |");
		System.out.println("         |     0 - Sair          |");
		System.out.println("        =========================\n");
                
                System.out.println("Escolha a opcao de veiculo: ");
                opcao = sc.nextInt();
		System.out.print("\n");
		switch (opcao) {
		case 1:
                        menuCarro();
			break;
		case 2:
			menuMoto();
			break;
                   //case3 , 4  , etc...
		case 3:
			menuCaminhao();
			break;
		case 0:
			break;
		default:
			System.out.println("Opção Inválida!");
			break;
		}
        }while(opcao != 0);        
    }
    
    public static void menuCarro(){
        Scanner sc = new Scanner(System.in);
        Carro c1 = new Carro();
        
        int opcao = 0;
        
        do {
		System.out.println("\n      ==============================");
		System.out.println("         |     1 - Ligar              |");
		System.out.println("         |     2 - Desligar           |");
		System.out.println("         |     3 - Acelerar           |");
		System.out.println("         |     4 - Abastecer          |");
                System.out.println("         |     5 - Troca Pneu         |");
		System.out.println("         |     6 - Mostrar Status     |");
                System.out.println("         |     7 - Mostrar Veiculo    |");
                System.out.println("         |     0 - Sair               |");
		System.out.println("        ==============================\n");
                
                System.out.println("Escolha a opcao do carro: ");
                opcao = sc.nextInt();
		System.out.print("\n");
		switch (opcao) {
		case 1:
                        c1.ligar();
			break;
		case 2:
			c1.desligar();
			break;
		case 3:
			c1.acelerar();
			break;
                case 4:
			c1.abastecer();
			break;
                case 5:
			c1.trocarPneu();
			break;
                case 6:
			c1.mostrarStatus();
			break;
                case 7:
			c1.mostrarVeiculo();
			break;
		case 0:
			break;
		default:
			System.out.println("Opção Inválida!");
			break;
		}
        }while(opcao != 0);
    }
    
    public static void menuMoto(){
        Scanner sc = new Scanner(System.in);
        Moto m1 = new Moto();
        
        int opcao = 0;
        
        do {
		System.out.println("\n      ==============================");
		System.out.println("         |     1 - Ligar              |");
		System.out.println("         |     2 - Desligar           |");
		System.out.println("         |     3 - Acelerar           |");
		System.out.println("         |     4 - Abastecer          |");
                System.out.println("         |     5 - Troca Pneu         |");
		System.out.println("         |     6 - Mostrar Status     |");
                System.out.println("         |     7 - Mostrar Veiculo    |");
                System.out.println("         |     8 - Sair               |");
		System.out.println("        ==============================\n");
                
                System.out.println("Escolha a opcao da moto: ");
                opcao = sc.nextInt();
		System.out.print("\n");
		switch (opcao) {
		case 1:
                        m1.ligar();
			break;
		case 2:
			m1.desligar();
			break;
		case 3:
			m1.acelerar();
			break;
                case 4:
			m1.abastecer();
			break;
                case 5:
			m1.trocarPneu();
			break;
                case 6:
			m1.mostrarStatus();
			break;
                case 7:
			m1.mostrarVeiculo();
			break;
		case 0:
			break;
		default:
			System.out.println("Opção Inválida!");
			break;
		}
        }while(opcao != 0);
    }
    
    public static void menuCaminhao(){
        Scanner sc = new Scanner(System.in);
        Caminhao t1 = new Caminhao();
        
        int opcao = 0;
        
        do {
		System.out.println("\n      ==============================");
		System.out.println("         |     1 - Ligar              |");
		System.out.println("         |     2 - Desligar           |");
		System.out.println("         |     3 - Acelerar           |");
		System.out.println("         |     4 - Abastecer          |");
                System.out.println("         |     5 - Troca Pneu         |");
		System.out.println("         |     6 - Mostrar Status     |");
                System.out.println("         |     7 - Mostrar Veiculo    |");
                System.out.println("         |     8 - Sair               |");
		System.out.println("        ==============================\n");
                
                System.out.println("Escolha a opcao do carro: ");
                opcao = sc.nextInt();
		System.out.print("\n");
		switch (opcao) {
		case 1:
                        t1.ligar();
			break;
		case 2:
			t1.desligar();
			break;
		case 3:
			t1.acelerar();
			break;
                case 4:
			t1.abastecer();
			break;
                case 5:
			t1.trocarPneu();
			break;
                case 6:
			t1.mostrarStatus();
			break;
                case 7:
			t1.mostrarVeiculo();
			break;
		case 0:
			break;
		default:
			System.out.println("Opção Inválida!");
			break;
		}
        }while(opcao != 0);
    }
    
}
