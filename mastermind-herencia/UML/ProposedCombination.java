package mastermind;

class ProposedCombination extends Combination {
	
	ProposedCombination() {
		super(proposeCombination());
	}
	
	private static String proposeCombination() {
		String combination;	
		do {
			combination=readCombination();
		} while (combination.isEmpty());
		return combination;
	}
	
	private static String readCombination() {
		String combination = Console.getInstance().readString("Propose a combination: ");
		if (!ProposedCombination.isValidLength(combination)) {
			Error.WRONG_LENGTH_COMBINATION.writeln();
			return "";
		}
		if (!ProposedCombination.areValidColours(combination)) {
			Error.WRONG_COLOURS_COMBINATION.writeln(ProposedCombination.validColours());
			return "";
		}
		return combination;
	}
	
	public void show() {		
		Console.getInstance().write(this.colours);
	}
}
