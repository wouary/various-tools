package dz.cst.wt.autoformation.designpattern.memento;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Memento : Permet de rétablir un objet à un état précédent, l'encapsulation d'un objet ne doit être compromise.
 *      Originator : Classe des objets dont l'état doit être restauré, crée les instances Memento pour une utilisation ultérieure lors des "undo".
 *       Memento : Classe pojo destiné à sauvegarder l'état du Originator. Les instances Memento ne doivent pas être accessibles aux autres objets.
 *       
 * Dans API Java l'interface <code>javax.faces.component.StateHolder</code> fournit un contrat pour l'implémentation du pattern Memento.
 *
 */
public class PatternMementoTest {
	
	private Originator threeSerie;

	@BeforeClass
	public void init() {
		threeSerie = new Originator();
		
		threeSerie.setState("E21");
		threeSerie.setState("E36");
		threeSerie.setState("E46");
		threeSerie.setState("E92");
		threeSerie.setState("F30");
		threeSerie.setState("F80");
	}
	
	@Test
	public void testRestoreState() {
		Assert.assertEquals("F80", threeSerie.getState());
		threeSerie.restoreState(0);
		Assert.assertEquals("E21", threeSerie.getState());
		threeSerie.restoreState(3);
		Assert.assertEquals("E92", threeSerie.getState());
		threeSerie.restoreState(1);
		Assert.assertEquals("E36", threeSerie.getState());
		threeSerie.restoreState(4);
		Assert.assertEquals("F30", threeSerie.getState());
		threeSerie.restoreState(2);
		Assert.assertEquals("E46", threeSerie.getState());
		threeSerie.restoreState(5);
		Assert.assertEquals("F80", threeSerie.getState());
	}
	
	@Test(expectedExceptions = IllegalArgumentException.class) 
	public void testRestoreInexistanteState() {
		threeSerie.restoreState(200);
	}
	
	
}
