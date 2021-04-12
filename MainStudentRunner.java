package m4.task1;
import java.util.Scanner;
public class MainStudentRunner {
         Student stuArr[] = new Student[100];
         int index = 0;
         static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		MainStudentRunner obj = new MainStudentRunner();
		while(true) {
			System.out.println("1. Add Student");
			int option = Integer.parseInt(sc.nextLine());
			switch(option) {
			case 1:
				obj.insertCarByUser();
				break;
			}
		}

	}
	public void insertCarByUser() {
		System.out.println(" Enter Student Name ");
		String name = sc.nextLine();
		System.out.println(" Enter Student Id ");
		String id = sc.nextLine();
		System.out.println("Enter the name of project");
		Project p = new Project(sc.nextLine());
		Student s=new Student(p);
		s.setName(name);
		s.setStudentId(id);
	    addStudents(s);
	}
	public void addStudents(Student s) {
		stuArr[index++] = s;
		display(s);
	}
	public void display(Student s) {
        System.out.println("Student Information: ");
        System.out.println("Student Name: "+s.getName());
        System.out.println("Student id: "+s.getStudentId());
        System.out.println("Student Project: "+s.getP().getProjectName());
	}

}
