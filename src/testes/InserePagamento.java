package testes;

import java.sql.SQLException;

import dao.FormaDePagamentoDAO;
import modelo.FormaDePagamento;

public class InserePagamento {

	public static void main(String[] args) throws SQLException {
		FormaDePagamento pagamento = new FormaDePagamento(4,"Deposito Banc�rio",1017);
			
		FormaDePagamentoDAO pagamentoDAO = new FormaDePagamentoDAO();
			pagamentoDAO.insere(pagamento);
}
}
