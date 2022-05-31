
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Teacher> teacherList = new ArrayList<>();

	public static void showMenu() {
		System.out.println("Teach Me!");
		System.out.println("1. View");
		System.out.println("2. Add");
		System.out.println("3. Delete");
		System.out.println("4. Exit");
		System.out.print(">>");
	}
	
//	public classes addclasses() {
//		String className = "";
//		int numberOfStudent = 0;
//		
//		do {
//			System.out.println("Pick teacher to be added additional class");
//		} while(Teacher() < 0 ); 
//			
//	}
	
	
	public void addTeacher() {
		String name = null;
		String status = null;
		int yearOfTeaching = 0;
		
		do {
			System.out.print("Input teacher's name [Min 2 Words]: ");
			name =sc.nextLine();
			
		} while(name.length() < 3 || name.length() > 25); // blom jadi
		
		do {
			System.out.print("Input teacher's status [Part-time | Full-time]: ");
			status =sc.nextLine();
			
		} while(status.equals("Part-time") && status.equals("Full-time")); 
		
		do {
			System.out.print("Input how long has the teacher teached [at least 1 year]: ");
			yearOfTeaching = sc.nextInt();
			
		} while(yearOfTeaching > 0); 
		
		Teacher t = new Teacher(name, status, yearOfTeaching);
		teacherList.add(t);
		
	}	
	
	public void viewTeacher() {
		if(teacherList.isEmpty()) {
			System.out.println("No teacher yet!");
		} else {
			System.out.println("No. | Name | Year | Status");
			
			for(int i = 0; i<teacherList.size(); i++) {
				System.out.printf("%d %s %d %s", i+1, teacherList.get(i).getName()
						, teacherList.get(i).getYearOfTeaching(), teacherList.get(i).getStatus());
			}
		}
	}
	
	public void addClasses() {
		
		int i;
		int input = 0;
		String className;
		
		if(teacherList.isEmpty()) {
			System.out.println("No teacher yet");
		}else {
			System.out.println("No. | Name | Year | Status");
			
			for(i = 0; i<teacherList.size(); i++) {
				System.out.printf("%d %s %d %s", i+1, teacherList.get(i).getName()
						, teacherList.get(i).getYearOfTeaching(), teacherList.get(i).getStatus());
			}
		
			
			
			do {
				System.out.print("Pick the teacher to be added additional class [1 - " + i + "]");
				input = sc.nextInt();
				sc.nextLine();
			}while(input == i);
			
			do {
				System.out.print("Input class name [length 5-20]");
				className = sc.nextLine();
			}while(className.length() < 5 || className.length() > 20);
			
		}
	}
	
	public void addTeacherAndClass() {
		
		Scanner sc = new Scanner(System.in);
		
		int input = -1;
		
		do { 
			System.out.println("1. Add Teacher");
			System.out.println("2. Add Class");
			System.out.print(">>");
				
			try {
				input = sc.nextInt();
			} catch (Exception e) {
				input = -1;
			}
			sc.nextLine(); 
		}while(input < 1 && input > 2);
			
			if(input == 1) {
				addTeacher();
			} else if (input == 2) {
				addClasses();
			}
	}
	
	public void removeTeacher() {
		if (teacherList.isEmpty()) {
			System.out.println("No teacher yet");
		} else{
			viewTeacher();
			
			Scanner sc = new Scanner(System.in);
			int index = -1;
			do {
				index = sc.nextInt();
			}while (index < 1 && index-1 > teacherList.size());
			
			teacherList.remove(index);
			
		}
	}
	
	public Main() {
			
		int input = -1;
		
	
			do {
				showMenu();
				
				input = sc.nextInt();
				if(input == 1) {
					viewTeacher();
				} else if (input == 2) {
					addTeacherAndClass();
				} else if (input == 3){
					removeTeacher();
				} 
	
				sc.nextLine(); //buat enter
				
			}while(input != 4);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
