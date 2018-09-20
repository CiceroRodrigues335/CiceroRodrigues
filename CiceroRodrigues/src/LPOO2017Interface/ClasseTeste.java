package LPOO2017Interface;

import java.util.ArrayList;
import java.util.Scanner;

public class ClasseTeste {

	public static void main(String[] args) {
		
		// 3 - Faça um programa que, usando a Classe que armazena com um arrayList
		// forneça o seguinte menu:
		// 1- Adicionar uma nota 2- Remover a ultima nota 3- Calcular a média 4- Mostrar
		// a maior nota tirada
		
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<Interface_aluno> listaArrayList = new ArrayList<>();
		
		int quantNotas;
		
		System.out.println("insira a quantidade de notas");
		quantNotas = (int) entrada.nextInt();
		
		float[] notas = new float[quantNotas];
		
		int opcaoArray = 0;
		
		do {
		
		switch(opcaoArray) {
		
			System.out.println("Digite 1 para criar um Array ou 2 para criar um ArrayList, ou 0 (zero) para sair.");
			opcaoArray = (int) entrada.nextInt();
		
			Implement_Array ImpArray;
			Implement_ArrayList ImpArrayList;
			
			case 1:
				int opcaoMenu = 0;
				do {
					System.out.println("1- Adicionar uma nota; \n2- Remover a ultima nota; \n3- Calcular a média; "
							+ "\n4- Mostrar a maior nota tirada;\n0- Sair;");
					opcaoMenu = (int) entrada.nextInt();
					switch(opcaoMenu) {
					
					case 1: 
						float nota;
						System.out.println("Digite a nota:");
						nota = (float) entrada.nextFloat();
						
						
				}
				}while(opcaoMenu!=0);
		
		}
		}while(opcaoArray!=0);
		entrada.close();
	}
}
