public class Teste {

    public static void main (String[] args){

        Questao q1 = new Questao("O que é java", "Uma linguagem de progamação",
                "Uma linguagem popular","Uma linguagem de marcação",
                "Uma linguagem antiga",1);
        Questao q2 = new Questao("O que é GIT", "Uma comida", "Uma lenda urbana",
                "Uma forma de versionamento de código", "Um país",3);
        Questao q3 = new Questao("O que é java script", "Uma linguagem de progamação",
                "Uma linguagem popular","Uma linguagem de marcação",
                "Uma linguagem antiga",1);
        Questao q4 = new Questao("O que é html", "Uma linguagem de progamação",
                "Uma linguagem popular","Uma linguagem de marcação",
                "Uma linguagem antiga",3);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Amanda");
        aluno1.setMatricula("123456");
        aluno1.setIdade(29);



        Aluno aluno2 = new Aluno();
        aluno2.setNome("Gustavo");
        aluno2.setMatricula("23456");
        aluno2.setIdade(35);

        Aluno aluno3 = new Aluno();
        aluno3.setNome("Zé");
        aluno3.setMatricula("23457");
        aluno3.setIdade(22);

        Aluno aluno4 = new Aluno();
        aluno4.setNome("David");
        aluno4.setMatricula("23423");
        aluno4.setIdade(26);

        Aluno aluno5 = new Aluno();
        aluno5.setNome("Luis");
        aluno5.setMatricula("23567");
        aluno5.setIdade(25);

        Prova prova1 = new Prova(aluno1, q1, q2, q3, q4, 1, 1, 1, 4);
        Prova prova2 = new Prova(aluno2, q1, q2, q3, q4, 1, 3, 1, 3);
        Prova prova3 = new Prova(aluno3, q1, q2, q3, q4, 2, 1, 1, 4);
        Prova prova4 = new Prova(aluno4, q1, q2, q3, q4, 3, 3, 3, 3);
        Prova prova5 = new Prova(aluno5, q1, q2, q3, q4, 2, 3, 1, 3);

        Prova[] turma = new Prova[5];
        turma[0] = prova1;
        turma[1] = prova2;
        turma[2] = prova3;
        turma[3] = prova4;
        turma[4] = prova5;

        turma[0].corrigirProva();
        turma[1].corrigirProva();
        turma[2].corrigirProva();
        turma[3].corrigirProva();
        turma[4].corrigirProva();

        turma[0].getAlunoCanditado().mostrar();
        turma[1].getAlunoCanditado().mostrar();
        turma[2].getAlunoCanditado().mostrar();
        turma[3].getAlunoCanditado().mostrar();
        turma[4].getAlunoCanditado().mostrar();



    }

}
