
public class Student extends Person {
	private static int numStudents = 0;
	private int studentID;
	private Course[] coursesTaken;
	private int numCoursesTaken;
	private boolean isGraduate;
	private String major;
	
	
	public Student() {
		super();
		++numStudents;
		this.studentID = numStudents;
		this.coursesTaken = new Course[50];
		this.numCoursesTaken = 0;
		this.isGraduate = false;
		this.major = "undeclared";
		
	}
	public Student(boolean isGraduate) {
		super();
		++numStudents;
		this.studentID = numStudents;
		this.coursesTaken = new Course[50];
		this.numCoursesTaken = 0;
		this.isGraduate = isGraduate;
		this.major = "undeclared";
		
	}
	
	public Student(String major, boolean isGraduate) {
		super();
		++numStudents;
		this.studentID = numStudents;
		this.coursesTaken = new Course[50];
	    this.numCoursesTaken = 0;
	    this.isGraduate = isGraduate;
	    this.major = major;
	    
	}
	
	public Student(String name, int birthYear, String major, boolean isGraduate) {
		super(name, birthYear);
	    numStudents++;
	    this.studentID = numStudents;
	    this.coursesTaken = new Course[50];
	    this.numCoursesTaken = 0;
	    this.isGraduate = isGraduate;
	    this.major = major;
	    
	}
	
	public boolean isGraduate() {return this.isGraduate;}
	public int getNumCoursesTaken() {return numCoursesTaken;}
	public static int getNumStudents() {return numStudents;}
	public int getStudentID() {return this.studentID;}
	public String getMajor() {return this.major;}
	
	public void setIsGraduate(boolean isGraduate) {this.isGraduate = isGraduate;}
	public void setMajor(String major) {this.major = major;}
	
	public void addCourseTaken(Course course) {
		if (numCoursesTaken < 50) {
			coursesTaken[numCoursesTaken] = course;
		    ++numCoursesTaken;}	
	}
	//the commented one zybooks wasnt accepting it so i changed it 
	
//	public void addCourseTaken(Course course) {
//		if (numCoursesTaken >= 0 && numCoursesTaken < coursesTaken.length) {
//			coursesTaken[numCoursesTaken] = course;
//		    numCoursesTaken++;}	
//	}
	
	public void addCoursesTaken(Course[] course) {
		for (int i = 0; i < course.length; i++) {
			if(numCoursesTaken<50) {
				coursesTaken[numCoursesTaken] = course[i];
			    ++numCoursesTaken;}
		}
	}
	
	//the commented one zybooks wasnt accepting it so i changed it
//	public void addCoursesTaken(Course[] course) {
//		for (int i = 0; i < numCoursesTaken; i++) {
//			if(numCoursesTaken<50) {
//				this.addCourseTaken(course[i]);}
//			}	
//		
//	}
	public Course getCourseTaken(int index) {
		if (index >= 0 && index < numCoursesTaken && index <50) {return coursesTaken[index];} else {return null;}
	}
	
	public String getCourseTakenAsString(int index) {
		
		if (index < 0 || index > numCoursesTaken||index >50) {return "";}
		else {return (this.coursesTaken[index].getCourseDept() + "-" + this.coursesTaken[index].getCourseNum());}
	}

	
	public String getAllCoursesTakenAsString() {
		String x = "";
		for (int i = 0 ; i <this.numCoursesTaken ; i++) {x +=getCourseTakenAsString(i) + ", ";}
		String y = x.trim().substring(0,x.length());
		return y;
		}
	 
	 private int numCreditsTaken() {
		 int j = 0;
		 for (int i = 0; i < numCoursesTaken; i++) {j += coursesTaken[i].getNumCredits();}
		 return j;
		 
	 }

	 @Override
	 public boolean equals(Object o) {
		 if (o instanceof Student) {
			 Student a = (Student)o;
			 if (super.equals(a) && a.numStudents == this.numStudents && a.studentID == this.studentID && a.coursesTaken == this.coursesTaken && a.numCoursesTaken == this.numCoursesTaken && a.isGraduate == this.isGraduate && a.major == this.major) {
				 return true;
				 
			 }
			 
		 }
    return false;
  }

	 
	 @Override
	 public String toString() {
		 String g ="";
		 if (isGraduate == true ) {g ="Graduate";} else {g = "Undergraduate";}
		 return super.toString() + String.format(" Student: studentID: %04d | Major %20s | %14s | Number of Courses Taken: %3d | Courses Taken: %s",
					studentID, major,
					(this.isGraduate ? "Graduate" : "Undergraduate"),
					this.numCoursesTaken,
					this.getAllCoursesTakenAsString()); 
	
	 }
  
  public int compareTo(Student c) {
    if (c.numCreditsTaken() > this.numCreditsTaken()) {return -1;}
    else if (c.numCreditsTaken() < this.numCreditsTaken()) {return 1;}
    else {return 0;}
  }
}
