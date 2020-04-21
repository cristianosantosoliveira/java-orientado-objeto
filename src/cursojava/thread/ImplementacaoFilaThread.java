package cursojava.thread;

import java.util.concurrent.ConcurrentLinkedQueue;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<FilaThread> pilha_filha = new ConcurrentLinkedQueue<FilaThread>();

	public static void add(FilaThread filaThread) {
		pilha_filha.add(filaThread);
	}

	@Override
	public void run() {
		java.util.Iterator iteracao = pilha_filha.iterator();

		synchronized (iteracao) { /* Bloquear o acesso a esta lista para oitros processos */

			while (iteracao.hasNext()) { /* Enquanto conter dados na lista ira processar */

				FilaThread processar = (FilaThread) iteracao.next(); /* Pega o objeto atual */

				System.out.println("-------------------------");
				
				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());
				
				iteracao.remove();

				try {
					Thread.sleep(1000); /* Porcessou toda a lista da um tempo pra limpeza de memoria */
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// Passou toda a lista e da um tempo para limpeza de memoria
			e.printStackTrace();
		}
	}

}
