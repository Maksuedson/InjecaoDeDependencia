package services;

public class MGDeducaoServico implements DeducaoService{

	@Override
	public double deducao(double montante) {
		return montante * 0.17;
	}
	

}
