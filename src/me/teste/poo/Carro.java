package me.teste.poo;

public class Carro extends Veiculo {
	
	private String dono;
	private int passageiros;
	
	public Carro(int velocidade, int rodas, String placa, int gasolina, String dono, int passageiros) {
		super(velocidade, rodas, placa, gasolina, VeiculoType.Carro);
		
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
		
		System.out.println("Velocidade do carro " + this.getVelocidade());
		System.out.println("Rodas do carro " + this.getRodas());
		System.out.println("Placa do carro " + this.getPlaca());
		System.out.println("Gasolina do carro " + this.getGasolina());
		System.out.println("Tipo do veiculo " + this.getType());
		System.out.println("Dono do carro " + this.getDono());
		System.out.println("Passageiros do veiculo " + this.getPassageiros());
		
		
	}

}
