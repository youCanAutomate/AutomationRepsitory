
public class StringConcepts {

	public static void main(String[] args) 
	{
		String name="Rahul";
		String s1=new String("Rahul1");
		String s2=s1;
		String s3=s1;
		
		//substring for String
		System.out.println(name.substring(2, 4));
		
		//contains method in String
		System.out.println(name.contains("hu"));
		
		//equal to strings
		System.out.println(name.equals(s1));
		
		//concat in String
		
		//s1=s1.concat("Tyagi");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		//string == operator
		String o1="Ram";
		String o2=o1;
		String o3=new String("Ram");
		
		System.out.println(o1==o2);
		
		//2 objects created 1 on string pool and 1 in non pool
		System.out.println(o3==o1);
		
		//String compareTo
		String c1="Ram11";
		String c2="Ram222";
		
		System.out.println(c1.compareTo(c2));
		
		//After all the string literal all the + will be treated as string concatee
		
		
		
		
		
		
		
		

	}

}
