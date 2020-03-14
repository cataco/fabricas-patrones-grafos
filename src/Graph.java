import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Graph {

    void addEdge(String nodeA, String nodeB);
    void addEdgeWithWeight(String nodeA, String nodeB, int weight);
    void addNode(String node);
    void search();

}
