package Interface.atividadeInterface.model.services;

public interface OnlinePaymentService {

	double getInterestRate();
	double getFeePercentage();

	default double paymentFee(double amount) {
		return amount * getFeePercentage() / 100.0;
	}
	
	default double interest(double amount, int months) {
		return amount * getInterestRate() / 100.0 * months;
	}
}
