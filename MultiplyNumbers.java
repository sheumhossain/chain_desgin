package chainResponsibility;

public class MultiplyNumbers implements Chain {

	private Chain nextInChain;
	@Override
	public void setNextChain(Chain nextChain) {
		// TODO Auto-generated method stub
		this.nextInChain=nextChain;
	}

	@Override
	public void calculate(Numbers requests) {
		// TODO Auto-generated method stub
		if(requests.getCalculationWanted()=="mul") {
			System.out.println(requests.getNumber1()+ " x " + requests.getNumber2()+  " = " +
			(requests.getNumber1()*requests.getNumber2()));
		}
		else {
			nextInChain.calculate(requests);
		}
	}

}
