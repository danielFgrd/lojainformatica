package br.com.edu.lojainformatica;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;

import java.awt.BorderLayout;
import java.awt.GridLayout;

public abstract class TelaCadastro extends JPanel{
	
	JPanel painelDeBotoes = new JPanel();
	JPanel painelDeCampos = new JPanel();
	JPanel painelDeListagem = new JPanel();
	JButton btnSalvar = new JButton("Salvar");
	JButton btnLimpar = new JButton("Limpar");
	JButton btnCancelar = new JButton("Cancelar");
	JButton btnListar = new JButton("Listar");
	JButton btnAlterar = new JButton("Alterar");
	JTextField txtId = new JTextField("Digite o Id pra alterar");
	JList <String>list;
	

	public TelaCadastro(int nLinhas, int nColunas) {
		
		//https://docs.oracle.com/javase/tutorial/uiswing/layout/layoutlist.html
		//https://docs.oracle.com/javase/tutorial/uiswing/layout/border.html
		BorderLayout borderLayout = new BorderLayout();
		this.setLayout(borderLayout);
		
		//PAINEL PARA CAMPOS DO FORMULARIO
		//https://docs.oracle.com/javase/tutorial/uiswing/layout/grid.html
		GridLayout gridLayoutParaCampos = new GridLayout(nLinhas, nColunas);
		painelDeCampos.setLayout(gridLayoutParaCampos);
		this.add(painelDeCampos, BorderLayout.CENTER);
		
		//PAINEL DE BOTOES
		this.painelDeBotoes = new JPanel();
		this.btnLimpar = new JButton("Limpar");
		this.btnCancelar = new JButton("Cancelar");
		this.btnSalvar = new JButton("Salvar");
		this.painelDeBotoes.add(btnAlterar);
		this.painelDeBotoes.add(btnCancelar);
		this.painelDeBotoes.add(btnLimpar);
		this.painelDeBotoes.add(btnListar);
		this.painelDeBotoes.add(btnSalvar);
		this.painelDeBotoes.add(txtId);
		
		this.add(painelDeBotoes,BorderLayout.SOUTH);
		
		//PAINEL PARA LISTAGEM
		list = new JList <String>();
		this.painelDeListagem.add(list);
		this.add(painelDeListagem,BorderLayout.EAST);
		
	}
}
