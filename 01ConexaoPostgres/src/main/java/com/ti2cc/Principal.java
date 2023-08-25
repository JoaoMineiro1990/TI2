package com.ti2cc;

import com.ti2cc.Canetas.java;

public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();
		
		//Inserir um elemento na tabela
		Canetas caneta = new Canetas("vermelho", "gigantesca","lazer");
		if(dao.inserirCaneta(caneta) == true) {
			System.out.println("Inserção com sucesso -> " + caneta.toString());
		}

		//Atualizar usuário
		caneta.setTipo("magica");
		dao.atualizarCaneta(caneta);
		
		//Excluir usuário
		dao.excluirCaneta(caneta.getTampa());
		
		//Mostrar usuários
		canetas = dao.getCaneta();
		System.out.println("==== Mostrar Canetas === ");		
		for(int i = 0; i < canetas.length; i++) {
			System.out.println(canetas[i].toString());
		}
		
		dao.close();
	}
}