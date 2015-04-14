package codes;

public class TesteCalcInterfaceConcreto extends TestesCalcInterface {
	public ICalc getInstance() {
		return new Calc();
	}
}
