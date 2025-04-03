package java_9;

import java.util.Scanner;
import java.util.Stack;

public class Pilha_Exercicio_2 {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);

		Stack<String> pilhaDeLivros = new Stack<>();

		int opcaoMenu = -1;
		String livros;

		System.out.println("#### ### ### ### ### ### ### ### ### ### ####");
		System.out.println("\n 1 - Adicionar Livro na pilha  ");
		System.out.println(" 2 - Listar todods os Livros ");
		System.out.println(" 3 - Retirar Livro da pilha ");
		System.out.println(" 0 - Sair ");
		System.out.println("#### ### ### ### ### ### ### ### ### ### ####");

		while (opcaoMenu != 0 && opcaoMenu <= 3) {

			System.out.println(" \nDigite a opção desejada :");
			opcaoMenu = lerScanner.nextInt();

			switch (opcaoMenu) {

			case 1:
				System.out.println("Digite o nome do Livro: ");
				livros = lerScanner.nextLine();
				pilhaDeLivros.push(lerScanner.nextLine());

				if (pilhaDeLivros.isEmpty()) {
					System.out.println("\nA Pilha está vazia!");
				} else {
					System.out.println("\nPilha: \n");
					for (String nomeLivro : pilhaDeLivros) {
						System.out.println(nomeLivro);
					}
					System.out.println("\nLivro adicionado!\n");
				}
				break;

			case 2:
				if (pilhaDeLivros.isEmpty()) {
					System.out.println("\nA Pilha está vazia!");
				} else {
					System.out.println("Lista de Livros na Pilha: \n");
					for (String nomeLivro : pilhaDeLivros) {
						System.out.println(nomeLivro);
					}
				}
				break;

			case 3:
				if (pilhaDeLivros.isEmpty()) {
					System.out.println("\nA Pilha está vazia!");

				} else {
					pilhaDeLivros.pop();
					System.out.println("\nPilha :\n");

					for (String nomeLivro : pilhaDeLivros) {
						System.out.println(nomeLivro);

					}
					System.out.println("\nUm Livro foi retirado da Pilha!");
				}
				break;

			case 0:
				System.out.println("Programa finalizado!");
				break;

			default:
				System.out.println("Opcão Inválida");
				break;
			}
		}

		lerScanner.close();

	}

}
