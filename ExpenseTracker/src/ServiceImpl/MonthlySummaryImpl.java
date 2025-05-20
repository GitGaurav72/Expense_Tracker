package ServiceImpl;

import java.util.List;

import Dao.ExpenceStrorage;
import Entity.Expence;
import Entity.Income;
import Service.monthlySummary;

public class MonthlySummaryImpl implements monthlySummary{

	@Override
	public void getmonthlySummary() {
		
		System.out.println("\nYour Monthly Income Are");
		double totalIncome = 0;
		List<Income> incomeList = ExpenceStrorage.incomeList;
		for(Income  inc : incomeList) {
			System.out.println(inc.toString());
			totalIncome += inc.getIncome();
		}
		System.out.println("\nTotal Income = " + totalIncome);
		
		System.out.println("\n\nYour Monthly Expence Are");
		double totalExpence = 0;
		List<Expence> expenceList = ExpenceStrorage.expenceList;
		for(Expence  exp : expenceList) {
			System.out.println(exp.toString());
			totalExpence += exp.getExpence();
		}
		System.out.println("\nTotal Expence = " + totalExpence);
		
		
		System.out.println("\n\n\nTotal Saving = " + (totalIncome - totalExpence));
	}
	
	

}
