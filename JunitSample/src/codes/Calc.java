package codes;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Calc implements ICalc {

	public Calc(){
		
	}
	
	@Override
	public int sum(int a, int b) {
		return a + b;
	}

	@Override
	public List<Integer> umAteN(int n) {
		List<Integer> list = new LinkedList();
		for(int i = 1; i <= n; i++)
			list.add(i);
		return list;
	}

	@Override
	public int getMaior(Iterator<Integer> it) {
		int max = it.next();
		while(it.hasNext()){
			int value = it.next();
			if(value > max)
				max = value;
		}
		
		return max;
	}

}
