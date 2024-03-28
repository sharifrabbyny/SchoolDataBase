
public class Faculty extends Employee implements Comparable<Person>{
	
	
	private Course[] coursesTaught;
	private int numCoursesTaught;
	private  boolean isTenured;
	
	Faculty() {
		super();
		coursesTaught = new Course[100];
		numCoursesTaught =0;
		isTenured = false;
		
	}
	
	Faculty(boolean isTenured) {
		super();
		coursesTaught = new Course[100];
		numCoursesTaught =0;
		this.isTenured = isTenured;
	
		
	}	
	
	Faculty(String deptName, boolean isTenured) {
		super();
		super.setDeptName(deptName);
		coursesTaught = new Course[100];
		numCoursesTaught =0;
		this.isTenured = isTenured;
		
	}
	
	Faculty(String name, int birthYear, String deptName, boolean isTenured){
		super(name, birthYear,deptName);
		coursesTaught = new Course[100];
		numCoursesTaught =0;
		this.isTenured = isTenured;
		
	}

	public boolean isTenured() {return isTenured;}

	public int getNumCoursesTaught() {
		return this.numCoursesTaught;
	}
	public void setTenured(boolean isTenured) {this.isTenured = isTenured;}
	
	public void addCourseTaught(Course c) {
		if (numCoursesTaught < coursesTaught.length) {
			coursesTaught [numCoursesTaught] = c;
			numCoursesTaught++;
		}
	}
	
	public void addCoursesTaught(Course[] courses) {
		
		
        for (Course course : courses) {
        	addCourseTaught(course);
//            if (numCoursesTaught < coursesTaught.length) {
//                coursesTaught[numCoursesTaught++] = course;
//            } else {
//                break; 
//            }
        }
    }
	
	
    public Course getCourseTaught(int index) {
        if (index >= 0 && index < numCoursesTaught) {
            return coursesTaught[index];
        } else {
            return null;
        }
    }
    
    public String getCourseTaughtAsString(int index) {
    	return coursesTaught[index].getCourseDept() +"-"+ coursesTaught[index].getCourseNum(); }
    
    public String getAllCoursesTaughtAsString() {
    	String s = "";
    	for (int i = 0; i < numCoursesTaught; i++) {s += coursesTaught[i].getCourseDept() + "-" + coursesTaught[i].getCourseNum() + ",";}
    	if (!s.isEmpty() && s.endsWith(",")) {
    	    return s.substring(0, s.length() - 1);
    	} else {
    	    return s;}
    	}

    
    
    @Override
    public boolean equals(Object obj) {
    	if (this == obj) {return true;}
        if (!(obj instanceof Faculty)) {return false;}
        Faculty other = (Faculty) obj;
        return super.equals(other) && isTenured == other.isTenured && numCoursesTaught == other.numCoursesTaught;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Faculty: %s | Number of Courses Taught: %3d | Courses Taught: %s",
                isTenured ? " Is Tenured" : "Not Tenured", numCoursesTaught, getAllCoursesTaughtAsString());
    }


    @Override
    public int compareTo(Person p) {
    	if(!(p instanceof Faculty)) {return -1;}
    	Faculty obj = (Faculty) p;
    	return Integer.compare(this.numCoursesTaught, obj.getNumCoursesTaught());

	}


}
