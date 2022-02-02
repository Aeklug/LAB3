package Array1;
import java.util.Scanner;
import java.util.Random;
	public class main {
	public static void main(String[] args) {
		System.out.print("Please enter your random value : ");
		int a;
			Scanner scanIn = new
			Scanner(System.in);
			a = scanIn.nextInt();
			scanIn.close();
				System.out.println(" ");
				System.out.println("-----------------------");
				int[] array = new int [a];
				Random rand = new Random();
				for(int i = 0; i <= a ; i++ ) {
					array[i]= rand.nextInt(100);
					System.out.println("Array[" + i + "] = "+ array[i]);
					}
				}
	}