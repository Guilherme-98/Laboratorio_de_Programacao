import java.util.LinkedList;

public class Pump {
	private int identification;
	
	private LinkedList<Combustivel> comb;
	
	Pump(){
		this.comb = new LinkedList<Combustivel>();
	}

	public LinkedList<Combustivel> getComb() {
		return comb;
	}
	
	public void setComb(Combustivel comb) {
		this.comb.add(comb);
	}

	public int getId() {
		return identification;
	}

	public void setId(int id) {
		this.identification = id;
	}
}

