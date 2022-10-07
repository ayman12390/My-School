package school.ayman;

import java.util.ArrayList;
import java.util.Scanner;
public class Teacher {

	public Scanner input = new Scanner(System.in);
	
	private ArrayList<String> name_teacher = new ArrayList<>();
	private int salary;
	
	public Teacher() {
		
		this.salary = 0;
	}
	
	public Teacher(int sa) {
		
		this.salary = sa;
	}
	
	public void addTeacher() { // add a teacher 
		System.out.print("Enter name the teacher : ");
		this.name_teacher.add(this.input.next());
		
		System.out.print("Enter salary the teacher : ");
		this.setSalaryTeacher(input.nextInt());
		
		System.out.println(" ");
	}
	
	public void printAllTeacher() {
		// هذا الدالة تعرض جميع الطلاب الذي تم تسجيلهم
		// this.name_teacher : ArrayList هذا متغير من نوع  
		 // size : هي دالة وظيفتها عرض المحتوى
		System.out.println("In schoole ther are " + this.name_teacher.size() + " teacher");
	}
	
	public void deleteTeacher() {
		
	}
	
	public void setSalaryTeacher(int sal) {
		this.salary = sal;
	}
	
	public int getSalaryTeacher() {
		return this.salary;
	}
	
	
	
}
