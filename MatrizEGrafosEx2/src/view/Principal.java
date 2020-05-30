package view;

import java.util.LinkedList;

import javax.swing.JOptionPane;

import controller.GrafoController;

public class Principal {

	public static void main(String[] args) {
		int matriz[][];
		LinkedList<LinkedList<Integer>> listaDeAdjacencia;
		GrafoController f = new GrafoController();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite K(n)."));
		matriz = f.gerarMatriz(n);
		f.mostraMatriz(matriz);
		listaDeAdjacencia = f.listaDeAdjacencias(matriz, n);
		f.mostraListaAdjacencia(listaDeAdjacencia);
		

	}

}
