package br.edu.imc;
public class Pessoa extends PessoaBase implements CalculadoraIMC{
 private double peso,altura; private boolean ativo=true;
 public Pessoa(String n,int i,double p,double a){super(n,i);peso=p;altura=a;}
 public double getPeso(){return peso;} public double getAltura(){return altura;}
 public boolean isAtivo(){return ativo;}
 public double calcularIMC(double p,double a){return p/CalculadoraRecursiva.potencia(a,2);}
 public String classificarIMC(double imc){return imc<18.5?"Abaixo do peso":imc<25?"Peso normal":imc<30?"Sobrepeso":"Obesidade";}
 public String exibirPerfil(){return nome+" ("+idade+")";}
}