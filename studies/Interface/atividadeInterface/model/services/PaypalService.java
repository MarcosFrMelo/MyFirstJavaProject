package Interface.atividadeInterface.model.services;

public class PaypalService implements OnlinePaymentService {

	private static final double INTEREST_RATE = 1.0;
	private static final double FEE_PERCENTAGE = 2.0;
	
	@Override
	public double getInterestRate() {
		return INTEREST_RATE;
	}

	@Override
	public double getFeePercentage() {
		return FEE_PERCENTAGE;
	}
}
