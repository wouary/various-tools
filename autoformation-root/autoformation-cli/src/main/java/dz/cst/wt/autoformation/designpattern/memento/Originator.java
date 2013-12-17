package dz.cst.wt.autoformation.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

public class Originator {
	
	private String state;
	
	private List<Memento> states = new ArrayList<Memento>();

	public Originator() {
		super();
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		createMemento();
	}

	private Memento createMemento() {
		final Memento memento = new Memento(this.state);
		states.add(memento);
		
		return memento;
	}
	
	public void restoreState(int index) {
		try {
			final Memento memento = states.get(index);
			state = memento.getState();
		}
		catch (IndexOutOfBoundsException exception){
			throw new IllegalArgumentException("L'objet ne possède pas d'état de niveau " + index, exception);
		}
	}

}
