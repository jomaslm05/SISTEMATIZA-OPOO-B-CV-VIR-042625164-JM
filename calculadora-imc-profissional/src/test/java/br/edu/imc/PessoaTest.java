package br.edu.imc;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PessoaTest{
 @Test void calculaImc(){
  Pessoa p=new Pessoa("A",20,80,2);
  assertEquals(20.0,p.calcularIMC(80,2),0.01);
 }
}