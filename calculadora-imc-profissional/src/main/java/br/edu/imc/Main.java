package br.edu.imc;
import java.util.Scanner;
public class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  SistemaIMC sistema=new SistemaIMC(); Pessoa pessoa=null; int op=-1;
  while(op!=0){
   System.out.println("\n1-Pessoa 2-Atleta 3-IMC 4-Histórico 0-Sair");
   try{
    op=Integer.parseInt(sc.nextLine());
    switch(op){
     case 1 -> pessoa=new Pessoa(scPrompt(sc,"Nome:"),Integer.parseInt(scPrompt(sc,"Idade:")),Double.parseDouble(scPrompt(sc,"Peso:")),Double.parseDouble(scPrompt(sc,"Altura:")));
     case 2 -> pessoa=new Atleta(scPrompt(sc,"Nome:"),Integer.parseInt(scPrompt(sc,"Idade:")),Double.parseDouble(scPrompt(sc,"Peso:")),Double.parseDouble(scPrompt(sc,"Altura:")),scPrompt(sc,"Modalidade:"));
     case 3 -> { if(pessoa!=null) sistema.processar(pessoa); else System.out.println("Cadastre alguém.");}
     case 4 -> sistema.exibirHistorico();
     case 0 -> System.out.println("Fim.");
    }
   }catch(Exception e){System.out.println("Erro: "+e.getMessage());}
  }
 }
 static String scPrompt(Scanner sc,String m){System.out.print(m); return sc.nextLine();}
}