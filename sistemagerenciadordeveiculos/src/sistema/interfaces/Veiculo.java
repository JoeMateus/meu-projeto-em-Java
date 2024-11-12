package sistema.interfaces;

public class Veiculo {

	private String marca;
	private String modelo;
	private int ano;
	private String placa;
	private double valor;
	private TipodeVeiculo tipo;

	public Veiculo(String marca, String modelo, int ano, String placa, double valor, TipodeVeiculo tipo) {

		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
		this.valor = valor;
		this.tipo = tipo;

	}

	public TipodeVeiculo getTipo() {
		return tipo;
	}

	public void setTipo(TipodeVeiculo tipo) {
		this.tipo = tipo;
	}

	public Veiculo() {
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
