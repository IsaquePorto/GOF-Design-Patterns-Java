package ExQuestao1;

public class ContaPoupanša extends Conta{

	@Override
	public double calculaTaxa(double montante) {
		
		return montante * 0.02;
	}

}
