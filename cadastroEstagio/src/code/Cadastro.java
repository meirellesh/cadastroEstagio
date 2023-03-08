package code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cadastro {

    private String nome;
    private String email;
    private String senha;
    

    public Cadastro(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email; 
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();

        b.append("Nome: ").append(nome).append("\n");
        b.append("E-mail: ").append(email).append("\n");
        b.append("Senha: ").append(senha).append("\n");
        
        return b.toString();
    }

}
