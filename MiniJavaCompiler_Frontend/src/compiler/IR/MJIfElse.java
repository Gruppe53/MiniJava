package compiler.IR;

import compiler.PrettyPrinter;

public class MJIfElse extends MJIf {
	private MJStatement elseStmt;
	
	public MJIfElse(MJExpression argument, MJStatement ifStmt, MJStatement elseStmt) {
		super(argument, ifStmt);
		this.elseStmt = elseStmt;
	}

	public void prettyPrint(PrettyPrinter prepri) {
		prepri.print("if (");
		this.argument.prettyPrint(prepri);
		prepri.println(") ");
		this.ifStmt.prettyPrint(prepri);
		prepri.println("else");
		this.elseStmt.prettyPrint(prepri);
	}
}
