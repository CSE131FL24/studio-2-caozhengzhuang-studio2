
package studio2;
import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int startAmount = in.nextInt();
		double winChance = in.nextDouble();
		int winLimit = in.nextInt();
		int totalSimulations = in.nextInt();
		int money = startAmount; 
		
		for (int day=1; day <= totalSimulations; day++) {
			while (money < winLimit && startAmount > 0) {
				double number = Math.random();
				if (number > winChance) {
				money --;
				
				}
				else {
				money ++; 
				
				}
		}
			if (money == winLimit) {
				System.out.println("Simulation"+day+"A Win");
			}
			if (money == 0) {
				System.out.println("Simulation"+day+"A Ruin");
			}
			
		}
		
		
	}
}
