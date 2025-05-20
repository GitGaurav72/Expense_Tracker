package Service;

import java.util.List;

import Entity.Income;

public interface incomeService {
	
	public void addIncome(Double income, String incomeType);
	public List<Income> getAllIncome();

}
