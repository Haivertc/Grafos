import edu.uci.ics.jung.algorithms.shortestpath.DijkstraShortestPath;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.UndirectedSparseGraph;

public class Main {
    public static void main(String[] args) {

        Graph<String, String> grafo = new UndirectedSparseGraph<String, String>();

        grafo.addVertex("Casa");
        grafo.addVertex("Pradera");
        grafo.addVertex("6 de Septiembre");
        grafo.addVertex("Uptc");

        grafo.addEdge("8","Casa","Pradera");
        grafo.addEdge("6","Casa","6 de septiembre");
        grafo.addEdge("10","6 de septiembre","Uptc");
        grafo.addEdge("15","Uptc","Pradera");

        DijkstraShortestPath<String, String> dijskstra = new DijkstraShortestPath<String, String>(grafo);
        String seleccion = "Uptc";

        System.out.println(dijskstra.getPath("Casa", seleccion));
        double distanciaTotal =0.0;
        for (String resultado: dijskstra.getPath("Casa", seleccion)) {
            distanciaTotal+= Double.valueOf(resultado);
        }
        System.out.println("La distancia total que vas a gastar es de: "+distanciaTotal+"km");
    }
}