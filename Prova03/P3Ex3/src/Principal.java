import java.sql.Connection;

public class Principal {
	
	public static void main(String[] args) {
		ConexaoBD conexaoBD = 
				ConexaoBD.getInstancia();
		
		String conexao = conexaoBD.getConexao();
		System.out.println(conexao);
		
	}
	
}
