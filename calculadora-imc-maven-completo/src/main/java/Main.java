import java.util.Scanner;
public class Main{
    private static final Scanner scanner=new Scanner(System.in);

    public static void main(String[] args){
        SistemaIMC sistema=new SistemaIMC();
        Pessoa pessoaAtual=null;
        int opcao=-1;

        do{
            try{
                System.out.println("\n=== MENU ===");
                System.out.println("1-Cadastrar Pessoa");
                System.out.println("2-Cadastrar Atleta");
                System.out.println("3-Calcular IMC");
                System.out.println("4-Exibir Histórico");
                System.out.println("0-Sair");

                opcao=lerInt("Opção: ");

                switch(opcao){
                    case 1:
                        pessoaAtual=new Pessoa(
                            lerString("Nome: "),
                            lerInt("Idade: "),
                            lerDouble("Peso: "),
                            lerDouble("Altura: ")
                        );
                        System.out.println("Pessoa cadastrada.");
                        break;
                    case 2:
                        pessoaAtual=new Atleta(
                            lerString("Nome: "),
                            lerInt("Idade: "),
                            lerDouble("Peso: "),
                            lerDouble("Altura: "),
                            lerString("Modalidade: ")
                        );
                        System.out.println("Atleta cadastrado.");
                        break;
                    case 3:
                        if(pessoaAtual==null){
                            System.out.println("Nenhuma pessoa cadastrada.");
                        }else{
                            double alt2=CalculadoraRecursiva.potencia(pessoaAtual.getAltura(),2);
                            System.out.println("Altura²: "+alt2);
                            sistema.processar(pessoaAtual);
                        }
                        break;
                    case 4:
                        sistema.exibirHistorico();
                        break;
                    case 0:
                        System.out.println("Encerrando...");
                        break;
                    default:
                        throw new EntradaInvalidaException("Opção inválida.");
                }
            }catch(EntradaInvalidaException e){
                System.out.println("Erro: "+e.getMessage());
            }
        }while(opcao!=0);
    }

    private static double lerDouble(String msg){
        System.out.print(msg);
        try{
            double v=Double.parseDouble(scanner.nextLine());
            if(v<=0) throw new EntradaInvalidaException("Valor deve ser positivo.");
            return v;
        }catch(NumberFormatException e){
            throw new EntradaInvalidaException("Número inválido.");
        }
    }
    private static int lerInt(String msg){
        System.out.print(msg);
        try{return Integer.parseInt(scanner.nextLine());}
        catch(NumberFormatException e){throw new EntradaInvalidaException("Inteiro inválido.");}
    }
    private static String lerString(String msg){
        System.out.print(msg);
        String s=scanner.nextLine();
        if(s.trim().isEmpty()) throw new EntradaInvalidaException("Texto vazio.");
        return s;
    }
}