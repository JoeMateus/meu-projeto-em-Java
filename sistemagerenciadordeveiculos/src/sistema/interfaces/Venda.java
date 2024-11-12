package sistema.interfaces;

public class Venda {

	private Veiculo veiculos;
	private Vendedor vendedor;
	private Cliente cliente;
	private String data;

	public Venda() {
	}

	public Venda(Veiculo veiculos, Vendedor vendedor, Cliente cliente, String data) {
		super();
		this.veiculos = veiculos;
		this.vendedor = vendedor;
		this.cliente = cliente;
		this.data = data;
	}

	public Veiculo getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(Veiculo veiculos) {
		this.veiculos = veiculos;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
