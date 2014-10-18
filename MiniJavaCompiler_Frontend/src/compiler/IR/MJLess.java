package compiler.IR;

import compiler.PrettyPrinter;

public class MJLess extends MJBinaryOp {
	private MJExpression rhs;
	private MJExpression lhs;
	
	public MJLess(MJExpression lhs, MJExpression rhs) {
		this.rhs = rhs;
		this.lhs = lhs;
	}
	
	public void prettyPrint(PrettyPrinter prepri) {
		this.lhs.prettyPrint(prepri);
		prepri.print(" < ");
		this.rhs.prettyPrint(prepri);
	}
	
	public MJExpression getLhs() {
		return this.lhs;
	}

	public MJExpression getRhs() {
		return this.rhs;
	}
}
