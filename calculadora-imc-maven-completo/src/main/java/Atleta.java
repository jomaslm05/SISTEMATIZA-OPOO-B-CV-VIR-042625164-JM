public class Atleta extends Pessoa{
    private String modalidade;
    public Atleta(String nome,int idade,double peso,double altura,String modalidade){
        super(nome,idade,peso,altura);
        this.modalidade=modalidade;
    }
    @Override
    public String classificarIMC(double imc){
        if(imc<20)return "Baixa massa corporal";
        else if(imc<=27)return "Faixa ideal para atleta";
        else if(imc<=30)return "Massa muscular elevada";
        return "Avaliação especializada recomendada";
    }
    @Override
    public String exibirPerfil(){
        return super.exibirPerfil()+" | Modalidade: "+modalidade;
    }
}