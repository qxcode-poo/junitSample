package codes;

import java.util.Iterator;
import java.util.List;

public interface ICalc {
	//retorne a soma de dois números
	public int sum(int a, int b);
	
	//retorne uma lista indo de 1 até n incluindo n
	List<Integer> umAteN(int n);
	
	//retorne o maior número, dado o iterador passado
	int getMaior(Iterator<Integer> it);
}
