package mastermind;

enum Message {
	
	TITTLE("\n---- MASTERMIND -----"),
	RESUME("RESUME"),
	PLAYER_WIN("You've won!!! ;-)"),
	PLAYER_LOST("You've lost!!! :-("),
	NUMBER_ATTEMPTS("\n#numberOfAttempts attempt(s):"),
	PROPOSE_COMBINATION("Propose a combination: "),
	RESULT(" --> #numberOfBlacks blacks and #numberOfWhites whites");
	
	private String message;
	
	private Message(String message) {
		this.message = message;
	}
	
	void write() {
		Console.getInstance().write(this.message);
	}
	
	void writeln() {
		Console.getInstance().writeln(this.message);
	}
	
	void writeln(int numberOfAttempts) {
		assert this == Message.NUMBER_ATTEMPTS;
		Console.getInstance().writeln(this.message.replaceAll("#numberOfAttempts",String.valueOf(numberOfAttempts)));
	}
	
	void writeln(int numberOfBlacks,int numberOfWhites) {
		assert this == Message.RESULT;
		String msg = this.message.replaceAll("#numberOfBlacks",String.valueOf(numberOfBlacks));
		msg = msg.replaceAll("#numberOfWhites",String.valueOf(numberOfWhites));
		Console.getInstance().writeln(msg);
	}
}
