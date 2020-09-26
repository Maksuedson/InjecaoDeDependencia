package services;

public class MGDeducaoService implements DeducaoService {

	@Override
	public double deducao(double montante) {
		return montante * 0.12;
	}

}
