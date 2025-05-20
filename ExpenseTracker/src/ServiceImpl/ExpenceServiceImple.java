package ServiceImpl;

import java.lang.reflect.Executable;
import java.util.List;

import Dao.ExpenceStrorage;
import Entity.Expence;
import Service.expenceService;

public class ExpenceServiceImple implements expenceService{

	@Override
	public void addExpence(Double expence, String expenceType) {
		
		Expence newExpence = new Expence(expence,expenceType);
		ExpenceStrorage.expenceList.add(newExpence);
		System.out.println("Expence Added successfully! \n"+   newExpence.toString());
	}

	@Override
	public List<Expence> getAllExpence() {
		
		return ExpenceStrorage.expenceList;
	}

}
