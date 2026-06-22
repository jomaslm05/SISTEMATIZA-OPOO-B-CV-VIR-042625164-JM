public class SistemaIMC{
    private Historico historico=new Historico();
    public void processar(Pessoa pessoa){
        double imc=pessoa.calcularIMC(pessoa.getPeso(),pessoa.getAltura());
        String classificacao=pessoa.classificarIMC(imc);
        String resultado=String.format("%s | IMC: %.2f | %s",pessoa.getNome(),imc,classificacao);
        historico.adicionarRegistro(resultado);
        System.out.println(resultado);
    }
    public void exibirHistorico(){historico.exibir();}
}