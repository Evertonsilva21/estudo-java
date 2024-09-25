import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String [] alunos = {"joao","marcelo","mariana", "beto"};

        double media = calculaMediaDaTurma(alunos,scan);
        System.out.printf("Média da turma " + media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner){
        double soma = 0;
        for(String aluno: alunos){
            System.out.printf("nota do aluno " + aluno +":");
            double nota = scanner.nextDouble();
            soma += nota;

        }
        return soma/alunos.length;

    }
    
}
