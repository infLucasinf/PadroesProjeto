/* O pacote teste é para testar o programa.
 * A classe teste é para testar todas as questões do trabalho.
 * Essa classe possui o main, que só é para testes.
 */

package main;

import model.Album;
import model.Obra;
import questao1.AdapteeFormato;
import questao1.AdapterFormato;
import questao1.TipoFormato;
import questao2.AdapteeRelatorio;
import questao2.AdapterRelatorio;
import questao2.FormatoRelatorio;
import questao2.TipoRelatorio;

public class Teste {

	public static void main(String args[]) {

		Obra obra = new Album("A", 2022, 5.0, "B", "C", "X", 100);
		AdapteeFormato a = new AdapteeFormato();
		AdapterFormato af = new AdapterFormato(a);

		System.out.println("PRIMEIRA QUESTÃO");
		System.out.println("Tipo de Formato - XML");
		System.out.println(af.geraConversao(obra, TipoFormato.XML));

		System.out.println();

		System.out.println("PRIMEIRA QUESTÃO");
		System.out.println("Tipo de Formato - JSON");
		System.out.println(af.geraConversao(obra, TipoFormato.JSON));

		System.out.println();
		
		System.out.println("PRIMEIRA QUESTÃO"); 
		System.out.println("Tipo de Formato - TXT");
		System.out.println(af.geraConversao(obra, TipoFormato.TXT));

		System.out.println();

		AdapteeRelatorio a1 = new AdapteeRelatorio();
		AdapterRelatorio ar = new AdapterRelatorio(a1);

		System.out.println();

		System.out.println("SEGUNDA QUESTÃO");
		System.out.println("Formato de Relatorio - HTML - COMPLETO");
		System.out.println(ar.geraRelatorio(obra, TipoRelatorio.COMPLETO, FormatoRelatorio.HTML));

		System.out.println();

		System.out.println("SEGUNDA QUESTÃO");
		System.out.println("Formato de Relatorio - LATEX - RESUMIDO");
		System.out.println(ar.geraRelatorio(obra, TipoRelatorio.RESUMIDO, FormatoRelatorio.LATEX));

	}

}

    
