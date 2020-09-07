import java.util.ArrayList;
import java.util.List;

public class Corretora {

    private List<Investimento> listInvest = new ArrayList<Investimento>();
    private List<Usuario> listUser = new ArrayList<Usuario>();


    public void adicionaInvestimento(Investimento invest,Usuario user){

        listInvest.add(invest);
        listUser.add(user);

    }


     public void exibeInvestimentos(Usuario user){

         System.out.println(" Usuário: " + user.getNomeUsuario());

        for(Investimento invest : listInvest){
            System.out.println(invest);
        }


    }


    public void exibeUsuario(){

        for(Usuario user : listUser){
            System.out.println(user);
        }


    }
}
