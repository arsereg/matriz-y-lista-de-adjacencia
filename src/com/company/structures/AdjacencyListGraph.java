package com.company.structures;

public class AdjacencyListGraph {
    private AdjacencyList[] adjacencyList;
    private int vertices;
    private int edges;

    public AdjacencyListGraph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new AdjacencyList[vertices];
        edges = 0;
    }

    public void addEdge(int source, int destination, int weight) {
        if(adjacencyList[source] == null) {
            adjacencyList[source] = new AdjacencyList(destination, weight);
        }else{
            adjacencyList[source].addEdge(source, destination);
        }
        edges++;
    }

    public int getVertices() {
        return vertices;
    }

    public int getEdges() {
        return edges;
    }

    public AdjacencyList[] getAdjacencyList() {
        return adjacencyList;
    }

    public void printAdjacencyList() {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_CYAN = "\u001B[36m";
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + ": ");

            if(adjacencyList[i] != null) {
                System.out.print("[" );
                System.out.print(ANSI_RED);
                System.out.print(adjacencyList[i].getVertex());
                System.out.print(ANSI_RESET);
                System.out.print(", ");
                System.out.print(ANSI_CYAN);
                System.out.print(adjacencyList[i].getWeight());
                System.out.print(ANSI_RESET);
                System.out.print("]");
            }
            System.out.println();
        }
    }
}
