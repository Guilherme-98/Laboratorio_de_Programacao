
public class DataGenerator {
	
	  public static void main(String[] args) {
	        FIFO f = new FIFO();       
	        
	        AdapterFIFO af = new AdapterFIFO(f);
	        
	        System.out.printf("Adicionado elemento: 1 na fila.\n");
	        System.out.printf("Adicionado elemento: 5 na fila.\n");
	        System.out.printf("Adicionado elemento: 9 na fila.\n");
	        af.putItem(1);
	        af.putItem(5);
	        af.putItem(9);
	        System.out.printf("tirando da fila %d:\n", af.getItem());
	        System.out.println(af.IsEmpty());
	        System.out.printf("tirando da fila %d:\n", af.getItem());
	        System.out.printf("tirando da fila %d:\n", af.getItem());
	        System.out.println(af.IsEmpty());


	    }
	  	  
}
