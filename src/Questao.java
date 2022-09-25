public class Questao {

    public Object mostrar;
    private String enuciado;
    private String alternativa01;
    private String alternativa02;
    private String alternativa03;
    private String alternativa04;
    private int gabarito;

    Questao(String enuciado, String alternativa01,String alternativa02, String alternativa03, String alternativa04, int gabarito){
        this.enuciado = enuciado;
        this.alternativa01 = alternativa01;
        this.alternativa02 = alternativa02;
        this.alternativa03 = alternativa03;
        this.alternativa04 = alternativa04;
        this.gabarito = gabarito;

    }

    public void mostrar(){

        System.out.println("Enuciado: " + this.enuciado);
        System.out.println(this.alternativa01);
        System.out.println(this.alternativa02);
        System.out.println(this.alternativa03);
        System.out.println(this.alternativa04);
        System.out.println("Gabarito: " + this.gabarito);

        System.out.println("x x x x x x x ");

    }

    public boolean estaCorreto(int resposta){
        if(this.gabarito == resposta ){
            return true;
        }
        return  false;
    }


}
