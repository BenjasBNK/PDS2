package br.com.loja.Assistec.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class CadastrarUsuarioView extends JFrame {

	private JPanel contentPane;
	private JTextField textLogin;
	private JTextField textFone;
	private JTextField textNome;
	private JPasswordField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarUsuarioView frame = new CadastrarUsuarioView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastrarUsuarioView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Cadastro de usuarios");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!"".equalsIgnoreCase(new String(textSenha.getPassword()))) {
					
				}
					
			}
		});
		panel_1.add(btnIncluir);
		
		JButton btnExcluir = new JButton("Excluir");
		panel_1.add(btnExcluir);
		
		JButton btnFechar = new JButton("Fechar");
		panel_1.add(btnFechar);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(0, 2, 6, 0));
		
		JLabel lblNome = new JLabel("Nome");
		panel_2.add(lblNome);
		
		textNome = new JTextField();
		panel_2.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblFone = new JLabel("Fone");
		panel_2.add(lblFone);
		
		textFone = new JTextField();
		panel_2.add(textFone);
		textFone.setColumns(10);
		
		JLabel lblLogin = new JLabel("Login");
		panel_2.add(lblLogin);
		
		textLogin = new JTextField();
		panel_2.add(textLogin);
		textLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		panel_2.add(lblSenha);
		
		textSenha = new JPasswordField();
		panel_2.add(textSenha);
		
		JLabel lblPerfil = new JLabel("Perfil");
		panel_2.add(lblPerfil);
		
		JComboBox cbPefil = new JComboBox();
		panel_2.add(cbPefil);
		
		JLabel lblNewLabel_1 = new JLabel("");
		panel_2.add(lblNewLabel_1);
	}

}
