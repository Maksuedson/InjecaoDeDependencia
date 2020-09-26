package app;

import services.MGDeducaoServico;
import services.PagamentoServico;

public class App {

	public static void main(String[] args) {
		
		PagamentoServico pagamento = new PagamentoServico(new MGDeducaoServico());
		
		double taxa = pagamento.taxa(3000);
		System.out.println(taxa);

	}

}
