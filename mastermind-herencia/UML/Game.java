package mastermind;

class Game {

	final int MAX_ATTEMPTS = 10;
	
	int numberOfAttempts;
	SecretCombination secretCombination;
	Result[] results;
	
	Game() {
		this.reset();
	}
	
	public void play() {
		
		boolean isWinner=false;
		do {
			this.showState();
			ProposedCombination proposedCombination=new ProposedCombination();
			Result result=new Result(proposedCombination);
			result.check(this.secretCombination);
			isWinner=result.isWinner();
			results[numberOfAttempts]=result;
			this.numberOfAttempts++;
		} while (!(this.numberOfAttempts==MAX_ATTEMPTS || isWinner));
		this.showState();
		if (isWinner) {
			Message.PLAYER_WIN.writeln();
		}
		else {
			Message.PLAYER_LOST.writeln();
		}
	}
	
	private void showState() {
		Message.NUMBER_ATTEMPTS.writeln(numberOfAttempts);
		secretCombination.show();
		for(int i=0;i<this.numberOfAttempts;i++) {		
			results[i].show();
		}
	}
	
	public void reset() {
		this.numberOfAttempts=0;
		this.secretCombination = new SecretCombination();
		this.results = new Result[10];
	}
}
