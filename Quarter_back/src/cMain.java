import java.util.Scanner;

public class cMain {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of touchdowns made: ");
		int TD = sc.nextInt();
		System.out.println("Enter total yards:");
		int Yards = sc.nextInt();
		System.out.println("Enter number of interceptions:");
		int INT = sc.nextInt();
		System.out.println("Enter number of completions");
		int comp = sc.nextInt();
		System.out.println("Enter number of passes attempted:");
		int ATT = sc.nextInt();
		
		double e = (comp/ATT -.3)*5;
		double f = (Yards/ATT - 3)*.25;
		double g = (TD/ATT)*20;
		double h = 2.375 - (INT/ATT *25);
		
		double QB_rating = ((e+f+g+h)/6)*100;
		
		System.out.println("The Quarterback rating is: "+ QB_rating);

	}

}
