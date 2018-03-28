package br.edu.com.lojainformatica.model;

public class Hardware {
	private Integer id_Hardware;
	private String descricao;
	private double preco_unit;
	private int quant_atual;
	private int quant_minima;
	
	public Integer getId_Hardware() {
		return id_Hardware;
	}
	public void setId_Hardware(Integer id_Hardware) {
		this.id_Hardware = id_Hardware;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco_unit() {
		return preco_unit;
	}
	public void setPreco_unit(double preco_unit) {
		this.preco_unit = preco_unit;
	}
	public int getQuant_atual() {
		return quant_atual;
	}
	public void setQuant_atual(int quant_atual) {
		this.quant_atual = quant_atual;
	}
	public int getQuant_minima() {
		return quant_minima;
	}
	public void setQuant_minima(int quant_minima) {
		this.quant_minima = quant_minima;
	}

}
