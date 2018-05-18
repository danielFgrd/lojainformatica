package br.com.edu.lojainformatica;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadVendas extends TelaCadastro {
	
	JLabel lblIdCliente = new  JLabel("ID Cliente:");
	JTextField txtIdCliente = new JTextField();
	
	JLabel lblIdVenda = new  JLabel("ID Veda:");
	JTextField txtIdVenda = new JTextField();
	
	JLabel lblData = new  JLabel("Data:");	
	JTextField txtData = new JTextField();
	
	JLabel lblValorTotal = new  JLabel("Valor total:");
	JTextField txtValorTotal = new JTextField();
	
	JLabel lblDesconto = new  JLabel("Desconto:");
	JTextField txtDesconto = new JTextField();
	
	JLabel lblValorPago = new  JLabel("Valor Pago:");
	JTextField txtValorPago = new JTextField();

	
	
	
	public TelaCadVendas() {
		super(12,2);
		
		this.painelDeCampos.add(lblIdCliente);
		this.painelDeCampos.add(txtIdCliente);
				
		this.painelDeCampos.add(lblIdVenda);
		this.painelDeCampos.add(txtIdVenda);
		
		this.painelDeCampos.add(lblData);
		this.painelDeCampos.add(txtData);
		
		this.painelDeCampos.add(lblValorTotal);
		this.painelDeCampos.add(txtValorTotal);
		
		this.painelDeCampos.add(lblDesconto);
		this.painelDeCampos.add(txtDesconto);
		
		this.painelDeCampos.add(lblValorPago);
		this.painelDeCampos.add(txtValorPago);
			
	}

}
