package symboltable;

import java.util.*;

public class SymTable {
	
	List<HashMap<String, Sym>> symList;
	
	public SymTable() {
		// TODO: linked list instead of arr list?
		symList = new ArrayList<HashMap<String, Sym>>();
	}
	
	// TODO: implement
	public void addDecl(String name, Sym sym) throws DuplicateSymException, EmptySymTableException {
		if (symList.isEmpty()) throw new EmptySymTableException();
		if (name == null || sym == null) throw new NullPointerException();
	}
	
	// TODO: implement
	public void addScope() {
		
	}
	
	// TODO: implement
	public Sym lookupLocal(String name) throws EmptySymTableException {
		if (symList.isEmpty()) throw new EmptySymTableException();
		return null;
	}
	
	// TODO: implement
	public Sym lookupGlobal(String name) throws EmptySymTableException {
		if (symList.isEmpty()) throw new EmptySymTableException();
		return null;
	}
	
	// TODO: implement
	public void removeScope() throws EmptySymTableException {
		if (symList.isEmpty()) throw new EmptySymTableException();
		
	}
	
	// TODO: implement
	public void print() {
		
	}
}