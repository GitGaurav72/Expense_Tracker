package ServiceImpl;

import java.util.List;

import Dao.ExpenceStrorage;
import Entity.Income;
import Service.incomeService;

public class IncomeServiceImpl implements incomeService{

	@Override
	public void addIncome(Double income, String incomeType) {
	
		Income newIncome = new Income(income, incomeType);
		ExpenceStrorage.incomeList.add(newIncome);
		System.out.println("Income Added successfully! \n"+newIncome.toString());
		
	}

	@Override
	public List<Income> getAllIncome() {
		
		return ExpenceStrorage.incomeList;
		
	}

}
