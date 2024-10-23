package br.com.loja.Assistec.controller;

import br.com.loja.Assistec.model.LoginDAO;

public class LoginController {

	public LoginController() {

	}

	// Método para verificar se o banco está online
	public Boolean verificarBancoOnline() {
		LoginDAO dao = new LoginDAO();
		return dao.bancoOnline();

	}

}
