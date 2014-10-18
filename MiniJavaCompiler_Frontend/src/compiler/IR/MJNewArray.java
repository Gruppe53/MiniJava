package compiler.IR;

import compiler.PrettyPrinter;

public class MJNewArray extends MJNew {
	private MJExpression argument;
	
	public MJNewArray(MJExpression argument) {
		super("int", true);
		this.argument = argument;
	}
	
	public void prettyPrint(PrettyPrinter prepri) {
		if (type.isArray()) {
			prepri.print("new ");
			this.type.prettyPrint(prepri);
			prepri.print("[");
			this.argument.prettyPrint(prepri);
			prepri.print("]");
		}
	}
	
	public MJType getType() {
		return this.type;
	}
}