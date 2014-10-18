package compiler.IR;

import compiler.PrettyPrinter;

public class MJNew extends MJExpression {
	protected String name;
	
	public MJNew() {}
	
	public MJNew(String name) {
		this.name = name;
	}
	
	public void prettyPrint(PrettyPrinter prepri) {
		prepri.print("new " + name + "();");
	}
	
	public String getName() {
		return this.name;
	}
}
