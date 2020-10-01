import java.util.*; 
class A 
{ 
		public int year;

	public void get_in() 
	{ 
        System.out.println("Enter an Year :: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt(); 
	} 
} 

class B extends A
{ 
	public void print_out() 
	{ 
	  if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println("Specified year is a leap year");
      else
         System.out.println("Specified year is not a leap year");
	} 
} 
public class Leap_year 
{ 
	public static void main(String[] args) 
	{ 
		B b = new B(); 
		b.get_in(); 
		b.print_out();  
	} 
} 
