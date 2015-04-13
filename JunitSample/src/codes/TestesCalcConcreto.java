package codes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestesCalcConcreto {

	@Test
	public void testSum() {
		Calc calc = new Calc();
		assertTrue(calc.sum(4, 5) == 9);
		assertFalse(calc.sum(1, 1) == 3);;
	}

	@Test
	public void testUmAteN() {
		Calc calc = new Calc();
		List<Integer> recebido = calc.umAteN(4);
		int[] resp = {1, 2, 3, 4};
		for(int i = 0; i < resp.length; i++){
			if(recebido.get(i) != resp[i]){
				fail();
				return;
			}
		}
		assertTrue(true);
	}

	@Test
	public void testGetMaior() {
		List<Integer> lista= new ArrayList<>();
		int[] vetor = {1, 2, 3, 4, 3, 3, 2, 5, 8, 5, 3};
		for(int elem : vetor)
			lista.add(elem);
		
		Calc calc = new Calc();
		assertTrue(calc.getMaior(lista.iterator()) == 8);
	}

}
