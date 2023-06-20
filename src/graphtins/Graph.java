package graphtins;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Graph {

    Integer lastId = 0;

    ArrayList<Node> shortestPath = new ArrayList<Node>();
    ArrayList<Node> nodeList = new ArrayList<Node>();
    int currentPathCost = Integer.MAX_VALUE;


    // Projeto

    public Usuario getById(Integer id){
        for(Node nodeUsuario: nodeList){
            if(nodeUsuario.usuario.getId() == id){

                return nodeUsuario.usuario;
            }
        }
        return null;
    }

    public ArrayList<Usuario> getAllUsers(){
        ArrayList<Usuario> allUsers= new ArrayList<>();
        for (Node node: nodeList){
            allUsers.add(node.usuario);
        }
        return allUsers;
    }

    public Node getNodebyUser(Usuario user){
        Node nodeUser;

        for (Node node: nodeList){
            if(node.usuario.equals(user)){
                return node;
            }
        }
        return null;
    }


    public void adicionarAmigo(Integer user, Integer amigo){
        for(Node nodeUsuario: nodeList){
            if(nodeUsuario.usuario.getId() == user){

                for(Node nodeAmigo: nodeList){
                    if(nodeAmigo.usuario.getId() == amigo){
                        nodeUsuario.usuario.getAmigos().add(nodeAmigo.usuario);
                        nodeAmigo.usuario.getAmigos().add(nodeUsuario.usuario);
                        createVertex(nodeUsuario.usuario, nodeAmigo.usuario);
                    }

                }
            }
        }
    }

    public void removerAmigo(Integer user, Integer amigo){
        for(Node nodeUsuario: nodeList){
            if(nodeUsuario.usuario.getId() == user){

                for(Node nodeAmigo: nodeList){
                    if(nodeAmigo.usuario.getId() == amigo){
                        nodeUsuario.usuario.getAmigos().remove(nodeAmigo.usuario);
                        nodeAmigo.usuario.getAmigos().remove(nodeUsuario.usuario);
                        createVertex(nodeUsuario.usuario, nodeAmigo.usuario);
                    }

                }
            }
        }
    }

    
    Node addNode(Usuario usuario) {
        Node newNode = new Node(usuario);
        lastId++;

        newNode.usuario.setId(lastId);
        nodeList.add(newNode);
        return newNode;
    }


    Node getNode(Usuario usuario) {
        for (Node node: nodeList) {
            if (node.usuario.equals(usuario)) {
                return node;
            }
        }
        return addNode(usuario);
    }


    Node getNode(String username){
        for (Node node: nodeList){
            if(node.usuario.getUsername() == username){
                return node;
            }
        }
        return null;
    }


    void createVertex(Usuario usuarioA, Usuario usuarioB) {
        createVertex(getNode(usuarioA), getNode(usuarioB));
        createVertex(getNode(usuarioB), getNode(usuarioA));
    }

    void createVertex(Node nodeA, Node nodeB) {
        Vertex newVertex = new Vertex(nodeA, nodeB);
        nodeA.edges.add(newVertex);
    }

    public ArrayList percorrerAteDuasArestas(Node node) {
        Set<Node> visited = new HashSet<>();
        return percorrerAteDuasArestasRecursivo(node, visited, 0);
    }
    public ArrayList<Usuario> percorrerAteDuasArestasRecursivo(Node node, Set<Node> visited, int numArestas) {

        ArrayList<Usuario> amigosRecomendados = new ArrayList<>();


        if (numArestas > 2) {
            return null;
        }
        visited.add(node);
        System.out.println(node);


        for (Vertex edge : node.edges) {
            Node neighborNode = edge.nodeB;
            if (!visited.contains(neighborNode)) {
                percorrerAteDuasArestasRecursivo(neighborNode, visited, numArestas + 1);
            }
        }
        visited.remove(node);

        return amigosRecomendados;
    }



    /*
    public ArrayList<Usuario> buscarPorAmigosEmComum(Usuario usuario){
        ArrayList<Usuario> recomendacaoAmigoComum = new ArrayList<>();

        //getNodebyUser(usuario).getEdges();
        //System.out.println(getNodebyUser(usuario).getEdges());
        //System.out.println("-------");
        //getNodebyUser(usuario).buscarPorConexao(usuario);
        //System.out.println(getNodebyUser(usuario).buscarPorConexao(usuario));
        //getNodebyUser(usuario).buscarPorConexao(usuario);
        //System.out.println("---------------------------");

        for (Usuario user: usuario.getAmigos()){
            getNodebyUser(usuario).buscarPorConexao(user);
        }
        return getNodebyUser(usuario).buscarPorConexao(usuario);


        //return recomendacaoAmigoComum;
    }
     */

    public ArrayList<Usuario> buscarPorInteresse(Usuario usuario, ArrayList<Usuario> listaRecomendacao){
        ArrayList<Usuario> recomendacaoInteresse = new ArrayList<>();

        for (Usuario possivelAmigo: listaRecomendacao){
            if(possivelAmigo.getInteresse() == usuario.getInteresse() && possivelAmigo.getId() != usuario.getId()){
                recomendacaoInteresse.add(possivelAmigo);
            }
        }
        return recomendacaoInteresse;
    }
}
