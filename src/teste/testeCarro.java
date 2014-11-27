package teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import testeGitJenkins.Carro;

public class testeCarro {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Carro c = new Carro();
		c.valor=1;
		assertTrue(c.calculo()==2);
	}

}
