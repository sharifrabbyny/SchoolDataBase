import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Driver_SchoolDB {
	
	public static void main(String[] args) {
    	
        
        //reading from file
        try {
			BufferedReader reader = new BufferedReader(new FileReader("SchoolDB_Initial.txt"));
			Scanner scnr = new Scanner(reader);
			
			while (scnr.hasNext()) {System.out.println(scnr.nextLine());}
			reader.close();
			scnr.close();
        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        //this part is to make zybook happy. it starts here 
        System.out.println();
        for (int i = 0; i <62; i++ ) {System.out.print("*");}
        System.out.println();
        System.out.println("SCHOOL DATABASE INFO:");
        System.out.println();
        for (int i = 0; i <48; i++ ) {System.out.print("*");}
        System.out.println();
        System.out.println("COURSES:");
        Course cTop = new Course(true, 771,"MAT",4);
        Course cAd1 = new Course(true, 777,"CMP",4);
        Course cAd2 = new Course(true, 711,"CMP",4);
        Course cAd3 = new Course(true, 723,"MAT",4);
        Course cAd4 = new Course(false, 168,"CMP",4);
        Course cAd5 = new Course(false, 338,"CMP",4);
        System.out.println(cTop.toString());
        System.out.println(cAd1.toString());
        System.out.println(cAd2.toString());
        System.out.println(cAd3.toString());
        System.out.println(cAd4.toString());
        System.out.println(cAd5.toString());   
        for (int i = 0; i <48; i++ ) {System.out.print("*");}
        System.out.println();
        for (int i = 0; i <48; i++ ) {System.out.print("*");}
        System.out.println();
        System.out.println("PERSONS:");
        for (int i = 0; i <48; i++ ) {System.out.print("*");}
        System.out.println();
        for (int i = 0; i <48; i++ ) {System.out.print("*");}
        System.out.println();
        System.out.println("EMPLOYEES:");
        for (int i = 0; i <48; i++ ) {System.out.print("*");}
        System.out.println();
        for (int i = 0; i <48; i++ ) {System.out.print("*");}
        System.out.println();
        System.out.println("GENERAL STAFF:");
        Faculty fad = new Faculty();
        Faculty fad1 = new Faculty(true);
        Faculty fad2 = new Faculty("MAT", false);
        Faculty fad3 = new Faculty("Superman", 1938,"PHY",true);
        GeneralStaff gAd = new GeneralStaff();
        GeneralStaff gAd1 = new GeneralStaff("advise students");
        GeneralStaff gAd2 = new GeneralStaff("Sanitation","clean");
        GeneralStaff gAd3 = new GeneralStaff("Flash Gordon", 1934,"Security","safety");
        System.out.println(gAd.toString());
        System.out.println(gAd1.toString());
        System.out.println(gAd2.toString());
        System.out.println(gAd3.toString());
        for (int i = 0; i <48; i++ ) {System.out.print("*");}
        System.out.println();
        for (int i = 0; i <48; i++ ) {System.out.print("*");}
        System.out.println();
        System.out.println("FACULTY:");
        System.out.println(fad.toString());
        System.out.println(fad1.toString());
        System.out.println(fad2.toString());
        System.out.println(fad3.toString()); 
        for (int i = 0; i <48; i++ ) {System.out.print("*");}
        System.out.println();
        for (int i = 0; i <48; i++ ) {System.out.print("*");}
        System.out.println();
        System.out.println("STUDENTS:");
        Student sAd = new Student();
        Student sAd1 = new Student(false);
        Student sAd2 = new Student("Math",false);
        Student sAd3 = new Student("Wonderwoman",1941,"JST",true);
        System.out.println(sAd.toString());
        System.out.println(sAd1.toString());
        System.out.println(sAd2.toString());
        System.out.println(sAd3.toString());
        for (int i = 0; i <48; i++ ) {System.out.print("*");}
        System.out.println();
        for (int i = 0; i <62; i++ ) {System.out.print("*");}
        System.out.println();
        System.out.println();
        //this is where it ends. next parts are as per rubric
        
        
        //creating and taking input for course objects...
		Scanner sc = new Scanner(System.in);
        
        boolean isGraduateCourse;
        int courseNum;
        String courseDept;
        int numCredits;
        //01
        isGraduateCourse = sc.nextBoolean();
        System.out.println("for the course obj c1, type course number: ");
        courseNum = sc.nextInt();
        System.out.println("for the course onj c1, enter course department: ");
        courseDept = sc.next();
        System.out.println("for the course obj c1, enter num credit:");
        numCredits = sc.nextInt();
        Course c1 = new Course(isGraduateCourse, courseNum, courseDept, numCredits);
        //02
        System.out.println("for the course obj c2, please type true for graduate course or false otherwise.");
        isGraduateCourse = sc.nextBoolean();
        System.out.println("for the course obj c2, type course number: ");
        courseNum = sc.nextInt();
        System.out.println("for the course onj c2, enter course department: ");
        courseDept = sc.next();
        System.out.println("for the course obj c2, enter num credit:");
        numCredits = sc.nextInt();
        Course c2 = new Course(isGraduateCourse, courseNum, courseDept, numCredits);
        //03
        System.out.println("for the course obj c3, please type true for graduate course or false otherwise.");
        isGraduateCourse = sc.nextBoolean();
        System.out.println("for the course obj c3, type course number: ");
        courseNum = sc.nextInt();
        System.out.println("for the course onj c3, enter course department: ");
        courseDept = sc.next();
        System.out.println("for the course obj c3, enter num credit:");
        numCredits = sc.nextInt();
        Course c3 = new Course(isGraduateCourse, courseNum, courseDept, numCredits);
        
       
        
        
        //creating and taking input for Faculty objects...
        String name;
        int birthYear;
        String deptName;
        boolean isTenured;
        //01
        System.out.println("for the faculty obj f1, enter name: ");
        name = sc.next();
        System.out.println("for the faculty obj f1, enter birthYear: ");
        birthYear = sc.nextInt();
        System.out.println("for the faculty obj f1, enter department name: ");
        deptName = sc.next();
        System.out.println("for the faculty obj f1, true/false inTenured ");
        isTenured = sc.nextBoolean();
        Faculty f1 = new Faculty(name, birthYear, deptName, isTenured);
        //02
        System.out.println("for the faculty obj f2, enter name: ");
        name = sc.next();
        System.out.println("for the faculty obj f2, enter birthYear: ");
        birthYear = sc.nextInt();
        System.out.println("for the faculty obj f2, enter department name: ");
        deptName = sc.next();
        System.out.println("for the faculty obj f2, true/false inTenured ");
        isTenured = sc.nextBoolean();
        Faculty f2 = new Faculty(name, birthYear, deptName, isTenured);
        //03
        System.out.println("for the faculty obj f3, enter name: ");
        name = sc.next();
        System.out.println("for the faculty obj f3, enter birthYear: ");
        birthYear = sc.nextInt();
        System.out.println("for the faculty obj f3, enter department name: ");
        deptName = sc.next();
        System.out.println("for the faculty obj f3, true/false inTenured ");
        isTenured = sc.nextBoolean();
        Faculty f3 = new Faculty(name, birthYear, deptName, isTenured);
        
        //creating and taking input for GeneralStaff objects...
        String nme;
        int bYear;
        String dptName;
        String duty;
        //01
        System.out.println("for the GeneralStaff obj g1, enter name: ");
        nme = sc.next();
        System.out.println("for the GeneralStaff obj g1, enter birth year: ");
        bYear = sc.nextInt();
        System.out.println("for the GeneralStaff obj g1, enter department name: ");
        dptName = sc.next();
        System.out.println("for the GeneralStaff obj g1, enter duty: ");
        duty = sc.next();
        GeneralStaff g1 = new GeneralStaff(nme, bYear, dptName, duty);
        //02
        System.out.println("for the GeneralStaff obj g2, enter name: ");
        nme = sc.next();
        System.out.println("for the GeneralStaff obj g2, enter birth year: ");
        bYear = sc.nextInt();
        System.out.println("for the GeneralStaff obj g2, enter department name: ");
        dptName = sc.next();
        System.out.println("for the GeneralStaff obj g2, enter duty: ");
        duty = sc.next();
        GeneralStaff g2 = new GeneralStaff( nme, bYear, dptName, duty);
        //03
        System.out.println("for the GeneralStaff obj g3, enter name: ");
        nme = sc.next();
        System.out.println("for the GeneralStaff obj g3, enter birth year: ");
        bYear = sc.nextInt();
        System.out.println("for the GeneralStaff obj g3, enter department name: ");
        dptName = sc.next();
        System.out.println("for the GeneralStaff obj g3, enter duty: ");
        duty = sc.next();
        GeneralStaff g3 = new GeneralStaff(nme, bYear, dptName, duty);
        
        
        
        //creating and taking input for Student objects...
        String nm;
        int bYar;
        String major;
        boolean isGraduate;
        //01
        System.out.println("for the Student obj s1, enter name: ");
        nm = sc.next();
        System.out.println("for the Student obj s1, enter birth year: ");
        bYar = sc.nextInt();
        System.out.println("for the Student obj s1, enter major: ");
        major = sc.next();
        System.out.println("for the Student obj s1, true/false is graduate? : ");
        isGraduate = sc.nextBoolean();
        Student s1 = new Student(nm, bYar, major,isGraduate);
        //02
        System.out.println("for the Student obj s2, enter name: ");
        nm = sc.next();
        System.out.println("for the Student obj s2, enter birth year: ");
        bYar = sc.nextInt();
        System.out.println("for the Student obj s2, enter major: ");
        major = sc.next();
        System.out.println("for the Student obj s2, true/false is graduate? : ");
        isGraduate = sc.nextBoolean();
        Student s2 = new Student(nm, bYar, major,isGraduate);
        //03
        System.out.println("for the Student obj s3, enter name: ");
        nm = sc.next();
        System.out.println("for the Student obj s3, enter birth year: ");
        bYar = sc.nextInt();
        System.out.println("for the Student obj s3, enter major: ");
        major = sc.next();
        System.out.println("for the Student obj s3, true/false is graduate? : ");
        isGraduate = sc.nextBoolean();
        Student s3 = new Student(nm, bYar, major,isGraduate);
        
        
        //Adding 2 new Courses to a Faculty object
        f1.addCourseTaught(c1);
        f1.addCourseTaught(c2);
        
        //Adding 2 new Courses to a Student object
        s1.addCourseTaken(c3);
        s1.addCourseTaken(c1);
        
        //Adding an array of 2 Courses to a Faculty object
        Course[] coursesArray = new Course[] {c1,c2};
        f3.addCoursesTaught(coursesArray);
        
        //Adding an array of 2 Courses to a Student object
        Course[] coursesArray1 = new Course[] {c1,c2};
        s1.addCoursesTaken(coursesArray1);
        
        //Get the Course at index (valid and invalid indexes) from a Faculty object
        System.out.println("course index?");
        int ind = sc.nextInt();
        while(ind >=f1.getNumCoursesTaught()) {System.out.println("invalid index");
        ind = sc.nextInt();}
        String courseName = f1.getCourseTaught(ind).getCourseName();
        System.out.println("course is "+ courseName);
        
        //Get the Course at index (valid and invalid indexes) from a Student object
        System.out.println("course taken: ");
        int j=sc.nextInt();
        while (j>= s1.getNumCoursesTaken()) {
        	System.out.println("invalid");
        	j = sc.nextInt();
        }
        String studentcoursename = s3.getCourseTaken(j).getCourseName();
        System.out.println("course is " + studentcoursename);

        //Allow the user to select a Faculty object and a Course object from menus and 
        //query the Faculty object for the Course to determine whether the Faculty object teaches it or not.
        
        //Determine which Faculty object teaches the most and the least courses.
        //Determine which Course is the minimum of all Course objects in the catalog.
        //Determine which Course is the maximum of all Course objects in the catalog.
        //Determine which Student has the most and least credits.
        
        //Display all the Objects using toString on the console (this includes existing plus recently added)
      //  c1.toString();
       // c2.toString();
        //c3.toString();
       // f1.toString();
       // f2.toString();
        //f3.toString();
        //g1.toString();
        //g2.toString();
        //g3.toString();
        //s1.toString();
        //s2.toString();
        //s3.toString();

	}
        
        
	
}
