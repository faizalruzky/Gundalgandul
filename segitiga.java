import java.util.Scanner;

public class segitiga {
		public static void main (String[]args){
Scanner in = new Scanner (System.in);
int x, y;
double z;

			System.out.print(" Kalkulator sederhana ");
			System.out.println();
			System.out.print("Masukan alas =");
			x=in.nextInt();
			System.out.println();
			System.out.print("Masukan tinggi =");
			y=in.nextInt();
			
z = 0.5 * x * y;

System.out.println();
System.out.println("Luas segitiga = " + z);

		}
			}