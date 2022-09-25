public class Aluno {

    private String nome;
    private String matricula;
    private int idade;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void mostrar(){

        System.out.println("Nome do aluno : " + this.getNome());
        System.out.println("Matricula do aluno : " + this.getMatricula());
        System.out.println("Idade do aluno : " + this.getIdade());



    }


}
