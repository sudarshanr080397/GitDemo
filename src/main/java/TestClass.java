import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClass {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		System.out.println("First number is " + numbers[0] + " and last number is " + numbers[4]);
		for (int i = numbers.length -1; i >=0 ; i--)
		//for(int a:numbers)
		{
			System.out.println("Array number is: "+ numbers[i]);
			
		}
		//Array list
		ArrayList<String> a= new ArrayList<String>();
		a.add("Sudarshan");
		a.add("Raja");
		a.add("Sudha");
		a.add("Thangamani");
		System.err.println(a.get(3));
		
		for (int i = 0; i<a.size() ; i++)
			//for(String b:a)
			{
				System.out.println( a.get(i));
				
			}
		for(String b:a)
		{
			System.out.println("enhanced for loop value: "+b);
		}
		System.out.println(a.contains("Raja"));
		String[] str={"Swetha","Anu"};
		List<String> nameAL=Arrays.asList(str);
		System.out.println("Converted AL: "+nameAL.contains("Anu"));
	}

}
