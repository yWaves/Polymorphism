package me.teste.poo;

public class Caminhao extends Veiculo {

	private String dono;
	private int passageiros;
	
	public Caminhao(int velocidade, int rodas, String placa, int gasolina, String dono, int passageiros) {
		super(velocidade, rodas, placa, gasolina, VeiculoType.Caminhao);
		this.dono = dono;
		this.passageiros = passageiros;
	}
	
	public String getDono() {
		return dono;
	}
	
	public int getPassageiros() {
		return passageiros;
	}

	@Override
	public void teste() {
		
		System.out.println("Velocidade do caminhao " + this.getVelocidade());
		System.out.println("Rodas do caminhao " + this.getRodas());
		System.out.println("Placa do caminhao " + this.getPlaca());
		System.out.println("Gasolina do caminhao " + this.getGasolina());
		System.out.println("Tipo do veiculo " + this.getType());
		System.out.println("Dono do caminhao " + this.getDono());
		System.out.println("Passageiros do veiculo " + this.getPassageiros());
		
		
	}

}
