package Interface.atividadeInterface.model.services;

import java.util.Calendar;
import java.util.Date;

import Interface.atividadeInterface.model.entities.Contract;
import Interface.atividadeInterface.model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
		for (int i=1; i<=months; i++) {
			Date dueDate = addMonths(contract.getDate(), i);
			double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
			double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
			contract.addInstallment(new Installment(dueDate, fullQuota));
		}
	}
	
	private Date addMonths(Date source, int n) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(source);
		calendar.add(Calendar.MONTH, n);
		return calendar.getTime();
	}
}
