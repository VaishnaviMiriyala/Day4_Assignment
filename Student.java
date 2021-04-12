package m4.task1;

class Student {
	private String name;
	private String studentId;
	private Project p;


	//----constructor-----//
	public Student() {
		super();
	}
	
	public Student(Project p) {
		super();
		this.p = p;
	}

	//---------gets and sets-----//
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public Project getP() {
		return p;
	}
	public void setP(Project p) {
		this.p = p;
	}
	
	//-------Business Methods---------
	
	public void projectGrades() {
		int mark = p.projectUpdates(1);
		if(mark < 50) {
            System.out.println("Fail");		
	    }else if(mark >= 50 && mark < 75) {
		    System.out.println("Just Pass");
	    }else if(mark >= 75){
	    	System.out.println("Pass with excellence");
	    }
	}
}