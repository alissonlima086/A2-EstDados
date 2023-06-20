package graphtins;

import java.util.ArrayList;

public class Node {

    ArrayList<Vertex> edges;

    Usuario usuario;


    public ArrayList<Usuario> buscarPorConexao(Usuario user){
        ArrayList<Usuario> usuariosConectados = new ArrayList<>();

        for (Usuario amigoDeAmigo: user.getAmigos()){
            usuariosConectados.add(amigoDeAmigo);
        }
        //return (ArrayList<Usuario>) user.getAmigos();

        return usuariosConectados;
    }
    public  void buscarPorConexoes(Usuario user){

    }


    public Node(Usuario usuario) {
        this.usuario = usuario;
        this.edges = new ArrayList<Vertex>();
    }

    public ArrayList<Vertex> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Vertex> edges) {
        this.edges = edges;
    }

    public String toString(){
        return usuario.toString();
    }
}
