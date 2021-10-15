package br.senai.sp.jandira.tela;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Tela {
	
	public void criarTela() {        
	
	JFrame telaFrame = new JFrame();
	telaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	telaFrame.setSize(600, 800);
	telaFrame.setTitle("Nome do app");
	telaFrame.setSize(600, 800);
	telaFrame.setLayout(null);
	
	
	//criar label
	JLabel lblNome = new JLabel();
	lblNome.setText("Digite seu nome?");
	lblNome.setBounds(10, 10, 150, 30);
	
	JTextField txtNome = new JTextField();
	txtNome.setBounds(10, 45, 100, 30);
	
	
	//criar um botao
	JButton btnOk = new JButton();
	btnOk.setText("Ok");
	btnOk.setBounds(115, 45, 50, 30);
	
	//
	JLabel lblCumprimento = new JLabel();
	lblCumprimento.setText("Aqui vai o resultado");
	lblCumprimento.setBounds(10, 80, 150, 30);
	
	//eventos do botao
	btnOk.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			String nome = txtNome.getText();
			//lblCumprimento.setText("Olá " + nome + "!");
			
			int valor = Integer.parseInt(nome);
			int resultado = valor * 15;
			
			lblCumprimento.setText(String.valueOf(resultado));
			
		}
	});
	
	
	//colocar o label na tela
	telaFrame.getContentPane().add(lblNome);
	telaFrame.getContentPane().add(txtNome);
	telaFrame.getContentPane().add(btnOk);
	telaFrame.getContentPane().add(lblCumprimento);
	
	
	
	
	
	
	    telaFrame.setVisible(true);		
	

}

}
