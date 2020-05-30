package controller;

import java.util.LinkedList;

public class GrafoController {
	public int[][] gerarMatriz(int n) {
		int matriz[][] = new int[n][n];
		int linha;
		int coluna;
		for (linha = 0; linha < n; linha++) {
			for (coluna = 0; coluna < n; coluna++) {
				if (linha != coluna) {
					matriz[linha][coluna] = 1;
				}
			}
		}
		return matriz;
	}

	public void mostraMatriz(int matriz[][]) {
		for (int[] linha : matriz) {
			for (int coluna : linha) {
				System.out.print(coluna + " ");
			}
			System.out.println("");
		}
	}

	public LinkedList<LinkedList<Integer>> listaDeAdjacencias(int matriz[][], int n) {
		LinkedList<LinkedList<Integer>> listaDeAdjacencia = new LinkedList<>();
		int linha;
		int coluna;
		for (linha = 0; linha < n; linha++) {
			listaDeAdjacencia.add(new LinkedList<Integer>());
			for (coluna = 0; coluna < n; coluna++) {
				if (matriz[linha][coluna] == 1) {
					listaDeAdjacencia.get(linha).add(coluna);
				}
			}
		}
		return listaDeAdjacencia;
	}

	public void mostraListaAdjacencia(LinkedList<LinkedList<Integer>> lista) {
		int x = 0;
		String listaString = "";
		for (LinkedList<Integer> listaLigada : lista) {
			listaString = "ponto " + x + " adjacencias: ";
			for (int i = 0; i < listaLigada.size(); i++) {
				 listaString += listaLigada.get(i) + " ";
			}
			x++;
			System.out.println(listaString);

		}
		
	}
}
