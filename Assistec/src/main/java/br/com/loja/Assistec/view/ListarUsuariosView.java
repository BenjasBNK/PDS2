package br.com.loja.Assistec.view;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableRowSorter;

import br.com.loja.Assistec.model.Usuario;
import br.com.loja.Assistec.model.UsuarioTableModel;

public class ListarUsuariosView extends JFrame {

	private JPanel contentPane;
	private JTextField txtLocalizar;
	private JScrollPane scrollPane;
	private JTable tabela;
	private ArrayList<Usuario> usuariosList;
	private ListarUsuariosView listarUsuariosView;
	private UsuarioTableModel usuarioTableModel;
//	private TableRowSorter<UsuarioTableModel> rowSorter;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarUsuariosView frame = new ListarUsuariosView();
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
	public ListarUsuariosView() {
		this.listarUsuariosView = this;
		usuariosList = new ArrayList<>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(10, 11, 89, 23);
		contentPane.add(btnCadastrar);
		
		txtLocalizar = new JTextField();
		txtLocalizar.setBounds(109, 12, 315, 20);
		contentPane.add(txtLocalizar);
		txtLocalizar.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 43, 414, 143);
		contentPane.add(scrollPane);
		
		tabela = new JTable();
		scrollPane.setViewportView(tabela);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(177, 198, 89, 23);
		contentPane.add(btnFechar);
	}
}
