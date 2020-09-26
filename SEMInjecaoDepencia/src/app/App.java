package app;

import services.PagamentoServico;

public class App {

	public static void main(String[] args) {
		
		PagamentoServico pagamento = new PagamentoServico();
		
		double taxa = pagamento.taxa(2000);
		System.out.println(taxa);
		
	}

}
