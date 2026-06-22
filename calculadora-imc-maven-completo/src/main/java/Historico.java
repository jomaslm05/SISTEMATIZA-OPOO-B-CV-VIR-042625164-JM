import java.util.ArrayList;
public class Historico{
    private ArrayList<String> registros=new ArrayList<>();
    public void adicionarRegistro(String r){registros.add(r);}
    public void exibir(){
        if(registros.isEmpty()){System.out.println("Histórico vazio.");return;}
        for(String r:registros) System.out.println(r);
    }
}