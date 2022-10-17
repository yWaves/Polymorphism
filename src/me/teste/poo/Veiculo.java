package me.teste.poo;

public abstract class Veiculo {
	
	private int velocidade, rodas;
	private String placa;
	private int gasolina;
	private VeiculoType type;
	
	public Veiculo(int velocidade, int rodas, String placa, int gasolina, VeiculoType type) {
		this.velocidade = velocidade;
		this.rodas = rodas;
		this.placa = placa;
		this.gasolina = gasolina;
		this.type = type;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public int getRodas() {
		return rodas;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public int getGasolina() {
		return gasolina;
	}
	
	public VeiculoType getType() {
		return type;
	}
	
	public abstract void teste();
	
}
