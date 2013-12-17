package dz.cst.wt.autoformation.designpattern.memento;

public class Memento {
	
	final private String state;

	public Memento(String state) {
		super();
		this.state = state;
	}
	
	public String getState() {
		return state;
	}

}
