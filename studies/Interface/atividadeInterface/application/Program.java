package Interface.atividadeInterface.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Interface.atividadeInterface.model.entities.Contract;
import Interface.atividadeInterface.model.entities.Installment;
import Interface.atividadeInterface.model.services.ContractService;
import Interface.atividadeInterface.model.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date contractDate = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		double contractValue = sc.nextDouble();
		Contract contract = new Contract(number, contractDate, contractValue);
		
		System.out.print("Enter number of installments: ");
		int n = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, n);
		
		System.out.println("Installments:");
		for (Installment x : contract.getInstallments()) {
			System.out.println(sdf.format(x.getDueDate()) + " - " + String.format("%.2f", x.getAmount()));
		}
		sc.close();
	}
}
