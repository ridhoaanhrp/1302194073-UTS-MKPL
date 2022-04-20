package lib;

public class EmployeeSalary extends Employee{

    private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;

    public EmployeeSalary(Employee employee){
        super(employee.getFirstName(), employee.getLastName(), employee.getEmployeeId(), employee.getAddress(), employee.getForeigner(), employee.getGender());
    }

    public void setMonthlySalary(int grade) {	
		if (grade == 1) {
			monthlySalary = 3000000;
			foreignerSalary(monthlySalary);
		}else if (grade == 2) {
			monthlySalary = 5000000;
			foreignerSalary(monthlySalary);
		}else if (grade == 3) {
			monthlySalary = 7000000;
			foreignerSalary(monthlySalary);
		}
	}

    public int getMonthSalary(){
        return monthlySalary;
    }

    public void foreignerSalary(int monthlySalary){
        double percent = monthlySalary * 1.5;

        if(super.getForeigner()){
            monthlySalary = (int) (monthlySalary + percent);
        }
    }
	
	public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
	}
	
	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
	}

    public int getAnnualDeductible(){
        return annualDeductible;
    }

    public int getAddtionalIncome(){
        return otherMonthlyIncome;
    }
}
