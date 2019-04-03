import java.util.Scanner;
	public class Transformation{

		public static void main(String[] args){

			Scanner scanner = new Scanner(System.in);

			System.out.println("ÇëÊäÈëÊı×Ö");

			int x = scanner.nextInt();
	
			

			int	y = f(x); 

			System.out.println(y);


	}

		public static int f(int a){

			int r =  a*a-2*a+4;

			return r;

	}
}