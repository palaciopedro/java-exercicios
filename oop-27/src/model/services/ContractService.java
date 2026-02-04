package model.services;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import model.entites.Contract;
import model.entites.Installment;

public class ContractService {

	private OnlinePaymentService paymentService;
	
	public ContractService(OnlinePaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	public void processContract(Contract contract, int months) {
		double basicInstallment = contract.getTotalValue() / months;
		LocalDate contractDate = contract.getDate();
		
		for (int i = 1; i <= months; i++) {
			double interest = paymentService.interest(basicInstallment, i);
			double paymentFee = paymentService.paymentFee(basicInstallment + interest);
			
			double amount = basicInstallment + interest + paymentFee;
			LocalDate dueDate = contractDate.plus(i, ChronoUnit.MONTHS);
			
			Installment installment = new Installment(dueDate, amount);
			contract.getInstallments().add(installment);
		} 
	}
}
