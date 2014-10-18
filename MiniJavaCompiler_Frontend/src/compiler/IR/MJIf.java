package compiler.IR;

import compiler.PrettyPrinter;

public class MJIf extends MJStatement {
	protected MJExpression argument;
	protected MJStatement ifStmt;
	
	public MJIf(MJExpression argument, MJStatement ifStmt) {
		this.argument = argument;
		this.ifStmt = ifStmt;
	}
	
	public MJExpression getArgument() {
		return argument;
	}

	public MJStatement getIfStmt() {
		return ifStmt;
	}

	public void prettyPrint(PrettyPrinter prepri) {
		// TODO
	}
}
