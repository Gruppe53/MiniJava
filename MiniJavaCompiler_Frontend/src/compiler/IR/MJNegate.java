package compiler.IR;

import compiler.PrettyPrinter;

public class MJNegate extends MJUnaryOp {
	
	public MJNegate(MJExpression l) {
		super(l);
	}

	public void prettyPrint(PrettyPrinter prepri) {
		prepri.print("!");
		this.arg.prettyPrint(prepri);
	}
}
