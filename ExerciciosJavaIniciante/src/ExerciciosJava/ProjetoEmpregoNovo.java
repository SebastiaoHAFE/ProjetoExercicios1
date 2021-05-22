  package  ExerciciosJava ;

public  class  ProjetoEmpregoNovo {

	public  static  void  main ( String [] args ) {

		/*Projeto Idade da Pessoa em dias*/
		
		int idadePessoa =  730 ;
		
		
		System.out.println ( " Anos: "  + (idadePessoa -  728 ));
		System.out.println ( " Mes: "  + (idadePessoa -  706 ));
		System.out.println ( " Dias: "  + idadePessoa);
		 
		System.out.println("-----------------------------------------------------------");
		
		int A = 30;
		 int B = 10;
		 
		 int soma = 30 + 10;
		 
		 System.out.println("SOMA = "+ soma + " fim de linha");
		
		 
			System.out.println("-----------------------------------------------------------");

			/*Projeto Media do Aluno*/
			
			double nota1 = 30;
			double nota2 = 40;
			double nota3 = 30;
			double nota4 = 50;
			
			double media = (nota1 + nota2 + nota3 + nota4) / 4;
			
			if(media >= 70) {
				System.out.println("O Aluno esta Aprovado " + media);
			}else if(media >= 40 && media <= 69) {
				System.out.println("O Aluno ficou em Recuperação " + media);
			}else {
				System.out.println("O Aluno Foi Reprovado " + media);
			
			}
	
	
	
	
	
	}
}