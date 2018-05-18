package br.com.edu.lojainformatica;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadHardware extends TelaCadastro {
	
	JLabel lblDescricao = new JLabel("Descriçao:");
	JTextField txtDecricao = new JTextField();
	
	JLabel lblPrecoUnidade = new JLabel("Preço p/ unidade:");
	JTextField txtPrecoUnidade = new JTextField();
	
	JLabel lblQuantAtual = new JLabel("Quantidade atual:");
	JTextField txtQuantAtual = new JTextField();
	
	JLabel lblQuantMinima = new JLabel("Quandidade mínima:");
	JTextField txtQuantMinima = new JTextField();
	
	
	public TelaCadHardware() {
	super(4,2);	// quatro linhas e duas colunas
	// Na hora de add os componentes, considerar a ordem deles
	// conforme usamos abaixo
	
	this.painelDeCampos.add(lblDescricao);
	this.painelDeCampos.add(txtDecricao);
	
	this.painelDeCampos.add(lblPrecoUnidade);
	this.painelDeCampos.add(txtPrecoUnidade);
	
	this.painelDeCampos.add(lblQuantAtual);
	this.painelDeCampos.add(txtQuantAtual);
	
	this.painelDeCampos.add(lblQuantMinima);
	this.painelDeCampos.add(txtQuantMinima);	
	}

}
