import java.util.Scanner;
import java.util.regex.Pattern;

public class Calculator7 {

	public static void main(String[] args) {
		Scaner();
			
	}
	
	public static void Scaner() {
		Scanner in = new Scanner(System.in);
	 System.out.println("\nInput : \n");
	
	 String num_ = in.nextLine();
	 //System.out.println(num_);
	 String [] charr = num_.split("");
	 //System.out.println( charr[0]+ ","+charr[1]+","+charr[2]);
	 for(String x:charr){
		 if(x.equals("+")) {
			 Pattern pattern = Pattern.compile("[+]");
			 
			 Variables.arr = pattern.split(num_);
			 Mistake.mistake();
			 if(Variables.arr.length!=2) System.out.println("����������o� ���������� ���������� ");
			 else { 
				 
			 //System.out.println(Variables.arr[0] + ", "+ Variables.arr[1]);
			 InputInt.datPlus();
			 }
			 
			 //System.out.println(Variables.arr[0] + " � +" + Variables.arr[1] );
			 
		 } else if (x.equals("-")) {
			 Pattern pattern = Pattern.compile("[-]");
			 Variables.arr = pattern.split(num_);
			 Mistake.mistake();
			 if(Variables.arr.length!=2) System.out.println("����������o� ���������� ���������� ");
			 else { 
			 InputInt.datMinus();
			 } //System.out.println(Variables.arr[0] + " � - " + Variables.arr[1] );
			 
		 } else if (x.equals("*")) {
			 Pattern pattern = Pattern.compile("[*]");
			 Variables.arr = pattern.split(num_);
			 Mistake.mistake();
			 if(Variables.arr.length!=2) System.out.println("����������o� ���������� ���������� ");
			 else { 
			 InputInt.datProiz();
			 } //System.out.println(Variables.arr[0] + " � *" + Variables.arr[1] );
			 
		} else if (x.equals("/")) {
			 Pattern pattern = Pattern.compile("[/]");
			 Variables.arr = pattern.split(num_);
			 Mistake.mistake();
			 if(Variables.arr.length!=2) System.out.println("����������o� ���������� ���������� ");
			 else { 
			 InputInt.datD();}
		} //else {System.out.println("������������ ��������"); Calculator7.Scaner();}
			 //System.out.println(Variables.arr[0] + " �/ " + Variables.arr[1] );
			 
	    } 
			  
	 }
	 
	 
			 
			
		 
	 } 
	 

	


