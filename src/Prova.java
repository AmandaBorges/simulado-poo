import java.util.Scanner;

public class Prova {

  private Aluno alunoCanditado;
  private Questao q1, q2, q3, q4;
  private int  resposta01, resposta02, resposta03, resposta04;
  private  int nota;
  Scanner input = new Scanner(System.in);



    public Prova(Aluno alunoCanditado, Questao q1, Questao q2, Questao q3, Questao q4, int resposta01, int resposta02,
                 int resposta03, int resposta04) {
        this.alunoCanditado = alunoCanditado;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.resposta01 = resposta01;
        this.resposta02 = resposta02;
        this.resposta03 = resposta03;
        this.resposta04 = resposta04;
    }

    public int getNota() {
        return nota;
    }

    public void aplicarProva(){
        Scanner Leitor = new Scanner(System.in);

        q1.mostrar();
        resposta01 = input.nextInt();
        resposta02 = input.nextInt();
        resposta03 = input.nextInt();
        resposta04 = input.nextInt();

    }

    public void corrigirProva() {
        if (this.q1.estaCorreto(this.resposta01)) {
            this.nota += 2;
        }
        if (this.q2.estaCorreto(this.resposta02)) {
            this.nota += 2;
        }
        if (this.q3.estaCorreto(this.resposta03)) {
            this.nota += 2;
        }
        if (this.q4.estaCorreto(this.resposta04)) {
            this.nota += 2;
        }

        System.out.println(this.nota);
    }
}
