package Encapsulation;

public class Encapsulationmainclass {
	public static void main(String[] args) {
		
		Encapsulationclassone eco = new Encapsulationclassone();
		eco.setStudentAge(24);
		eco.setStudentName("Manisha Shukla");
		eco.setStudentRollNo(27);
		
		System.out.println("Student age is "+ eco.getStudentAge());
		System.out.println("Student Name is "+ eco.getStudentName());
		System.out.println("Student Roll No is "+ eco.getStudentRollNo());
	}

}
