package compiler.IR;

import compiler.PrettyPrinter;

public class MJNewArray extends MJNew {
	private String argument;
	
	public MJNewArray(String argument){
		this.type = MJType.getArrayType("int");
		this.argument = argument;
	}
	
	public void prettyPrint(PrettyPrinter prepri) {
		if (type.isArray()) {
			prepri.print("new ");
			this.type.prettyPrint(prepri);
			prepri.print("[" + argument + "]");
			prepri.print(";");
		}
	}
	
	public MJType getType() {
		return this.type;
	}
}
