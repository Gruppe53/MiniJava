package compiler.IR;

import compiler.PrettyPrinter;

public class MJWhile extends MJStatement {
	private MJExpression argument;
	private MJStatement whileStmt;
	
	public MJWhile(MJExpression argument, MJStatement whileStmt) {
		this.argument = argument;
		this.whileStmt = whileStmt;
	}

	public void prettyPrint(PrettyPrinter prepri) {
		// TODO
	}
}
