package dz.cst.wt.autoformation.designpattern.chainofresponsability;

import java.util.HashSet;

public class FiveSeriesProcessor extends AbstractProcessor {
	
	public static final String SERIE = "Five serie";
	
	public FiveSeriesProcessor(IProcessor next) {
		codes = new HashSet<String>();
		codes.add("E27");
		codes.add("E39");
		codes.add("E60");
		codes.add("E61");
		codes.add("F10");
		codes.add("F11");
		
		this.next = next;
	}

	@Override
	public String getSerie() {
		return SERIE;
	}

}
