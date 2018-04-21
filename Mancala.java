import java.util.*;

public class Mancala {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int turn = 1;
		
		int cubby = 0;
		
		Dictionary cubbies = new Hashtable();
		cubbies.put(1, 0);
		cubbies.put(2, 3);
		cubbies.put(3, 3);
		cubbies.put(4, 3);
		cubbies.put(5, 3);
		cubbies.put(6, 3);
		cubbies.put(7, 0);
		cubbies.put(8, 3);
		cubbies.put(9, 3);
		cubbies.put(10, 3);
		cubbies.put(11, 3);
		cubbies.put(12, 3);
		
		int score1 = (Integer) cubbies.get(1);
		int score2 = (Integer) cubbies.get(7);
		
		System.out.println("Welcome to Mancala!");
		System.out.println();
		System.out.println("          | 12 | 11 | 10 | 9 | 8 | ");
		System.out.println(" Player 1 |                      | Player 2 ");
		System.out.println("          |  2 |  3 |  4 | 5 | 6 |");
		
		System.out.println();
		System.out.println("Please input the cubby you would like to empty (2-6) or (8-12).");
		
		while ((score1+score2)!=30){
			if ((turn%2)==1){
				System.out.println("Player 1, please input the cubby you would like to empty.");
			}
			else{
				System.out.println("Player 2, please input the cubby you would like to empty.");
			}
			cubby = scan.nextInt();
			System.out.println("Emptying cubby "+cubby);
			if (cubby!=0){
				int kount = (Integer) cubbies.get(cubby);
				cubbies.put(cubby,0);
				for (int i=1; i<=kount; i++){
					if ((cubby+i)>12){
						cubby=0;
					}
					if((turn%2)==1){
						if((cubby+i)==7){
							i++;
							kount++;
						}
					}
					if((turn%2)==0){
						if((cubby+i)==1){
							i++;
							kount++;
						}
					}
					cubbies.put(cubby+i, (Integer) cubbies.get(cubby+i) + 1);	
				}
				cubby=0;
			}
			System.out.println();
			System.out.println("_________________________________________");
			System.out.println("          | "+cubbies.get(12)+" | "+cubbies.get(11)+" | "+cubbies.get(10)+" | "+cubbies.get(9)+" | "+cubbies.get(8)+" | ");
			System.out.println(" Player 1 |                   | Player 2 ");
			System.out.println("          | "+cubbies.get(2)+" | "+cubbies.get(3)+" | "+cubbies.get(4)+" | "+cubbies.get(5)+" | "+cubbies.get(6)+" | ");
			System.out.println("_________________________________________");
			System.out.println("Player 1 has as score of " + (Integer) cubbies.get(1));
			System.out.println("Player 2 has as score of " + (Integer) cubbies.get(7));
			turn++;
		}

	}

}
