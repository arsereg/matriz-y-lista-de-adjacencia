package com.company;

import com.company.structures.AdjacencyListGraph;
import com.company.structures.AdjacencyMatrixGraph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class Main {

    static BufferedReader in = new BufferedReader(new java.io.InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {
        boolean continuar = true;
        while(continuar){
            printMenu();
            int accion = Integer.parseInt(in.readLine());
            if(accion == 0){
                continuar = false;
                break;
            }
            switch(accion){
                case 1:
                    crearGrafoConMatrizDeAdyacencia();
                    break;
                case 2:
                    crearGrafoConListaDeAdyacencia();
                    break;
                default:
                    out.println("Opcion no valida");
            }
        }
        out.println("Fin del programa");
    }

    public static void printMenu(){
        String[] options = {
                "1- Crear Grafo con matriz de adyacencia",
                "2- Crear Grafo con lista de adyacencia",
                "0- Salir"};
        List.of(options).forEach(out::println);
    }

    public static void crearGrafoConMatrizDeAdyacencia() throws IOException {
        AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(8);
        boolean continuar = true;
        while(continuar){
            out.println("Ingrese el nodo origen");
            int origen = Integer.parseInt(in.readLine());
            out.println("Ingrese el nodo destino");
            int destino = Integer.parseInt(in.readLine());
            out.println("Ingrese el peso");
            int peso = Integer.parseInt(in.readLine());
            graph.addEdge(origen, destino, peso);
            out.println("Desea agregar otro arco? (1-Si, 0-No)");
            int respuesta = Integer.parseInt(in.readLine());
            if(respuesta == 0){
                continuar = false;
            }
        }
        graph.printGraph();
    }

    public static void crearGrafoConListaDeAdyacencia() throws IOException{
        out.println("Creando grafo con lista de adyacencia");
        AdjacencyListGraph graph = new AdjacencyListGraph(8);
        boolean continuar = true;
        while(continuar){
            out.println("Ingrese el nodo origen");
            int origen = Integer.parseInt(in.readLine());
            out.println("Ingrese el nodo destino");
            int destino = Integer.parseInt(in.readLine());
            out.println("Ingrese el peso");
            int peso = Integer.parseInt(in.readLine());
            graph.addEdge(origen, destino, peso);
            out.println("Desea agregar otro arco? (1-Si, 0-No)");
            int respuesta = Integer.parseInt(in.readLine());
            if(respuesta == 0){
                continuar = false;
            }
        }
        graph.printAdjacencyList();
    }


}
