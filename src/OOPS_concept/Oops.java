package OOPS_concept;

public class Oops {
   
     private void employeeName(){
	System.out.println("Nivi");
     }
	private void employeeRollNo() {
	System.out.println("26");
	}
	private void employeeDOB() {
		System.out.println("25/06/1999");
	}
	private void employeeBloodGroup() {
	System.out.println("B+ve");
	}
	
	private void employeeAddress() {
		System.out.println("No.69,balaji nagar,chennai.");
	}
	private void employeeAge() {
		System.out.println("23");
	}
	
	public static void main(String[] args) {
		 
		Oops emp=new Oops();
		
		emp.employeeName();
		emp.employeeRollNo();		
		emp.employeeDOB();
		emp.employeeBloodGroup();
		emp.employeeAge();
		emp.employeeAddress();
		
	}
    
}