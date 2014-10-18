package compiler.Exceptions;

public class ParseError extends Exception {
	private static final long serialVersionUID = 1L;

	public ParseError(String string) {
		super(string);
	}

}
