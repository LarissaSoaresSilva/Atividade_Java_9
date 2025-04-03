package java_9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila_Exercicio_1 {

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);

		Queue<String> filaDeClientes = new LinkedList<String>();

		int opcaoMenu = -1;
		String nome;

		System.out.println("#### ### ### ### ### ### ### ### ### ### ####");
		System.out.println("\n 1 - Adicionar Cliente na Fila  ");
		System.out.println(" 2 - Listar todods os clientes ");
		System.out.println(" 3 - Retirar Cliente da Fila ");
		System.out.println(" 0 - Sair ");
		System.out.println("#### ### ### ### ### ### ### ### ### ### ####");

		while (opcaoMenu != 0 && opcaoMenu <= 3) {

			System.out.println(" \nDigite a opção desejada :");
			opcaoMenu = lerScanner.nextInt();

			switch (opcaoMenu) {

			case 1:
				System.out.println("Digite o nome do Cliente: ");
				nome = lerScanner.nextLine();
				filaDeClientes.add(lerScanner.nextLine());

				if (filaDeClientes.isEmpty()) {
					System.out.println("A Fila está vazia!");
				} else {
					System.out.println("\nFila: \n");
					for (String cliente : filaDeClientes) {
						System.out.println(cliente);
					}
					System.out.println("\nCliente adicionado!\n");
				}
				break;

			case 2:
				if (filaDeClientes.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("Lista de Clientes na Fila: \n");
					for (String cliente : filaDeClientes) {
						System.out.println(cliente);
					}
				}
				break;

			case 3:
				if (filaDeClientes.isEmpty()) {
					System.out.println("A fila está vazia !");

				} else {
					filaDeClientes.poll();
					System.out.println("\nFila :\n");

					for (String cliente : filaDeClientes) {
						System.out.println(cliente);

					}
					System.out.println("\nO cliente foi chamado!");
				}
				break;

			case 0:
				System.out.println("Programa finalizado!");
				break;

			default:
				System.out.println("Opcão Inválida!");
				break;
			}
		}

		lerScanner.close();
	}
}
