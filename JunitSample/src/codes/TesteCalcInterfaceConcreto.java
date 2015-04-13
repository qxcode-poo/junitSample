package codes;

public class TesteCalcInterfaceConcreto extends TestesCalcInterface {

	ICalc getInstance() {
		return new Calc();
	}
}
