public class Person implements Comparable<Person>  {
	
	private String name;
	private int birthYear;
	
	Person() {
		this.name = "";
		this.birthYear = 0;
		
	}

	public Person(String name, int birthYear) {
		super();
		this.name = name;
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public boolean equals(Object obj) {
		if (obj == null) { return false;}
		if (this == obj) {return true;}
		if (obj instanceof Person) {
			Person p = (Person)obj;
			if (this.name.equals(p.name) && this.birthYear == p.birthYear) { return true;}
		}
		return false;		
	}
	

	@Override
	public String toString() {
		return String.format("Person: Name: %30s | Birth Year: %4d", name, birthYear);
	}
	
	 
	 @Override
		public int compareTo(Person p) {
		 if (p == null) {
		        throw new NullPointerException("null");}
			
			Person c = (Person)p;
		if (this.birthYear == c.getBirthYear()){return 0;}
		else if (this.birthYear < c.getBirthYear()){return -1;}
		else {return 1;}
		}
}
