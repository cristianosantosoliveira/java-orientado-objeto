package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {
//Usado para executar o codigo
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array sempre deve ter a quantidade de posi��es definidas
		
		String posicoes = JOptionPane.showInputDialog("Quantas posi��es do Array deve ter? ");
		
		double[] notas = new double[Integer.parseInt(posicoes)];
		
		for (int pos = 0; pos<notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posi��o " + pos);
			notas[pos] = Double.valueOf(valor);
		}
		
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota na posi��o " + (i+1)  + " = " +notas[i]);
		}
		

	}

}
