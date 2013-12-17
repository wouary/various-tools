package dz.cst.wt.autoformation.designpattern.chainofresponsability;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Chaine de responsabilité : 
 * 
 * - Une requête doit pouvoir être traitée par un ensemble d'objets (lié sous forme d'une chaîne).
 * - Chaque objet ne pouvant traître la requête doit l'affecter à un autre.
 * - L'expéditeur ne peut désigner l'objet qui traitera effectivement la requête.
 * - La possibilité que la requête ne puisse être traiter doit être acceptable. * 
 */
public class PatternChaineOfResponsabilityTest {
	
	IProcessor processor;
	
	@BeforeClass
	private void init() {
		processor = new OneSeriesProcessor(new ThreeSeriesProcessor(new FiveSeriesProcessor(null)));
	}
	
	@Test
	public void testOnSeries() {
		Assert.assertEquals(OneSeriesProcessor.SERIE, processor.process("E81"));
		Assert.assertEquals(OneSeriesProcessor.SERIE, processor.process("E82"));
		Assert.assertEquals(OneSeriesProcessor.SERIE, processor.process("E87"));
		Assert.assertEquals(OneSeriesProcessor.SERIE, processor.process("E88"));
		Assert.assertEquals(OneSeriesProcessor.SERIE, processor.process("F20"));
		Assert.assertEquals(OneSeriesProcessor.SERIE, processor.process("F22"));
		Assert.assertEquals(OneSeriesProcessor.SERIE, processor.process("F21"));
	}
 
	@Test
	public void testThreeSeries() {
		Assert.assertEquals(ThreeSeriesProcessor.SERIE, processor.process("E21"));
		Assert.assertEquals(ThreeSeriesProcessor.SERIE, processor.process("E30"));
		Assert.assertEquals(ThreeSeriesProcessor.SERIE, processor.process("E36"));
		Assert.assertEquals(ThreeSeriesProcessor.SERIE, processor.process("E46"));
		Assert.assertEquals(ThreeSeriesProcessor.SERIE, processor.process("E90"));
		Assert.assertEquals(ThreeSeriesProcessor.SERIE, processor.process("F82"));
	}
	
	@Test
	public void testFiveSeries() {
		Assert.assertEquals(FiveSeriesProcessor.SERIE, processor.process("E27"));
		Assert.assertEquals(FiveSeriesProcessor.SERIE, processor.process("E39"));
		Assert.assertEquals(FiveSeriesProcessor.SERIE, processor.process("E60"));
		Assert.assertEquals(FiveSeriesProcessor.SERIE, processor.process("F10"));
	}
	
	@Test
	public void testNotBMW() {
		Assert.assertEquals(IProcessor.UNKOWN, processor.process("E96"));
		Assert.assertEquals(IProcessor.UNKOWN, processor.process("E05"));
	}
	
}
