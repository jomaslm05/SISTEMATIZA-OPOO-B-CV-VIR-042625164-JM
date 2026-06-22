package br.edu.imc;
import java.util.*;
public class Historico{
 private final List<String> registros=new ArrayList<>();
 public void adicionarRegistro(String r){registros.add(r);}
 public void exibir(){if(registros.isEmpty())System.out.println("Histórico vazio."); else registros.forEach(System.out::println);}
}