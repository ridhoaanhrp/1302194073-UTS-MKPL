package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee{

	public Family family;
	public EmployeeSalary salary;

	private String employeeId;
	private String firstName;
    private String lastName;
    private String address;
	
	private LocalDate dateJoined;
	private int monthWorkingInYear;
	
	private boolean isForeigner;
	private enum Gender{
		laki_laki,
		perempuan
	};
	
	private Gender gender;//true = Laki-laki, false = Perempuan
	
	
	
	public Employee(String firstName, String lastName,String employeeId,String address, boolean isForeigner, Gender gender) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.isForeigner = isForeigner;	
		this.gender = gender;	
	}

	public String getEmployeeId(){
		return employeeId;
	}

	public boolean getForeigner(){
		return isForeigner;
	}
	public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getAddress(){
        return address;
    }
	public Gender getGender(){
		return gender;
	}
	
	/**
	 * Fungsi untuk menentukan gaji bulanan pegawai berdasarkan grade kepegawaiannya (grade 1: 3.000.000 per bulan, grade 2: 5.000.000 per bulan, grade 3: 7.000.000 per bulan)
	 * Jika pegawai adalah warga negara asing gaji bulanan diperbesar sebanyak 50%
	 */
	
	
	
	public int getAnnualIncomeTax() {
		
		//Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
		LocalDate date = LocalDate.now();
		
		if (date  == dateJoined) {
			monthWorkingInYear = date.getMonthValue() - dateJoined.getMonthValue();
		}else {
			monthWorkingInYear = 12;
		}
		
		return TaxFunction.calculateTax(salary.getMonthSalary(), salary.getAddtionalIncome(), monthWorkingInYear, salary.getAnnualDeductible(), family.getSpouseNumber().equals(""), family.getChildIdNumber().size());
	}
}
