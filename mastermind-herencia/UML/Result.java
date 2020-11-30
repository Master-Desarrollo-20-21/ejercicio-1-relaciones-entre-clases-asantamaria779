package mastermind;

class Result {
	
	ProposedCombination proposedCombination;
	int numberOfBlacks;
	int numberOfWhites;
	
	Result (ProposedCombination proposedCombination) {
		this.proposedCombination = proposedCombination;
		this.numberOfBlacks = 0;
		this.numberOfWhites = 0;
	}
	
	public void check (SecretCombination secretCombination) {
		this.numberOfBlacks=secretCombination.numberCoincidencesInColourAndPosition(proposedCombination);
		this.numberOfWhites=secretCombination.numberCoincidencesInColourOnly(proposedCombination);
	}
		
	public boolean isWinner() {
		return this.numberOfBlacks==ProposedCombination.length();
	}
	
	public void show() {
		this.proposedCombination.show();
		Message.RESULT.writeln(this.numberOfBlacks,this.numberOfWhites);		
	}

}
