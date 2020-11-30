package mastermind;

class Mastermind {	
	
	private Game game;
	
	Mastermind() {
		this.game=new Game();
	}
	
	private void play() {
		 do {
			 Message.TITTLE.writeln();			 
			 this.game.play();
		 } while(this.isResumedGame());
	}

	private boolean isResumedGame() {
		boolean isResumed = new YesNoDialog().read(Message.RESUME.toString());
		if (isResumed) {
			this.game.reset();
		}
		return isResumed;
	}

	public static void main(String[] args) {
		new Mastermind().play();
	}
}
