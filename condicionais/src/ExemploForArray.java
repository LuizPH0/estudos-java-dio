public class ExemploForArray {
    public static void main(String[] args) {
        String[] alunos = {"Ana Paula", "Alfredo", "Nestor", "Jorge", "Amanda", "Lucas"};

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno com matrícula "+i+" chama-se "+alunos[i]);
        }
    }
}
