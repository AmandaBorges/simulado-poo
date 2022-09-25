public class Teste {

    public static void main (String[] args){

    Questao q1 = new Questao("O que é java", "Uma linguagem de progamação",
            "Uma linguagem popular","Uma linguagem de marcação", "Uma linguagem antiga",1);
    Questao q2 = new Questao("O que é GIT", "Uma comida", "Uma lenda urbana",
            "Uma forma de versionamento de código", "Um país",3);
    Questao q3 = new Questao("O que é java script", "Uma linguagem de progamação",
            "Uma linguagem popular","Uma linguagem de marcação", "Uma linguagem antiga",1);
    Questao q4 = new Questao("O que é html", "Uma linguagem de progamação",
            "Uma linguagem popular","Uma linguagem de marcação", "Uma linguagem antiga",3);

    Aluno aluno1 = new Aluno();
    aluno1.setNome("Amanda");
    aluno1.setMatricula("123456");
    aluno1.setIdade(29);

    Aluno aluno2 = new Aluno();
    aluno2.setNome("Gustavo");
    aluno2.setMatricula("23456");
    aluno2.setIdade(35);

    Prova prova1 = new Prova(aluno1, q1, q2, q3, q4, 2, 1, 1, 4);
    Prova prova2 = new Prova(aluno2, q1, q2, q3, q4, 2, 1, 1, 4);

    prova1.corrigirProva();

    }

}
