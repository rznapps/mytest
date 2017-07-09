package QA_Prescreen;

public class helloWorld {

	public static void main(String[] args) {
		
		String [] results = {"4","one","two", "three","four"};
		
		int count = Integer.parseInt(results[0]);
		
		for (int test=1; test<count+1; test++){
			
			System.out.println(results[test]);
		}
		

	}
	
	

}
