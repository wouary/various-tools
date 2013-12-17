package dz.cst.wt.autoformation.designpattern.chainofresponsability;

import java.util.Set;

public abstract class AbstractProcessor implements IProcessor {
	
	protected IProcessor next;
	protected Set<String> codes;
	
	@Override
	public String process(final String carCode) {
		if (codes.contains(carCode)) {
			return getSerie();
		}
		if (next != null) {
			return next.process(carCode);
		}
		return UNKOWN;
	}

	@Override
	public void setNext(final IProcessor next) {
		this.next = next;
	}
	
	abstract public String getSerie(); 

}
