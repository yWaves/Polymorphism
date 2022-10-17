package me.teste.manager;

import me.teste.poo.Caminhao;
import me.teste.poo.Carro;

public class Main {
	
	private static ControlarArmazenamento ca = new ControlarArmazenamento();
	
	public static void main(String[] args) {
		
		Carro carro = new Carro(300, 4, "ASR-8956", 500, "Richard", 1);
		ca.addVeiculoCarro(carro);
		
		Caminhao caminhao = new Caminhao(150, 6, "AER-8791", 1000, "Jo�o", 1);
		ca.addVeiculoCaminhao(caminhao);

		Caminhao c = ca.getCaminhaoByDono("Jo�o");
		if (c == null) {
			System.out.println("N�o existe um caminh�o com esse dono!");
		} else {
			c.teste();
		}
		
		System.out.println(" ");
		System.out.println(" ---------------- ");
		System.out.println(" ");
		
		Carro c1 = ca.getCarroByDono("Richard");
		if (c1 == null) {
			System.out.println("N�o existe um carro com esse dono!");
		} else {
			c1.teste();
		}
		
	}

}
