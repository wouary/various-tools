package dz.cst.wt.autoformation.designpattern.chainofresponsability;

import java.util.HashSet;


public class OneSeriesProcessor extends AbstractProcessor {
	
	public static final String SERIE = "One serie";
	
	public OneSeriesProcessor(IProcessor next) {
		codes = new HashSet<String>();
		codes.add("E81");
		codes.add("E82");
		codes.add("E87");
		codes.add("E88");
		codes.add("F20");
		codes.add("F21");
		codes.add("F22");
		
		this.next = next;
	}

	/**
	 * @see dz.cst.wt.autoformation.designpattern.chainofresponsability.AbstractProcessor#getSerie()
	 */
	@Override
	public String getSerie() {
		return SERIE;
	}

}
