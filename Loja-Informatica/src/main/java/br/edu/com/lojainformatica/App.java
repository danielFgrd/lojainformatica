package br.edu.com.lojainformatica;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;


import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import org.hibernate.SessionFactory;

import br.edu.com.lojainformatica.model.Cliente;
import br.edu.com.lojainformatica.persistence.*;


public class App extends JFrame {
	
	TelaCadastro telaCadClientes = new TelaCadClientes();
	TelaCadastro telaCadHardware = new TelaCadHardware();
	TelaCadastro telaCadVendas = new TelaCadVendas();
	
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem menuItem;

	public App() {
		this.setVisible(true);
		this.setSize(800, 600);
		// https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html#border
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		configuraMenu();
		this.pack();
	}
	
	
	private void configuraMenu() {
		this.menuBar = new JMenuBar();
		
		JMenu menuCadastro = new JMenu("CADASTRO");
		
		JMenuItem menuItemClientes = new JMenuItem("Clientes");
		
		menuItemClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("menuClieActionPerformed");
				
				App.this.telaCadHardware.setVisible(false);
				App.this.telaCadClientes.setVisible(true);
				App.this.telaCadVendas.setVisible(false);
				
				App.this.getContentPane().add(App.this.telaCadClientes, BorderLayout.CENTER);
				
				App.this.pack();
			}
						
		});
		
		JMenuItem menuItemHardware = new JMenuItem("Hardware");//cria um botão no menu
		
		menuItemHardware.addActionListener(new ActionListener() {//inicia um evento nesse botão
			public void actionPerformed(ActionEvent e) {
				System.out.println("menuHardwareActionPerformed");
				
				App.this.telaCadClientes.setVisible(false);
				App.this.telaCadHardware.setVisible(true);
				App.this.telaCadVendas.setVisible(false);
				
				App.this.getContentPane().add(telaCadHardware, BorderLayout.CENTER);
				
				App.this.pack();
				
			}
		});
		
		JMenuItem menuItemVendas = new JMenuItem("Vendas");
		
		menuItemVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			System.out.println("menuItemVendasActionPerformed");
			
			App.this.telaCadClientes.setVisible(false);
			App.this.telaCadHardware.setVisible(false);
			App.this.telaCadVendas.setVisible(true);
			
			App.this.getContentPane().add(telaCadVendas, BorderLayout.CENTER);
		
			App.this.pack();
			}
		});
		
		menuCadastro.add(menuItemHardware);
		menuCadastro.add(menuItemClientes);
		menuCadastro.add(menuItemVendas);
		
		JMenu menuCli = new JMenu("Clientes");
		JMenu menuHard = new JMenu("Hardware");
		JMenu menuVend = new JMenu("Vendas");
		
		
		this.menuBar.add(menuCadastro);
		
		
		
		this.getContentPane().add(menuBar, BorderLayout.NORTH);
		this.pack();
		//adicionando mains telas ao App.java(principal)
	}
	
	
	public static void main(String[] args) {
		//App app = new App();
		
//		Cliente cli = new Cliente();
		
	//	cli.setNome("Niel");
//		cli.setEmail("meu email.com");
	//	cli.setEndereco("rua tamambá");
		
	//	Session session = HibernateUtil.getSessionFactory().openSession();
		
//		session.beginTransaction();
		
	//	session.save(cli);
		
	//	session.getTransaction().commit();
		
		
		
	}

	
	

	
	

}
