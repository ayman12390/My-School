
package school.ayman;

import java.util.Scanner;

public class School {

	
	public Scanner input = new Scanner(System.in);
	public Student student = new Student(); // Class Student
	public Teacher teacher = new Teacher(); // Class Teacher
	public Grade grade = new Grade(); // Class Grade
	public Subject subject = new Subject(); // Class Subject
	
	public String name_school; // This is name for school
	public long number_phone_school; // This is number phone for school
	public String add; // في هذا المتغير سوف يتم حفظ الاسئلة المعرضة على المستخدم
	
	public School() {
	  this.name_school = "";
	  this.number_phone_school = 0;
	}
	
	// na : name
	// nu : number
	public School(String na, long nu) {
		this.name_school = na; // na : this is name_school
		this.number_phone_school = nu; // nu : this is number_phone_school
	}
	
	public void printSchool() { // هذا الدالة تطبع اسم المدرسة ورقم جوال المدرسة
		
		System.out.println("Name for school " + this.name_school);
		System.out.println("Number phone for school " + this.number_phone_school);
		System.out.println(" ");
		
		int i = 0;
		for( ; ; ) {
			
			for(int a = 0; a < 1; a++) {
				System.out.println("What do you want to be");
				
				System.out.println("AddStudent");
				System.out.println("Delete student");
				System.out.println("PrintAllStudent");
				System.out.println("AddTeacher");
				System.out.println("Delete teacher");
				System.out.println("PrintAllTeacher");
				System.out.println("AddGrade");
				System.out.println("PrintAllGrade");
				System.out.println("AddSubject");
				System.out.println("printAllSubject");
				add = input.next();
				
				switch(add) {
				case "addStudent" : this.student.addStudent();
				break;
				case "deleteStudent": this.student.deleteStudent();
			    break;
			    
				case "printAllStudent" : this.student.printAllStudent();
				break;
				
				case "addTeacher" : this.teacher.addTeacher();
				break;
				
				case "deleteTeacher" : this.teacher.deleteTeacher();
				break;
				
				case "printAllTeacher": this.teacher.printAllTeacher();
				break;
				
				case "addGrade" :  this.grade.addGrade();
				break;
				
				//case "addTeacher" : this.teacher
				default : System.out.println("Please enter any word from here");
				System.out.println("AddStudent");
				System.out.println("Delete student");
				System.out.println("PrintAllStudent");
				System.out.println("AddTeacher");
				System.out.println("Delete teacher");
				System.out.println("PrintAllTeacher");
				System.out.println("AddGrade");
				System.out.println("PrintAllGrade");
				System.out.println("AddSubject");
				System.out.println("printAllSubject");
				add = input.next();
				switch(add) {
				case "addStudent" : this.student.addStudent();
				break;
				
				case "deleteStudent" : this.student.deleteStudent();
				break;
				
				case "printAllStudent" : this.student.printAllStudent();
				break;
				
				case "addTeacher" : this.teacher.addTeacher();
				break;
				
				case "addGrade" :  this.grade.addGrade();
				break;
				
				//case "addTeacher" : this.teacher
				default : printSchool();
				break;
				}
				break;
				
				}
			}
		
			if(i < 10) {
		System.out.println("What do you want to now");
		System.out.println("AddStudent");
		System.out.println("Delete student");
		System.out.println("PrintAllStudent");
		System.out.println("AddTeacher");
		System.out.println("Delete teacher");
		System.out.println("PrintAllTeacher");
		System.out.println("AddGrade");
		System.out.println("PrintAllGrade");
		System.out.println("AddSubject");
		System.out.println("printAllSubject");
		add = input.next();
		switch(add) {
		case "addStudent" : this.student.addStudent();
		break;
		
		case "deleteStudent" : this.student.deleteStudent();
		break;
		
		case "printAllStudent" : this.student.printAllStudent();
		break;
		
		case "addTeacher" : this.teacher.addTeacher();
		break;
		
		case "addGrade" :  this.grade.addGrade();
		break;
		
		//case "addTeacher" : this.teacher
		default : printSchool();
		break;
		}
		
		}// } : this is for if
			else {
				break;
			}
		
		} // } this is to for
		
	}
	
	
	
	
	
	
	
	
	
	
	
}