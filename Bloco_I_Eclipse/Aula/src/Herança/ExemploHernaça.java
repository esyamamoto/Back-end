package Heran�a;

public class ExemploHerna�a {
	public static void main(String[] args)
	{
		Professor p = new Professor();
		Aluno a = new Aluno();
		
		p.setNome("Erika");
		p.setIdade(25);
		p.corrigirProva();
		p.anivers�rio();
		a.setNome("Dri"); 
		a.setMedia(10);
		
		System.out.println(p.getNome()+" "+ p.getIdade());
		
		
	}
}
