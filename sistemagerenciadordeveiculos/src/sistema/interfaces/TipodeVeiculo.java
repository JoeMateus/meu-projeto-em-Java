package sistema.interfaces;

public class TipodeVeiculo {

	private String categoria;
	private String descricao;

	public TipodeVeiculo() {
	}

	public TipodeVeiculo(String categoria, String descricao) {
		super();
		this.categoria = categoria;
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
