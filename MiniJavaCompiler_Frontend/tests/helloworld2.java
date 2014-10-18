class testmain {
	
	public static void main(String[] args) {
		
		String s;
        A a;
        a = new A();
        s = a.firstpart() + a.secondpart();
		System.out.println(s);
		
	}
}

class A {

    String firstpart() {
        return "Hello ";
    }

    String secondpart() {
        return "World";
    }

}