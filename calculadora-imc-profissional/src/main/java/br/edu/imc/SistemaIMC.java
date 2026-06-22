package br.edu.imc;
public class SistemaIMC{
 private Historico historico=new Historico();
 public void processar(Pessoa p){
  double imc=p.calcularIMC(p.getPeso(),p.getAltura());
  String r=String.format("%s | IMC %.2f | %s",p.getNome(),imc,p.classificarIMC(imc));
  historico.adicionarRegistro(r); System.out.println(r);
 }
 public void exibirHistorico(){historico.exibir();}
}