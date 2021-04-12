package m4.task1;

public class MainRun {
	public static void main(String[] args) {
		
		Project obj = new Project();
		Project obj1 = new Project();
		Student st = new Student(obj);
		
		st.projectGrades();
		
		st.setP(obj1);
		st.projectGrades();
		
	}

}
