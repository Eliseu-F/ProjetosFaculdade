package aulaJava;

import java.util.Scanner;

public class ExerciciosJava {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int opcao = 0;
		
		while(opcao == 1 || opcao == 0 || opcao != 1 || opcao != 0){
		System.out.println("Escolha uma opção: \n");
		System.out.println("Opção 1 - Converte Celcius para Fahrenheit \nOpção 0 - Sair da conversão");
	    opcao = teclado.nextInt();
	    
		if(opcao == 1) {
		System.out.println("Digite o valor em Celcius: \n");
		int c = teclado.nextInt();
		
		float conversão = ((c * 9/5) + 32);
		System.out.println("O valor em Celcius é: " + conversão);
		continue;
		
			}else if(opcao == 0) {
		
		System.out.println("O programa foi encerrado: ");
		break;
			}
		System.out.println("opção inválida: \n");
		}
	}
}


