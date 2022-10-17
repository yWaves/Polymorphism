package me.teste.manager;

import java.util.ArrayList;
import java.util.List;

import me.teste.poo.Caminhao;
import me.teste.poo.Carro;
import me.teste.poo.Veiculo;
import me.teste.poo.VeiculoType;

public class ControlarArmazenamento {
	
	private List<Veiculo> veiculos = new ArrayList<>();
	public List<Veiculo> getVeiculo() {
		return veiculos;
	}
	
	public void addVeiculoCarro(Carro car) {
		getVeiculo().add(car);
	}
	
	public void addVeiculoCaminhao(Caminhao caminhao) {
		getVeiculo().add(caminhao);
	}
	
	public Carro getCarroByDono(String dono) {
		
		for (Veiculo v : getVeiculo()) {
			
			if (v.getType() == VeiculoType.Carro) {
				Carro c = (Carro) v;
				if (c.getDono().equalsIgnoreCase(dono))
				    return c;
			}
			
		}
		
		return null;
		
	}
	
	public Caminhao getCaminhaoByDono(String dono) {
		
		for (Veiculo v : getVeiculo()) {
			
			if (v.getType() == VeiculoType.Caminhao) {
				Caminhao c = (Caminhao) v;
				if (c.getDono().equalsIgnoreCase(dono))
				    return c;
			}
			
		}
		
		return null;
		
	}

}
