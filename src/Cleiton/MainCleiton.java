package Cleiton;

import java.util.Scanner;

public class MainCleiton {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		
		System.out.println("Bem vindo ao Detector de Mentira!");
		System.out.println("Digite um nome:");
		String gp = input.nextLine();
		String nome = ("Maikon");
		
		if (gp.equals(nome)) {
			System.out.println("Fala a Verdade!!");
		}
		else {
			System.out.println("Mentiroso Detectado! ");
		}
			
	
	
	}

}
