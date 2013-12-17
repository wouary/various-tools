package dz.cst.wt.autoformation.designpattern.chainofresponsability;

public interface IProcessor {

	public static final String UNKOWN = "UNKOWN";

	String process(String carCode);
	
	void setNext(IProcessor next); 

}
