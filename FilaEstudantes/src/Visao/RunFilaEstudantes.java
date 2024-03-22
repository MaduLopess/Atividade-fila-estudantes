package Visao;
/*Classe RunFilaEstudantes que tem o objetivo de interagir com o usuário 
 * por meio de telas vindas da classe JOptionPane.

 */

import javax.swing.JOptionPane;

import Modelagem.Estudantes;
import Negocio.Fila;

public class RunFilaEstudantes {

	public static void main(String[] args) {
		// criação de objetos
		Fila filaDeEstudantes = new Fila();

		Estudantes estudanteUm = new Estudantes();
		Estudantes estudanteDois = new Estudantes();
		// mensagem de boas vindas ao usuário
		JOptionPane.showMessageDialog(null, "BEM-VINDO À FILA DE ESTUDANTES!");
		JOptionPane.showMessageDialog(null, "Clique em OK para prosseguir!");
		// setando as informações dos objetos
		estudanteUm.setNome(JOptionPane.showInputDialog("Insira o seu nome: "));
		estudanteUm.setSenha(2510);

		estudanteDois.setNome(JOptionPane.showInputDialog("Insira o seu nome: "));
		estudanteDois.setSenha(2511);
		// chamando o método adicionarNaFila() passando os objetos no parâmetro
		filaDeEstudantes.adicionarNaFila(estudanteUm);
		filaDeEstudantes.adicionarNaFila(estudanteDois);

		JOptionPane.showMessageDialog(null, "Confira a fila no momento!!");
		// chamando o método mostrar() para informar ao usuário a fila de estudantes
		filaDeEstudantes.mostrar();

	}

}
