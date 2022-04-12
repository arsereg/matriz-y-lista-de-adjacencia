package com.company.structures;

public class AdjacencyList {
    private int vertex;
    private int weight;
    private AdjacencyList next;

    public AdjacencyList(int vertex, int weight) {
        this.vertex = vertex;
        this.weight = weight;
        this.next = null;
    }

    public int getVertex() {
        return vertex;
    }

    public int getWeight() {
        return weight;
    }

    public AdjacencyList getNext() {
        return next;
    }

    public void setNext(AdjacencyList next) {
        this.next = next;
    }

    public void addEdge(int vertex, int weight) {
        AdjacencyList newNode = new AdjacencyList(vertex, weight);
        newNode.next = this.next;
        this.next = newNode;
    }

}
