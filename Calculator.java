import java.util.Scanner;  

public class Calculator
{
  public static void calc()
  {
   	Scanner sc=new Scanner(System.in); 
    int x = sc.nextInt(); 
	int y = sc.nextInt();
	int choose = sc.nextInt();
	int result = 0;
	
	if (choose == 1)
	{
		result = x + y;
	}
	else result = y - x;
	System.out.println(result);
    sc.close();
  }
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    
    System.out.println("Enter some numbers and select 1 to add and 2 to subtract");
    calc();
  }
}