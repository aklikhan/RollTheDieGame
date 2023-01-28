package challenges;

import java.util.Random;

public class RollTheDieGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int lastSpace = 15;
int currSpace = 0;
int maxRoll = 5;
Random random = new Random();


System.out.println("Welcome to Roll the Die! Let's begin..");


for(int i = 1; i<=maxRoll; i++) {
	
	int Die = random.nextInt(6);
	
	currSpace = currSpace + Die;
	
	System.out.println(String.format("Roll #%d: You have rolled a %d. ",i,Die));
	
	
	if(currSpace == lastSpace) {
		System.out.println("You are on space " + currSpace + "Congrats, You win!");
		break;
	}else if(currSpace > lastSpace) {
		System.out.println("Unfortunately, that takes you past " + lastSpace + "space. You lose!");
		break;
	}else if(currSpace < lastSpace){
		System.out.println("you are on space" + currSpace+ " /n Unfortunately , you didn't make it to all");
		
	}else {
		int SpaceToGo = lastSpace - currSpace;
		System.out.println("You are now on Space "+currSpace+" Space needed is "+SpaceToGo+".");
	}
	
}
	}

}
