package sampleCode;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Hello world");
		
		String array[]= new String[3];
		array[0]="Ramya";
		array[1]= "hanshi";
		array[2]="harish";
		/*
		 * for(int i=0; i<array.length; i++) { if(array[i].contains("harish")) {
		 * array[i]= array[i].replace("harish", "");
		 * System.out.println("array is "+array[i]); System.out.println("Array size is "
		 * +array.length);
		 * 
		 * } }
		 */		System.out.println("print array  ");
		for(int i=0; i<3; i++) {
			System.out.println(array[i]);
		}
		
		for(String arrayname : array) {
			if("harish".equalsIgnoreCase(arrayname)) {
				System.out.println("array name matched ");
			}
		}
	}

}
