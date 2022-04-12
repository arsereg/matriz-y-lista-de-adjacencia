package com.company.structures;

public class AdjacencyMatrix {
    private int[][][] matrix;
    private int size;

    public AdjacencyMatrix(int size) {
        this.size = size;
        matrix = new int[size][size][2];
    }

    public void addEdge(int from, int to, int weight) {
        matrix[from][to][0] = 1;
        matrix[from][to][1] = weight;
    }

    public void removeEdge(int from, int to) {
        matrix[from][to][0] = 0;
        matrix[from][to][1] = Integer.MAX_VALUE;
    }

    public int[] getEdge(int from, int to) {
        return matrix[from][to];
    }

    public boolean isEdge(int from, int to) {
        return matrix[from][to][0] == 1;
    }

    public int getWeight(int from, int to) {
        return matrix[from][to][1];
    }

}
