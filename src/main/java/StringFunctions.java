
public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Srinija Sudarshan Raja";
		
		String[] splittedString=a.split(" ");//splitted using white space
		System.out.println(splittedString[0].trim());
		System.out.println(splittedString[1].trim());
		System.out.println(splittedString[2]);
		for(int i=0; i<a.length();i++)
		{
			System.out.println(a.charAt(i));
			
		}
		
		//printing the string in reverse order
		for(int i=a.length()-1; i>=0;i--)
		{
			System.out.println(a.charAt(i));
			
		}
	}

}
