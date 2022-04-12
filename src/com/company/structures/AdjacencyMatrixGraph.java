package com.company.structures;

public class AdjacencyMatrixGraph {
    private AdjacencyMatrix matrix;
    private int size;

    public AdjacencyMatrixGraph(int size) {
        this.size = size;
        matrix = new AdjacencyMatrix(size);
    }

    public void addEdge(int from, int to, int weight) {
        this.matrix.addEdge(from, to, weight);
    }

    public void removeEdge(int from, int to) {
        this.matrix.removeEdge(from, to);
    }

    public boolean isEdge(int from, int to) {
        return matrix.isEdge(from, to);
    }

    public int getSize() {
        return size;
    }

    public int getWeight(int from, int to) {
        return matrix.getWeight(from, to);
    }

    public int[] getAdjacentVertices(int vertex) {
        int[] adjacentVertices = new int[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (matrix.getEdge(vertex, i)[0] == 1) {
                adjacentVertices[count] = i;
                count++;
            }
        }
        return adjacentVertices;
    }

    public void printGraph() {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_CYAN = "\u001B[36m";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(ANSI_RESET);
                System.out.print("[");
                System.out.print(ANSI_RED);
                System.out.print(matrix.getEdge(i, j)[0]);
                System.out.print(ANSI_RESET);
                System.out.print(", ");
                System.out.print(ANSI_CYAN);
                System.out.print(matrix.getEdge(i, j)[1]);
                System.out.print(ANSI_RESET);
                System.out.print("] ");
            }
            System.out.println();
        }
    }
}
