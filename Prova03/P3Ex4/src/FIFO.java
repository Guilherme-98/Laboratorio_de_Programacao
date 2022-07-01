public class FIFO{
    int inicio;
    int fim;
    int tamanho;
    int qtdeElementos;
    int f[];

    public FIFO(){
        inicio = fim = -1;
        tamanho = 100;
        f = new int[tamanho];
        qtdeElementos = 0;
    }

    public boolean estaVazia(){
        if (qtdeElementos == 0){
            return true;
        }
        return false;
    }

    public boolean estaCheia(){
        if (qtdeElementos == tamanho - 1){
            return true;
        }
        return false;
    }

    public void add(int e){
        if (! estaCheia()){
            if (inicio == -1){
                inicio = 0;
            }
            fim++;
            f[fim] = e;
            qtdeElementos++;
        }
    }

    public int remove(){
    	int item = f[inicio];
        if (! estaVazia() ){
            inicio++;
            qtdeElementos--;
        }
        return item;
    }
    
    public int size() {
    	return qtdeElementos;
    }

    public void mostrar(){
        String elementos = "";
            for (int i = inicio; i<=fim; i++) {
                elementos += f[i]+ "  ";
            }
            System.out.printf("%s\n", elementos);
    }
}