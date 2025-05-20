import java.security.Provider.Service;
import java.util.Scanner;

import Service.expenceService;
import Service.fileService;
import Service.incomeService;
import Service.monthlySummary;
import ServiceImpl.ExpenceServiceImple;
import ServiceImpl.FileServiceImpl;
import ServiceImpl.IncomeServiceImpl;
import ServiceImpl.MonthlySummaryImpl;

public class ExpenceTracker {

	public static void main(String[] args) {
	
		System.out.println("-------------------------- Welcome To Expence Tracker --------------------------");
		 Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nSelect Your Option");
	            System.out.println("1. Add new Income");
	            System.out.println("2. Add new Expense");
	            System.out.println("3. Get monthly summary");
	            System.out.println("4. Add Expense From File");
	            System.out.println("5. Exit From Application");

	            int option = sc.nextInt();

	            switch (option) {
	                case 1: {
	                    System.out.println("\nAdd New Income selected ");
	                    System.out.println("\nSelect Income Type");
	                    System.out.println("1. Salary");
	                    System.out.println("2. Business");
	                    int subOption = sc.nextInt();
	                    String incomeType = subOption == 1 ? "Salary" : "Business";
	                    System.out.println("\nAdd Income Amount");
	                    double income = sc.nextDouble();
	                    incomeService incomeServiceObj = new IncomeServiceImpl();
	                    incomeServiceObj.addIncome(income, incomeType);
	                    break;
	                }
	                case 2: {
	                   
	                    System.out.println("\nAdd New Expense selected");
	                    System.out.println("\nSelect Expence Type");
	                    System.out.println("1. Food");
	                    System.out.println("2. Rent");
	                    System.out.println("3. Travel");
	                    int subOption = sc.nextInt();
	                    String expenceType = subOption == 1 ? "Food" : subOption == 2 ? "Rent" : "Travel";
	                    System.out.println("\nAdd Expence Amount");
	                    double expence = sc.nextDouble();
	                    expenceService expenceServiceObj = new ExpenceServiceImple();
	                    expenceServiceObj.addExpence(expence, expenceType);
	                    break;
	                }
	                case 3: {
	                   
	                    System.out.println("\n Monthly Summary selected");
	                    monthlySummary monthlySummaryObj = new MonthlySummaryImpl();
	                    monthlySummaryObj.getmonthlySummary();
	                    break;
	                }
	                case 4: {
	                   
	                    System.out.println("\nAdd Expense From File selected");
	                    System.out.print("\nEnter the path of the income/expense file: ");
	                    sc.nextLine(); // clear the newline
	                    String filePath = sc.nextLine();
	                    fileService fileServiceObj = new FileServiceImpl();
	                    fileServiceObj.fileProcess(filePath);
	                    break;
	                }
	                case 5: {
	                   
	                    System.out.println("Exiting application...");
	                    System.out.println("-------------------------- Thank you for Visiting !--------------------------");
	                    sc.close(); 
	                    System.exit(0);
	                    break;
	                }
	                default: {
	                    System.out.println("Invalid option. Please try again.");
	                    break;
	                }
	            }
	        }
		
	 }

}
