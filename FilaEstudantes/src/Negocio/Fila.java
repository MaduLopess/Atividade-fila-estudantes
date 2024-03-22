package Negocio;
/** Classe de negócio Fila que tem estrutura para armazenar objetos (estudantes) e possui também métodos
 * para adicionar, mostrar e remover objetos do vetor.
 */
import javax.swing.JOptionPane;

import Modelagem.Estudantes;

public class Fila {

	private int inicio;
	private int fim;
	private int tamanho;
	private int qtdElementos;
	private Estudantes fila[];

	public Fila() {
		this.inicio = this.fim = -1;
		this.tamanho = 4;
		this.fila = new Estudantes[tamanho];
		this.qtdElementos = 0;

	}

	public boolean estaVazia() {
		if (qtdElementos == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean estaCheia() {
		if (qtdElementos == tamanho - 1) {
			return true;
		} else {
			return false;
		}
	}

	public void adicionarNaFila(Estudantes estudante) {
		if (!estaCheia()) {
			if (inicio == -1) {
				inicio = 0;
			}
			fim++;
			fila[fim] = estudante;
			qtdElementos++;
		}
	}

	public void remover() {
		if (!estaVazia()) {
			inicio++;
			qtdElementos--;
		}
	}

	public void mostrar() {
		String pessoas = "";
		for (int i = inicio; i <= fim; i++) {
			pessoas += fila[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, pessoas.toString(), "FILA ATUAL", JOptionPane.WARNING_MESSAGE);
	}

}
