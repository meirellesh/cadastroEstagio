package code;

import java.util.ArrayList;

public class Cadastrados {

    protected ArrayList<Cadastro> cadastrados;

    public Cadastrados() {
        cadastrados = new ArrayList<>();
    }

    public ArrayList<Cadastro> getCadastrados() {
        return cadastrados;
    }

    public void addCadastro(Cadastro pessoa) {

        if(validaEmail(pessoa.getEmail())){
        cadastrados.add(pessoa);
        
        }
    }

    public boolean validaEmail(String email) {

        for (int i = 0; i < cadastrados.size(); i++) {
            if (email.contains(cadastrados.get(i).getEmail())) {

                return false;
            }

        }

        return true;

    }

    public int totalPessoas() {

        return cadastrados.size();

    }

       public ArrayList<String> listaEmail() {
        ArrayList<String> res = new ArrayList<>();

        for (int i = 0; i < cadastrados.size(); i++) {
            if (!res.contains(cadastrados.get(i).getEmail())) {
                res.add(cadastrados.get(i).getEmail());
            }
        }

        return res;
    }
       
      public ArrayList<Cadastro> emailCadastrado(String email) {
        ArrayList<Cadastro> res = new ArrayList<>();

        for (int i = 0; i < cadastrados.size(); i++) {
            if (cadastrados.get(i).getEmail().equalsIgnoreCase(email)) {
                res.add(cadastrados.get(i));
            }
        }
        return res;
    } 

      
      
public void checagemCadastrados() throws excecaoCadastrados{
        if(cadastrados.isEmpty()){
            throw new excecaoCadastrados("Não há cadastrados");
        }
            
    }

}
