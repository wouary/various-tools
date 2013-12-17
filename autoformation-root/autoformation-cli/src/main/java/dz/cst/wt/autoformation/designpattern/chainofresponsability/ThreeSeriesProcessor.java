package dz.cst.wt.autoformation.designpattern.chainofresponsability;

import java.util.HashSet;


public class ThreeSeriesProcessor extends AbstractProcessor {
	
	public static final String SERIE = "Three serie";
	
	public ThreeSeriesProcessor(IProcessor next) {
		codes = new HashSet<String>();
		codes.add("E21");
		codes.add("E30");
		codes.add("E36");
		codes.add("E46");
		codes.add("E90");
		codes.add("E91");
		codes.add("E92");
		codes.add("F30");
		codes.add("F31");
		codes.add("F32");
		codes.add("F80");
		codes.add("F82");
		
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
