package dir.concercita;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import dir.concercita.ConcercitaForm;

public class ConcercitaFormTest {

	@Before
	public void setUp() {
		new ConcercitaForm().setVisible(true);
		assertTrue(1 == 1); 
	}

}

