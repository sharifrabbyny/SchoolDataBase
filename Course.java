
public class Course implements Comparable<Course> {

	private boolean isGraduateCourse;
	private int courseNum;
	private String courseDept;
	private int numCredits;
	
	
	Course(){
		this.isGraduateCourse = false;
		this.courseNum = 0;
		this.courseDept = "";this.numCredits = 0;
	}

	Course(boolean isGraduateCourse, int courseNum, String courseDept, int numCredits) {
		this.isGraduateCourse = isGraduateCourse;
		this.courseNum = courseNum;
		this.courseDept = courseDept;
		this.numCredits = numCredits;
	}

	public boolean isGraduateCourse() {
		return isGraduateCourse;
	}

	public int getCourseNum() {
		return courseNum;
	}

	public String getCourseDept() {
		return courseDept;
	}

	public int getNumCredits() {
		return numCredits;
	}
	
	public String getCourseName() {
		String g = "";
		if (isGraduateCourse == true) {g = "G";} else {g = "U";}
		return g + courseDept + courseNum;
	}
	
	public boolean equals(Object obj) {
	    if (obj == null) {return false;}
	    if (this == obj) {return true;}
	    if (obj instanceof Course) {
	        Course c = (Course)obj;
	        if (this.numCredits == c.numCredits && this.isGraduateCourse == c.isGraduateCourse && this.courseDept.equals(c.courseDept) && this.courseNum == c.courseNum) {
	            return true;
	        }
	    }
	    return false;
	}
	
	@Override
	public String toString() {
	    String g = isGraduateCourse ? "Graduate" : "Undergraduate";
	    return String.format("Course: %3s-%3d | Number of Credits: %02d | %s", courseDept, courseNum, numCredits, g);
	    }

	@Override
	public int compareTo(Course c) {
		if (c == null) {
	        throw new NullPointerException(c+"null");}
		
		if (this.courseNum == c.courseNum){return 0;}
		else if (this.courseNum < c.courseNum){return -1;}
		else {return 1;}
		
		}
	
}
