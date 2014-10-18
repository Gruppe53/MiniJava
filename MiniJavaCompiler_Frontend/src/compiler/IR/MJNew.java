package compiler.IR;

import compiler.PrettyPrinter;

public class MJNew extends MJExpression {
	private String name;
	
	public MJNew(String name) {
		this.name = name;
	}
	
	public void prettyPrint(PrettyPrinter prepri) {
		prepri.print("new " + name + "();");
	}
}
