public class Pessoa extends PessoaBase implements CalculadoraIMC{
    private double peso;
    private double altura;
    private boolean ativo;
    public Pessoa(String nome,int idade,double peso,double altura){
        super(nome,idade);
        this.peso=peso;this.altura=altura;this.ativo=true;
    }
    public double getPeso(){return peso;}
    public double getAltura(){return altura;}
    public boolean isAtivo(){return ativo;}
    public void setPeso(double peso){
        if(peso<=0) throw new EntradaInvalidaException("Peso inválido.");
        this.peso=peso;
    }
    public double calcularIMC(double peso,double altura){
        return peso/CalculadoraRecursiva.potencia(altura,2);
    }
    public String classificarIMC(double imc){
        if(imc<18.5)return "Abaixo do peso";
        else if(imc<25)return "Peso normal";
        else if(imc<30)return "Sobrepeso";
        else if(imc<35)return "Obesidade Grau I";
        else if(imc<40)return "Obesidade Grau II";
        return "Obesidade Grau III";
    }
    public String exibirPerfil(){
        return "Nome: "+nome+" | Idade: "+idade;
    }
}