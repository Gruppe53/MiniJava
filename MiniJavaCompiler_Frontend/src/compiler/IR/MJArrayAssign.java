	package compiler.IR;

import compiler.PrettyPrinter;

public class MJArrayAssign extends MJStatement {
	private MJIdentifier array;
	private MJExpression index;
	private MJExpression exp;
	
	public MJArrayAssign(MJIdentifier array, MJExpression idx, MJExpression exp) {
		this.array = array;
		this.index = idx;
		this.exp = exp;
	}

	public MJIdentifier getArray() {
		return array;
	}

	public MJExpression getIndex() {
		return index;
	}
	
	public MJExpression getExp() {
		return exp;
	}

	public void prettyPrint(PrettyPrinter prepri) {
		this.array.prettyPrint(prepri);
		prepri.print("[");
		this.index.prettyPrint(prepri);
		prepri.print("] = ");
		this.exp.prettyPrint(prepri);
		prepri.print(";");
	}
}
