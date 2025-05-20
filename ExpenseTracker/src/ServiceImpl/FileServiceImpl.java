package ServiceImpl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;

import Dao.ExpenceStrorage;
import Entity.Expence;
import Entity.Income;
import Service.fileService;
import Service.incomeService;

public class FileServiceImpl implements fileService {

	@Override
    public void fileProcess(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                if (tokens.length != 3) continue;

                String type = tokens[0].trim().toUpperCase();
                double amount = Double.parseDouble(tokens[1].trim());
                String category = tokens[2].trim();
                
                if (type.equals("INCOME")) {
                	incomeService incomeServiceObj = new IncomeServiceImpl();
                	incomeServiceObj.addIncome(amount, category);
                	
                } else if (type.equals("EXPENSE")) {
                	ExpenceServiceImple expenceServiceObj = new ExpenceServiceImple();
                	expenceServiceObj.addExpence(amount, category);
                } else {
                    System.out.println("Unknown entry type in file: " + line);
                }
            }

            System.out.println("File loaded successfully!");

        } catch (Exception e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
    }
}

