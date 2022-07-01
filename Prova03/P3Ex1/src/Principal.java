
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Acao acao1 = new Acao("Novas tecnologias", "2020");
		Acao acao2 = new Acao("Atualidades no mundo computacional", "2020");

		Observer pessoa1 = new PessoaFisica ("Guilherme","11320551998");
		Observer pessoa2 = new PessoaFisica ("Luiz","11020501908");
		Observer pessoa3 = new PessoaFisica ("Maria","81040581008");
		
		System.out.printf("Cadastrando Guilherme na revista Novas tecnologias 2020\n");
		System.out.printf("Cadastrando Luiz na revista Novas tecnologias 2020\n\n");

		
		acao1.registrarInteressado (pessoa1);
		acao1.registrarInteressado (pessoa2);
		
		System.out.printf("************************\n\n");

		
		System.out.printf("Notificando nova edição.\n\n");
		acao1.setNomeRevista("Novas Tecnologias");
		acao1.setEdicaoRevista("2021");

		System.out.printf("************************\n\n");
		
		acao1.cancelarInteresse(pessoa2);
		System.out.printf("Cancelada a inscrição do Luiz na revista Novas tecnologias.\n\n");
		System.out.printf("Notificando nova edição.\n\n");
		acao1.setNomeRevista("Novas Tecnologias");
		acao1.setEdicaoRevista("2021.2");
		
		
		System.out.printf("************************\n\n");
		
		System.out.printf("Cadastrando Maria na revista Novas tecnologias e Atualidades no mundo computacional.\n\n");
		
		acao1.registrarInteressado (pessoa3);
		acao2.registrarInteressado (pessoa3);
		
		
		System.out.printf("Notificando nova edição.\n\n");
		acao1.setNomeRevista("Novas Tecnologias");
		acao1.setEdicaoRevista("2021.3");
		
		System.out.printf("Notificando nova edição.\n\n");
		acao2.setNomeRevista("Atualidades no mundo computacional");
		acao2.setEdicaoRevista("2021");
		
		System.out.printf("************************\n\n");
		
		System.out.printf("Notificando nova edição.\n\n");
		acao2.setNomeRevista("Atualidades no mundo computacional");
		acao2.setEdicaoRevista("2021.2");


	}

}
