
package escola.escola;

import escola.aluno.Aluno;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe Jose");
        felipe.setIdade(17);

        System.out.println("o aluno"+ felipe.getNome()+ "tem" + felipe.getIdade());
    }

}
