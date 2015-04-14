package codes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * 
 * @author tux
 * 
 * Aqui o metodo getInstance retorna uma classe calc 
 * concreta. O teste está voltado para a interface,
 * qualquer classe concreta que implemente essa classe
 * abstrata e implemente o getInstance poderá rodar os testes.
 *
 */

public abstract class TestesCalcInterface {
	
	public abstract ICalc getInstance();

	@Test
	public void testSum() {
		ICalc calc = getInstance();
		assertTrue(calc.sum(4, 5) == 9);
		assertFalse(calc.sum(1, 1) == 3);;
	}

	@Test
	public void testUmAteN() {
		ICalc calc = getInstance();
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
		
		ICalc calc = getInstance();
		assertTrue(calc.getMaior(lista.iterator()) == 8);
	}

}
