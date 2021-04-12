package m4.task1;

public class Project {
       private String projectName;
       private String concept;
       private String status;
       private int noOfmembers;
       private int marks;
	   private int num;


	public int getNum() {
		return num;
	}
    
	public Project(String projectName) {
		super();
		this.projectName = projectName;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Project() {
		super();
	   }

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String isStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

    public String getConcept() {
		return concept;
	}

	public void setConcept(String concept) {
		this.concept = concept;
	}

	public int getNoOfmembers() {
		return noOfmembers;
	}

	public void setNoOfmembers(int noOfmembers) {
		this.noOfmembers = noOfmembers;
	}
	
	
    public int projectUpdates(int num) {
    	   switch(num) {
    	        case 1:
    	        	System.out.println("The project has not been started");
    	        	marks = 0;
    	        	break;
    	        case 2:
    	        	System.out.println("The project has just started");
    	        	marks = 50;
    	        	break;
    	        case 3:
    	        	System.out.println("The project is in progress");
    	        	marks = 75;
    	        	break;
    	        case 4:
    	        	System.out.println("The project has been completed");
    	        	marks = 100;
    	        	break;
    	   }
    	   return marks;
    	   
       }
 
}
