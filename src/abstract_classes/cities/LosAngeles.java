package abstract_classes.cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		double tax = growthRate*population*0.5*growthRate;
		
		System.out.println(tax);
		return tax;
	}

}
