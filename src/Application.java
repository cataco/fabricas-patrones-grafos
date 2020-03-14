public class Application {

    private static GraphFactory graphFactory = new GraphFactory();
    private static final String DIRECTED = "Directed";
    private static final String UNDIRECTED = "Undirected";
    private static final Search searchDFS = new DFSSearch();
    private static final Search searchBFS = new BFSSearch();



    public static void main(String ... args){
        Graph directedWeightedNoSearch = graphFactory.createGraph(true, null, DIRECTED);
        Graph directedNoWeightedSearchDFS = graphFactory.createGraph(false, searchDFS, DIRECTED);
        Graph undirectedNoWeightedNoSearch = graphFactory.createGraph(false, null, UNDIRECTED);
        Graph directedNoWeightedSearchBFS = graphFactory.createGraph(false, searchBFS, UNDIRECTED);

        directedWeightedNoSearch.addEdgeWithWeight("A", "B", 4);
        directedNoWeightedSearchDFS.addEdge("A", "B");
        undirectedNoWeightedNoSearch.addEdge("A", "B");
        directedNoWeightedSearchBFS.addEdge("A", "B");

        directedWeightedNoSearch.search();
        directedNoWeightedSearchDFS.search();
        undirectedNoWeightedNoSearch.search();
        directedNoWeightedSearchBFS.search();
    }
}
