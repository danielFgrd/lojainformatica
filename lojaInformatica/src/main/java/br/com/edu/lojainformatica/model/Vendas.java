package br.com.edu.lojainformatica.model;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table (name="tbVenda")
public class Vendas {
	private Integer id_venda;
	private Integer id_hardware;
	private Integer id_clientes;
	private Date data;
	private Double vlr_total;
	private Double desconto;
	private Double vrl_pago;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_venda() {
		return id_venda;
	}
	public void setId_venda(Integer id_venda) {
		this.id_venda = id_venda;
	}
	
	@Id
	public Integer getId_clientes() {
		return id_clientes;
	}
	public void setId_clientes(Integer id_clientes) {
		this.id_clientes = id_clientes;
	}
	
	@Id
	public Integer getId_hardware() {
		return id_hardware;
	}
	public void setId_hardware(Integer id_hardware) {
		this.id_hardware = id_hardware;
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
