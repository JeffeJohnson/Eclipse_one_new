package org.excp;



public class Three {
		private void find()  throws EmployeeNotFoundException {

			String s="1234";
	
			if(s.equals("123")) {
				System.out.println("Employee present....");
		
			}
			else { 
				try{
					throw new EmployeeNotFoundException();
				}catch (EmployeeNotFoundException e) {
		
					System.out.println("Employee absent....");
					e.printStackTrace();
				}finally {
					System.out.println("Database Closed.....");
				}
			}
		}
		public static void main(String[] args) throws EmployeeNotFoundException {
			Three a = new Three();
			a.find();
	}
}

	

