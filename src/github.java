import java.util.Scanner;
public class github {
	// solo retorna 1 y 0 y eso quiere decir que 0 es verdadero y 1 falso
	static boolean soniguales(int numero1,int numero2){
		if(numero1==numero2){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lol=new Scanner(System.in);
		//Ejercicio#1
		int x1,x2;
		System.out.print("Ingrese Num 1   = ");
		x1 =lol.nextInt();
		System.out.print("Ingrese Num 2   = ");
		x2 =lol.nextInt();
		if(x1==x2)
		{
			System.out.print("= Los Numeros Son iguales(Verdadero)");
		}else 
		{
				System.out.print("= Los Numeros son Diferentes(Falso)");
				
		}
		System.out.println(  "\n --------------------------------------");
				
		
		
				
				
//Ejercicio#3
		
			System.out.println("\n Ejercicio#3  ");
			System.out.print("nota#1  ");
			int xa,xb,x3,x4,x5,x6,x7,x8,x9,x10,x11,x12,x13,x14,x15,x16,x17,x18,x19,x20;
			xa =lol.nextInt();
			System.out.print("nota#2  ");
			
			xb =lol.nextInt();
			System.out.print("nota#3  ");
			
			x3 =lol.nextInt();
			System.out.print("nota#4  ");
			
			x4 =lol.nextInt();
			System.out.print("nota#5  ");
			
			x5 =lol.nextInt();
			System.out.print("nota#6  ");
			
			x6 =lol.nextInt();
			System.out.print("nota#7  ");
			
			x7 =lol.nextInt();
			System.out.print("nota#8  ");
			
			x8 =lol.nextInt();
			System.out.print("nota#9  ");
			
			x9 =lol.nextInt();
			System.out.print("nota#10  ");
			
			x10 =lol.nextInt();
			System.out.print("nota#11  ");
			
			x11 =lol.nextInt();
			System.out.print("nota#12  ");
			
			x12 =lol.nextInt();
			System.out.print("nota#13  ");
			
			x13 =lol.nextInt();
			System.out.print("nota#14  ");
			
			x14 =lol.nextInt();
			System.out.print("nota#15  ");
			
			x15 =lol.nextInt();
			System.out.print("nota#16  ");
		
			x16 =lol.nextInt();
			System.out.print("nota#17  ");
			
			x17 =lol.nextInt();
			System.out.print("nota#18  ");
			
			x18 =lol.nextInt();
			System.out.print("nota#19  ");
			
			x19 =lol.nextInt();
			System.out.print("nota#20  ");
			
			x20 =lol.nextInt();
			System.out.print("Promedio  ");
			
			System.out.println((xa+xb+x3+x4+x5+x6+x7+x8+x9+x10+x11+x12+x13+x14+x15+x16+x17+x18+x19+20) / 20);
			}
		
	
}
