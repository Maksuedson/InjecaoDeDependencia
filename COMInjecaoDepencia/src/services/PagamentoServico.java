package services;

public class PagamentoServico {
	
	private DeducaoService deducaoService;
	
	public PagamentoServico(DeducaoService deducaoService) {
		this.deducaoService = deducaoService;
	}
	
	public double taxa(double montante) {
		montante = montante - deducaoService.deducao(montante);
		return montante * 0.2;
	}
	

}
