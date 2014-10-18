package compiler.IR;

import java.util.LinkedList;

import compiler.PrettyPrinter;

public class MJMethodCallStmt extends MJStatement {
	private String name;
	private String methodName;
	private LinkedList<MJExpression> arguments;
	private int i = 1;
	
	public MJMethodCallStmt(String name, String methodName, LinkedList<MJExpression> arguments) {
		this.name = name;
		this.methodName = methodName;
		this.arguments = arguments;
	}

	public void prettyPrint(PrettyPrinter prepri) {
		prepri.print(name + "." + methodName + "(");
		this.arguments.get(0).prettyPrint(prepri);
		while (i <= arguments.size()){
			prepri.print(", ");
			this.arguments.get(i).prettyPrint(prepri);
			i++;
		}
		prepri.print(");");
	}
}
