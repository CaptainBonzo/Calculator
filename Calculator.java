import java.util.*;

public class Calculator{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte eingeben: [+-*/] zahl1 zahl2: ");
		String operator = scan.next();
		int zahl1= scan.nextInt();
		int zahl2= scan.nextInt();
		int result = 0;
		

		if(operator .equals("+")){
			result = zahl1 + zahl2;
		}
		
		
		else if(operator.equals("-")){
			result = zahl1- zahl2;
		}
		System.out.println(zahl1 +" "+ operator +" "+ zahl2 +" = "+ result);
		
	}
}