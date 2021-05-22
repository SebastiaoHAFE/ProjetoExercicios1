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
				System.out.println("O Aluno esta Aprovado: Media " + media);
			}else if(media >= 40 && media <= 69) {
				System.out.println("O Aluno ficou em Recuperação: Media " + media);
			}else {
				System.out.println("O Aluno Foi Reprovado: Media " + media);
			
			}
	
			System.out.println("-----------------------------------------------------------");

	/* OPERAÇÕES MATEMATICAS */
			
			double raiz1 = Math.sqrt(45);
			
			System.out.println("O Valor a Raiza Quadrada de 45 é ? ");
			System.out.println("Resultado: " + raiz1);
			

			double potencia = Math.pow(2, 3);
			
			System.out.println("Qual é a Potencia de 2 sobre 3 ?");
			System.out.println("Resultado: " + potencia);
			
			int sub = (15 + 45);
			
			System.out.println("o Resultado dessa soma é ?");
			System.out.println("Resultado: " + sub);
			
			int menos = (534 - 357);
			
			System.out.println("O Resultado da conta de menos é ?");
			System.out.println("Resultado: " + menos);
			
			System.out.println("-----------------------------------------------------------");

	
	}
}