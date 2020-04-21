package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class SplitArray {

	public static void main(String[] args) {

		String texto = "Cristiano, Inteligencia Artificial, 80, 90, 85, 65";

		String[] valoresArray = texto.split(",");

		System.out.println("Nome " + valoresArray[0]);
		System.out.println("Curso " + valoresArray[1]);
		System.out.println("Nota 1  " + valoresArray[2]);
		System.out.println("Nota 2  " + valoresArray[3]);
		System.out.println("Nota 3  " + valoresArray[4]);
		System.out.println("Nota 4  " + valoresArray[5]);

		/* Convertendo um Array em uma Lista */

		List<String> list = Arrays.asList(valoresArray);

		for (String valorstring : list) {
			System.out.println(valorstring);
		}

		/* Convertendo uma Lista para Array */

		String[] conversaoArray = list.toArray(new String[6]);
		for (int posicao = 0; posicao < conversaoArray.length; posicao++) {
		System.out.println(conversaoArray[posicao]);

		}
	}

}
