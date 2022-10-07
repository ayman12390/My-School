package school.ayman;

import java.util.ArrayList;

import java.util.Scanner;

public class Student {
    
	public Scanner input = new Scanner(System.in);
	
	private ArrayList<String> name_stu = new ArrayList<>();
	
	private int age;
	private int grade_stu;
	public String delete_stu;
	
	
	public Student() {
		
		this.age =  0;
		
	}
	
	/* 
	 * n : Name student
	 * a : Age 
	 * p : Number phone father
	 */
	public Student(String n, int a, int p) { 
		
		this.age = a;
	}
	
	public void addStudent() {
	
		System.out.print("Enter the name student : ");
		name_stu.add(this.input.next()); 
		
		System.out.print("Enter age the student : ");
		this.setAge(this.input.nextInt());
		
		System.out.print("Enter the grade student :  ");
		this.setGrade(input.nextInt());

		System.out.println(" ");
	}
	
	public void printAllStudent() { 
		
		System.out.println("In school there are " + this.name_stu.size() + " student");
		System.out.println(this.name_stu); // طباعة جميع الطلاب المسجلين
		System.out.println(" ");
	}
	
	public void deleteStudent() {
		System.out.println(this.name_stu.get(0));
		System.out.println("If you want delete studnet  click (yes) or (no)");
		this.delete_stu = input.next();
		
		switch(this.delete_stu) {
		case "yes" :System.out.println(this.name_stu.size());
		System.out.println(this.name_stu.removeAll(name_stu));
			break;
		case "no" : 
			break;
		}
		
		
		
	}
		
	public String setName(ArrayList<String> list) {
		return list.get(0);
	}
	
	public void setAge(int a) {
		this.age = a;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setGrade(int gr) {
		this.grade_stu = gr;
	}
	
	public int getGrade() {
		return this.grade_stu;
	}
	
	
}