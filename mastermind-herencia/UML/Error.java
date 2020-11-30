package mastermind;

enum Error {

	WRONG_LENGTH_COMBINATION("Wrong proposed combination length"),
	WRONG_COLOURS_COMBINATION("Wrong colors, they must be: #rigthColours"),
	NULL;

	private String message;

	Error(){
	}

	Error(String message){
		this.message = message;
	}
	
	void writeln(String rigthColours) {
		assert this == WRONG_COLOURS_COMBINATION;
		Console.getInstance().writeln(this.message.replaceAll("#rigthColours",rigthColours));
	}
	
	void writeln() {
		if (this != NULL){
			Console.getInstance().writeln(this.message);
		}
	}

}