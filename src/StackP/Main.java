package StackP;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int boyut=0;
		Scanner myObj=new Scanner(System.in);
		 System.out.println("Enter a string:");
		String palindrom= myObj.nextLine(); 
		char[] palindromArray=palindrom.toCharArray();
		 boyut=palindromArray.length;
		 Stack stackOrnek= new Stack(boyut);
		for(char d : palindromArray) {
		      char data=d;
		      stackOrnek.push(data);
		}
		stackOrnek.print();
		System.out.println();
		System.out.print("----------->");
		
		
		stackOrnek.palindromCheck();
		
	}

}
