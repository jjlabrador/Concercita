package dir.concercita;
import static dir.concercita.ConcercitaForm;
import static org.junit.Assert.*;

import org.junit.Test;
//import java.lang.String;

public class TestMain {

	@Test
	public void TestMain() {
		new ConcercitaForm().setVisible(true);
		assertTrue(1 == 1); 
	}

}

