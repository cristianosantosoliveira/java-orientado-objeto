package cursojava.thread;

import java.util.concurrent.ConcurrentLinkedQueue;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_filha = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread filaThread) {
		pilha_filha.add(filaThread);
	}

	@Override
	public void run() {

		System.out.println("Fila rodando");

		while (true) {

			synchronized (pilha_filha) { /* Bloquear o acesso a esta lista para oitros processos */

				java.util.Iterator iteracao = pilha_filha.iterator();

				while (iteracao.hasNext()) { /* Enquanto conter dados na lista ira processar */

					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next(); /* Pega o objeto atual */

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
		}
	}

}
