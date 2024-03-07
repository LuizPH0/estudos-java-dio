public class Escola {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Felipe");
		aluno.setIdade(19);
        aluno.setSexo("masc");
		
		System.out.println("O aluno " + aluno.getNome() + " tem " + aluno.getIdade() + " anos e é do sexo "+aluno.getSexo());	
	}
}