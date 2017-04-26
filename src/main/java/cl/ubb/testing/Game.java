package cl.ubb.testing;

public class Game {
	int score = 0;
	int strike = 10;
	public void roll(int pins){
		
		if(pins == 10){
			score+=strike;
		}
		score += pins;
	}
	
	public int score(){
		return score;
	}
}

