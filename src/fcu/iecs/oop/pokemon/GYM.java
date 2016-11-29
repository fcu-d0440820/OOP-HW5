package fcu.iecs.oop.pokemon;
import java.util.Random;
public class GYM {

	private static int player1;
	private static int player2;

	public static void fight(Pokemon p1, Pokemon p2){
		Random ran = new Random();
		player1 = ran.nextInt(21);
		player2 = ran.nextInt(21);
		if(player1>player2){
			System.out.println("The winner is "+p1.getName());
			int bonus = p1.getCp()+500;
			p1.setCp(bonus);
			System.out.println(p1.getCp());
		}
		else{
			System.out.println("The winner is "+p2.getName());
			int bonus = p2.getCp()+500;
			p2.setCp(bonus);
			System.out.println(p2.getCp());
		}
	}

}
