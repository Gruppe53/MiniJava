package compiler.IR;

import compiler.PrettyPrinter;

public class MJMult extends MJBinaryOp {
	
	public MJMult(MJExpression a, MJExpression b) {
		super(a, b);
	}

	public void prettyPrint(PrettyPrinter prepri) {
		this.lhs.prettyPrint(prepri);
		prepri.print(" * ");
		this.rhs.prettyPrint(prepri);
	}
}
