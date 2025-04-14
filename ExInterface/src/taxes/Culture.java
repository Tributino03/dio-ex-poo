package taxes;

public record Culture(double value) implements Products{

	@Override
	public void amountOfTaxes() {
		System.out.println("The value of taxes this product is: $ " + value * 0.04);	
	}

}
