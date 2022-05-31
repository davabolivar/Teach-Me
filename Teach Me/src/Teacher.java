import java.util.Random;

public class Teacher {
	private String name;
	private String status;
	private int yearOfTeaching;
	private int salary;
	private int totalStudent;
	
	public Teacher(String name, String status, int yearOfTeaching) {
		int salary = 0;
		int totalStudent = 0;
		
		this.name = name;
		this.status = status;
		this.yearOfTeaching = yearOfTeaching;
		this.salary = salary;
		this.totalStudent = totalStudent;
		
		Random r = new Random();
		
		totalStudent = r.nextInt(15)+1;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getYearOfTeaching() {
		return yearOfTeaching;
	}

	public void setYearOfTeaching(int yearOfTeaching) {
		this.yearOfTeaching = yearOfTeaching;
	}

	public int getSalary() {
		
		if(status.equals("Part-time")) {
			salary = 15000*totalStudent;
		}else if(status.equals("Full-Time")) {
			if(yearOfTeaching < 2) {
				salary = 30000*totalStudent;
			}else {
				salary = 40000*totalStudent;
			}
		}
		
		return salary;
	}
		

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
		
	
}
