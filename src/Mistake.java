
class Mistake {
public static void mistake() {
	try {
		Variables.arr[0]=Variables.arr[0].trim();
		 Variables.arr[1]=Variables.arr[1].trim();
	}
	catch (Exception e){
		System.out.println("Неправильное число аргументов ");
		
	}}

	
public static void mistake_1() {
	boolean state = (Variables.num0!=0) && (Variables.num2!=0);
	
	if(state) Variables.sum = Variables.num0+Variables.num2;
	else System.out.println("Неправильный тип аргументов ");	
		}
public static void mistake_2() {
	boolean state = (Variables.num0!=0) && (Variables.num2!=0);
	
	if(state) Variables.sum = Variables.num0-Variables.num2;
	else System.out.println("Неправильный тип аргументов ");	
		}
public static void mistake_3() {
	boolean state = (Variables.num0!=0) && (Variables.num2!=0);
	
	if(state) Variables.sum = Variables.num0*Variables.num2;
	else System.out.println("Неправильный тип аргументов ");	
		}
public static void mistake_4() {
	boolean state = (Variables.num0!=0) && (Variables.num2!=0);
	
	if(state) Variables.sum = Variables.num0/Variables.num2;
	else System.out.println("Неправильный тип аргументов ");	
		}
public static void mistake_11() {
	if(Variables.num0==0 && Variables.num2==0) System.out.println("Неправильное тип аргументов ");
}
//public static void mistake_12() {
	//if(Variables.arr.length==3) System.out.println("Неправильнoе количество аргументов ");
	
//}
}


