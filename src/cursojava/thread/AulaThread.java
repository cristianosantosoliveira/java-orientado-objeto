package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		/* Thread processando em paralelo do envio do e-mail */
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();

		// *********************DIVISÃO DAS THREADS

		/* Thread processando em paralelo do envio de nota fiscal */
		Thread threadNota = new Thread(thread2);
		threadNota.start();/* Start liga a Thred que fica processando por trás */

		/* Código do sistema do usuário continua o fluxo de trabalho */
		System.out.println("Chegou ao fim do codigo de teste de thread");
		/* Fluxo do sistema, cadastro de venda, emissão de nota fiscal e etc.. */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");

	}

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {

			/* Codigo da rotina */

			/* Código da rotina que eu quero executar em processamento paralelo */
			for (int pos = 0; pos < 10; pos++) {

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // Da um tempo na execução do codigo
				/* Executar esse envio de email com tempo de parada ou com tempo determindado */
				System.out.println("Executando envio de e-mail");
			}
			/* Fim do codigo em paralelo */

		}
	};

	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {

			/* Codigo da rotina */

			/* Código da rotina que eu quero executar em processamento paralelo */
			for (int pos = 0; pos < 10; pos++) {

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // Da um tempo na execução do codigo
				/* Executar esse envio de email com tempo de parada ou com tempo determindado */
				System.out.println("Executando envio de nota fiscal");
			}
			/* Fim do codigo em paralelo */

		}
	};

}
