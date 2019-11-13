
class InputInt {
public static void datPlus() {
	try {
		int a = Integer.parseInt(Variables.arr[0]);
		int b = Integer.parseInt(Variables.arr[1]);
		boolean state = (a>=1) && (a<=10) && (b>=1) && (b<=10) && (a!=0) && (b!=0);
		if(state) {
		Variables.sum = a+b;
		
			System.out.println("\nOutput : \n");
			System.out.print(Variables.sum+"\n" );
			} else System.out.println("Несоответствует условию");
			
		}	
	catch ( NumberFormatException e ) {
		
		
		Rom.rom();
		Mistake.mistake_11();
		Mistake.mistake_1();
		
		OutputRom.rom();
	}
	
	}
		
		public static void datMinus() {
			
			try {
				int a = Integer.parseInt(Variables.arr[0]);
				int b = Integer.parseInt(Variables.arr[1]);
				boolean state = (a>=1) && (a<=10) && (b>=1) && (b<=10) && (a!=0) && (b!=0);
				if(state) {
				Variables.sum = a-b;
					System.out.println("\nOutput : \n");
					System.out.print(Variables.sum+"\n" );
					
					} else System.out.println("Несоответствует условию");
				}	
			catch ( NumberFormatException e ) {
				
				
				Rom.rom();
				Mistake.mistake_11();
				Mistake.mistake_2();
				
				OutputRom.rom();
			}
				
		}
		public static void datProiz () {
			try {
				int a = Integer.parseInt(Variables.arr[0]);
				int b = Integer.parseInt(Variables.arr[1]);
				boolean state = (a>=1) && (a<=10) && (b>=1) && (b<=10) && (a!=0) && (b!=0);
				if(state) {
				Variables.sum = a*b;
					System.out.println("\nOutput : \n");
					System.out.print(Variables.sum+"\n" );
					
					} else System.out.println("Несоответствует условию");
				}	
			catch ( NumberFormatException e ) {
				
				
				Rom.rom();
				Mistake.mistake_11();
				Mistake.mistake_3();
				
				OutputRom.rom();
			}
		}
				
			
		
		
		public static void datD() {
			try {
				int a = Integer.parseInt(Variables.arr[0]);
				int b = Integer.parseInt(Variables.arr[1]);
				boolean state = (a>=1) && (a<=10) && (b>=1) && (b<=10) && (a!=0) && (b!=0);
				if(state) {
				Variables.sum = a/b;
					System.out.println("\nOutput : \n");
					System.out.print(Variables.sum+"\n" );
					
					} else System.out.println("Несоответствует условию");
				}	
			catch ( NumberFormatException e ) {
				
				
				Rom.rom();
				Mistake.mistake_11();
				Mistake.mistake_4();
				
				OutputRom.rom();
			}
		}
			}

