package symboltable;

public class Sym {
	
	private String type;
	
	public Sym(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public String toString() {
		String str = type + "";
		return str;
	}
}