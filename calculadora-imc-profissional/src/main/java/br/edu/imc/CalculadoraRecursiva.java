package br.edu.imc;
public class CalculadoraRecursiva{
 public static double potencia(double b,int e){return e==0?1:b*potencia(b,e-1);}
}