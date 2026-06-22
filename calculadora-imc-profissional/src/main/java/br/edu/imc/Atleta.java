package br.edu.imc;
public class Atleta extends Pessoa{
 private String modalidade;
 public Atleta(String n,int i,double p,double a,String m){super(n,i,p,a);modalidade=m;}
 @Override public String classificarIMC(double imc){return imc<20?"Baixa massa":imc<=27?"Ideal atleta":"Acima da faixa";}
 @Override public String exibirPerfil(){return super.exibirPerfil()+" - "+modalidade;}
}