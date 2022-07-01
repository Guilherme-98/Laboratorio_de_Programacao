import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

		private static String conexao;
		
		private static ConexaoBD instanciaUnica;
		
		private ConexaoBD() {
			this.conexao = "Conexão Aceita";
			
		}
		
		public static ConexaoBD getInstancia(){
			if(instanciaUnica == null) {
				instanciaUnica  = new ConexaoBD();
			}
			
			return instanciaUnica;
		}
		
		public String getConexao() {
			if (conexao != null) {
				return conexao;
			} else {
				return "Variavel conexão não iniciada.";
			}
		}
	
}
