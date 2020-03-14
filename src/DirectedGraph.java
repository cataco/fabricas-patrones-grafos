import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectedGraph implements Graph {

    private boolean isWeighted = false;
    private List<String> nodes = new ArrayList<>();
    private Map<String, Integer> edges = new HashMap<>();
    private Search searchType;

    public DirectedGraph(boolean isWeighted, Search searchType){
        this.isWeighted = isWeighted;
        this.searchType = searchType;
    }

    @Override
    public void addEdge(String nodeA, String nodeB) {
        this.edges.put(nodeA+","+nodeB, 0);
    }

    @Override
    public void addEdgeWithWeight(String nodeA, String nodeB, int weight) {
        this.edges.put(nodeA+","+nodeB, weight);
    }

    @Override
    public void addNode(String node) {
        this.nodes.add(node);
    }

    @Override
    public void search() {
        if(searchType!=null) {
            searchType.search(this);
        }
    }
}
