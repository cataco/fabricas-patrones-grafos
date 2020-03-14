public class GraphFactory {

    public Graph createGraph(boolean isWeighted, Search search, String type){
        Graph graph = null;
        if(type.equals("Directed")){
            graph = new DirectedGraph(isWeighted, search);
        }else{
            graph = new UndirectedGraph(isWeighted, search);
        }
        return graph;
    }
}
