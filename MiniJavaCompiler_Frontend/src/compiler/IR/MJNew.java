package compiler.IR;

import compiler.PrettyPrinter;

public class MJNew extends MJExpression {
	public MJNew(String name) {
		if(name == "int")
			this.type = MJType.getIntType();
		else if(name == "boolean")
			this.type = MJType.getBooleanType();
		else
			this.type = MJType.getClassType(name);
	}
	
	public MJNew(String name, boolean isArray) {
		if(isArray)
			this.type = MJType.getArrayType(name);
		else
			new MJNew(name);	
	}
	
	public void prettyPrint(PrettyPrinter prepri) {
		prepri.print("new ");
		this.type.prettyPrint(prepri);
		prepri.print("()");
	}
}