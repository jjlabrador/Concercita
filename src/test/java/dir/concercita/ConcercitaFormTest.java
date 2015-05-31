package dir.concercita;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import dir.concercita.ConcercitaForm;

public class ConcercitaFormTest {
	
	ConcercitaForm form;
	
	@Test
	public void setUp() {
		form = new ConcercitaForm();
		form.setVisible(true);
		assertTrue(1 == 1); 
	}

}

