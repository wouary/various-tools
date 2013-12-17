package dz.cst.wt.autoformation.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

	private List<Memento> states = new ArrayList<Memento>();
	
	public void addMemento(final Memento memento) {
		states.add(memento);
	}
	
	public Memento getMemento(final int index) {
		return states.get(index);
	}
	
}
