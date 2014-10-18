package compiler.IR;

import compiler.PrettyPrinter;

public class MJNewArray extends MJNew {

	private MJType type;
	
	public MJNewArray(MJType type){
		super(type);
	}
	
	public void prettyPrint(PrettyPrinter prepri) {
		if (type.isArray()) {
			prepri.print("new ");
			this.type.prettyPrint(prepri);
			prepri.print(";");
		}
		
		// TODO Check validity of line 14
	}
	
	public MJType getType() {
		return this.type;
	}
}
