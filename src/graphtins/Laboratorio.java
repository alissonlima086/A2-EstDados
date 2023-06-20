package graphtins;

public class Laboratorio {

    public static void main(String args[]){
        Graph grafo = new Graph();

        /*
        grafo.addNode("Palmas");
        grafo.addNode("Porto");
        grafo.addNode("Paraiso");
        grafo.addNode("Brejinho");
        grafo.addNode("Gurupi");

        grafo.createVertex(grafo.getNode("Palmas"), grafo.getNode("Porto"), 2);
        grafo.createVertex(grafo.getNode("Palmas"), grafo.getNode("Paraiso"), 5);

        grafo.createVertex(grafo.getNode("Brejinho"), grafo.getNode("Gurupi"), 3);
        grafo.createVertex(grafo.getNode("Paraiso"), grafo.getNode("Gurupi"), 7);

        grafo.createVertex(grafo.getNode("Porto"), grafo.getNode("Brejinho"), 2);
        grafo.createVertex(grafo.getNode("Porto"), grafo.getNode("Gurupi"), 10);


        grafo.printAllPathsFromTo(grafo.getNode("Palmas"), grafo.getNode("Gurupi"));

         */

        grafo.addNode(new Usuario("Joao", 20, Interesses.TECNOLOGIA));
        grafo.addNode(new Usuario("Gabriela", 19, Interesses.FILMES));
        grafo.addNode(new Usuario("Maria", 22, Interesses.FUTEBOL));
        grafo.addNode(new Usuario("Marcos", 18, Interesses.FUTEBOL));

        grafo.adicionarAmigo(1, 4);
        grafo.adicionarAmigo(1, 2);
        grafo.adicionarAmigo(1, 3);
        grafo.adicionarAmigo(2, 3);

        //System.out.println(grafo.getById(1));
        //System.out.println("----------");
        //System.out.println(grafo.getById(3));

        //System.out.println("----------------------");
        //System.out.println(grafo.buscarPorInteresse(grafo.getById(3), grafo.getAllUsers()));

        //System.out.println("----------------------");

        //System.out.println(grafo.buscarPorAmigosEmComum(grafo.getById(3)));
        //grafo.buscarPorAmigosEmComum(grafo.getById(3));
        //grafo.percorrerAteDuasArestas(grafo.getNodebyUser(grafo.getById(3)));
        System.out.println(grafo.percorrerAteDuasArestas(grafo.getNodebyUser(grafo.getById(3))));
    }
}
