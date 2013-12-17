package dz.cst.wt.autoformation.designpattern.memento;

import javax.faces.component.StateHolder;
import javax.faces.context.FacesContext;

public class Originator2 implements StateHolder {

	@Override
	public boolean isTransient() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void restoreState(FacesContext arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object saveState(FacesContext arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTransient(boolean arg0) {
		// TODO Auto-generated method stub

	}

}
