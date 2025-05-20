package Service;

import java.util.List;

import Entity.Expence;

public interface expenceService {

	public void addExpence(Double expence, String expenceType);
	public List<Expence> getAllExpence();
}
