package number;
import java.util.*;
public class Checkchar {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		char ch=0;
		Scanner ch1= new Scanner(System.in);
		ch= ch1.next().charAt(0);
		ch1.close();
     
     if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
     {
    	 System.out.println("alphabet");
     }
     else 
      {
    	 System.out.println("no");
      }
	}

}