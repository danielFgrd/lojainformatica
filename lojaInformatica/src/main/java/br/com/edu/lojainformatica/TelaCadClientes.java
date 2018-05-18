package br.com.edu.lojainformatica;

import javax.swing.JLabel;
import javax.swing.JTextField;

//import org.hibernate.Session;

//import br.edu.com.lojainformatica.persistence.HibernateUtil;

//import org.hibernate.Session;
//import br.edu.com.lojainformatica.persistence.*;
//import br.edu.com.lojainformatica.model.*;


public class TelaCadClientes extends TelaCadastro {

	JLabel lblNome = new JLabel("Nome:");
	JTextField txtNome = new JTextField();
	
	JLabel lblEndereco = new JLabel("Endereço:");
	JTextField txtEndereco = new JTextField();
	
	JLabel lblFone = new JLabel("Telefone:");
	JTextField txtFone = new JTextField();
	
	JLabel lblEmail = new JLabel("Email:");
	JTextField txtEmail = new JTextField();
	

	public TelaCadClientes() {
		super(4,2);// quatro linhas e duas colunas
		// Na hora de add os componentes, considerar a ordem deles
		// conforme usamos abaixo
		
		this.painelDeCampos.add(lblNome);
		this.painelDeCampos.add(txtNome);
		
		this.painelDeCampos.add(lblEndereco);
		this.painelDeCampos.add(txtEndereco);
		
		this.painelDeCampos.add(lblFone);
		this.painelDeCampos.add(txtFone);
		
		this.painelDeCampos.add(lblEmail);
		this.painelDeCampos.add(txtEmail);
		
		System.out.println("Terminando de adicionar os campos. add agora acctionListener");
		
	}
	

}
