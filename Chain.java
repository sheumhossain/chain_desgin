package chainResponsibility;

public interface Chain {
	public void setNextChain(Chain nextChain );
	public void calculate(Numbers requests );
}
