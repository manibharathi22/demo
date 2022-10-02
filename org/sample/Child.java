package org.sample;

public class Child {

	
			// no argument method
		private void empDetails() {
			System.out.println("Employee details list:");
		}
		
		//data type argument
		// () - parameter
		// anything inside the parameter is called argument
		
		private void empDetails(String name) {
			System.out.println("Employee name is " +name);
		}
		
		//data type count argument
		
		private void empDetails(String address, int pincode) {
			System.out.println("Employee address is "+address);
			System.out.println("Employee pincode is "+pincode);
}
		//data type order argument
		
		private void empDetails(int CompID, String CompName) {
			System.out.println("Employee Company ID is "+CompID);
			System.out.println("Employee Company Name is "+CompName);
}
		public static void main(String[] args) {
			Child c = new Child();
			c.empDetails();
			c.empDetails("Bharathi");
			c.empDetails("Virudhunagar", 626101);
			c.empDetails(1234, "RioBerry");
		}
}