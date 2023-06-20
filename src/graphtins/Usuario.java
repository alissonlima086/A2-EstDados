package graphtins;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private Integer id;
    private String username;
    private Integer idade;
    private Interesses interesse;
    private List<Usuario> amigos;


    public Usuario(String username, Integer idade, Interesses interesse) {
        this.username = username;
        this.idade = idade;
        this.interesse = interesse;
        this.amigos = new ArrayList<>();
    }

    //Implementar
    public void buscarAmigosEmComum(Usuario amigos){

    }

    @Override
    public String toString() {
        return id + ": Usuario: "+ username + " | " + "Idade: " + idade + " | " + "Interesse: " + getInteresse().getLabel() + " | " + getNomeAmigos(getAmigos());
    }

    // Get Set

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public List<Usuario> getAmigos() {
        return amigos;
    }

    public List<String> getNomeAmigos(List<Usuario> listaAmigos){
        ArrayList<String> listaNomes = new ArrayList<>();
        for (Usuario usuario: listaAmigos) {
            listaNomes.add(usuario.getUsername());
        }
        return listaNomes;
    }

    public void setAmigos(List<Usuario> amigos) {
        this.amigos = amigos;
    }

    public Interesses getInteresse() {
        return interesse;
    }

    public void setInteresse(Interesses interesse) {
        this.interesse = interesse;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
