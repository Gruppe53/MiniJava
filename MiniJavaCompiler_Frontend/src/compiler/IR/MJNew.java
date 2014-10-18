package compiler.IR;

import compiler.PrettyPrinter;

public class MJNew extends MJExpression {

	private MJType type;
	
	public MJNew(MJType type){
		this.type = type;
	}
	
	public void prettyPrint(PrettyPrinter prepri) {
		prepri.print("new ");
		this.type.prettyPrint(prepri);
		prepri.print(";");
	}
	
	public MJType getType() {
		return this.type;
	}
}
