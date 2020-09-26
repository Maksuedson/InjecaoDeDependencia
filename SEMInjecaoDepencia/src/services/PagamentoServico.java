package services;

public class PagamentoServico {
	
	private DeducaoService deducaoService = new MGDeducaoService();
	
	public double taxa(double montante) {
		montante = montante - deducaoService.deducao(montante);
		return montante * 0.2;
	}

}
