package mastermind;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Console
{
	private static Console console = new Console();

	public static Console getInstance() {
		return console;
	}
	
	private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	
	public String readString(String title) {
		String input = null;
		this.write(title);
		try {
			input = this.bufferedReader.readLine();
		} catch (Exception ex) {
		}
		return input;
	}
	
	public char readChar(String title) {
		char charValue = ' ';
		boolean ok = false;
		do {
			String input = this.readString(title);
			if (input.length() != 1) {
				this.writeError("character");
			} else {
				charValue = input.charAt(0);
				ok = true;
			}
			assert ok;
		} while (!ok);
		return charValue;
	}
	
	public void write(String salida)
	{
		System.out.print(salida);
	}
	
	public void writeln(String salida)
	{
		System.out.println(salida);
	}
	
	public void writeError(String format) {
		System.out.println("FORMAT ERROR! " + "Enter a " + format + " formatted value.");
	}
}