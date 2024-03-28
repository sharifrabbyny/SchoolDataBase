
public class Employee extends Person implements Comparable<Person> {
	
	
	private String deptName;
	private static int numEmployees =0;
	private int employeeID;
	
	
	Employee(){ deptName = ""; employeeID = ++numEmployees;}
	Employee(String dptName ){ this.deptName = dptName;  employeeID =++numEmployees;}
	
	Employee(String nme, int brtYear, String dptName) {
		super(nme,brtYear);
		deptName = dptName;
		employeeID = ++numEmployees;
	}
	public String getDeptName() {
		return deptName;
	}
	public static int getNumEmployees() {
		return numEmployees;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setDeptName(String dptName) {
		deptName = dptName;
	}
	
	
	public boolean equals(Object obj) {
	    if (obj == null) {return false;}
	    if (this == obj) {return true;}
	    if (obj instanceof Employee) {
	        Employee e = (Employee)obj;
	        return super.equals(e) && this.deptName.equals(e.deptName) && this.employeeID == e.employeeID;
	    }
	    return false;
	}

	@Override
	public String toString() {
	    return String.format("%s Employee: Department: %20s | Employee Number: %3d", super.toString(), deptName, employeeID);
	}
	
	
	@Override
	public int compareTo(Person p) {
		if (p == null) {
	        throw new NullPointerException("null");}
		
		if (p instanceof Employee) {
		Employee e = (Employee)p;
	if (this.employeeID == e.getEmployeeID()){return 0;}
	else if (this.employeeID < e.getEmployeeID()){return -1;}
	else {return 1;}}
	else {return super.compareTo(p);}
		
	}

	
	
}
