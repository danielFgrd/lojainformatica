package br.edu.com.lojainformatica.model;
import java.util.Date;

public class Vendas {
	private Integer id_venda;
	private Integer id_clientes;
	private Date data;
	private Double vlr_total;
	private Double desconto;
	private Double vrl_pago;
	
	
	public Integer getId_venda() {
		return id_venda;
	}
	public void setId_venda(Integer id_venda) {
		this.id_venda = id_venda;
	}
	public Integer getId_clientes() {
		return id_clientes;
	}
	public void setId_clientes(Integer id_clientes) {
		this.id_clientes = id_clientes;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Double getVlr_total() {
		return vlr_total;
	}
	public void setVlr_total(Double vlr_total) {
		this.vlr_total = vlr_total;
	}
	public Double getDesconto() {
		return desconto;
	}
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	public Double getVrl_pago() {
		return vrl_pago;
	}
	public void setVrl_pago(Double vrl_pago) {
		this.vrl_pago = vrl_pago;
	}
	
	
}
