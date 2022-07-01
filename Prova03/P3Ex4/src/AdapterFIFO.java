
public class AdapterFIFO extends DataQueue{
	private FIFO fifo;

	
	public AdapterFIFO(FIFO fifo){
		this.fifo = fifo;
    
    }	
	
	public void putItem(int e){
      this.fifo.add(e);
    }
	
	public int getItem() {
		return this.fifo.remove();
		
	}
	
	public boolean IsEmpty(){
		if(this.fifo.size() == 0){
			return true;
		}else {
			return false;
		}
	}
	
}
