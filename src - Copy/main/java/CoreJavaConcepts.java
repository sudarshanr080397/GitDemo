
public class CoreJavaConcepts {
	public static void main(String[] args) {
		int iNum = 5;
		double dNum = 12.5;
		String sVal = "sudarshan";
		char letter = 'c';
		boolean bVal = true;
		System.out.println(iNum + " " + dNum + " " + sVal + " " + letter + " " + bVal);

//arrays
		int[] arr = new int[4];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("array value is: " + arr[i]);
			
		}
//2nd type of array invoking
		int[] arr2 = { 8, 7, 9, 5, 4 };

		//for loop 1
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("array value is: " + arr2[i]);
		}
		String[] name={"Hero","Sudarshan","Raja"};
		for(int i=0;i<name.length;i++)
		{
			System.out.println("Name is: " + name[i]);
		}
		for(String s:name)
		{
			System.out.println("Name in 2 is: " + s);
		}
	}
}
