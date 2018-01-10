package Contest4;
public class Symbol {

	String symbol = "";
	String var1 = "";
	String var2 = "";
	int pos;
	String result = null;
	
	public Symbol(String symbol, String var1, String var2, int pos) {
		setSymbol(symbol);
		setVar1(var1);
		setVar2(var2);
		setPos(pos);
	}

	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getVar1() {
		return var1;
	}
	public void setVar1(String var1) {
		this.var1 = var1;
	}
	public String getVar2() {
		return var2;
	}
	public void setVar2(String var2) {
		this.var2 = var2;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
}
