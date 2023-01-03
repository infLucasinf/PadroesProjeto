//O pacote aval20222.main é para testar o programa.
//Essa é a classe teste para todas as questões do trabalho.
//Essa classe possui o main, que só é para testes.

package main;
import questao1.Conversor;
import questao1.JSON;
import questao1.XML;
import questao2.Relatorio;
import questao2.HTML;
import questao2.LATEX;
import questao2.TipoRelatorio;
import model.Album;
import model.Obra;

public class Teste {

	public static void main(String args[]) {
	   
	   Obra obra = new Album("A", 2022, 5.0, "B", "C", "X", 100);
	 
	   Conversor conversor1 = new JSON();
	   System.out.println(conversor1.clone().converte(obra));
	   
	   Conversor conversor2 = new XML();
	   System.out.println(conversor2.clone());
	   
	   Relatorio relatorio1 = new HTML();
	   System.out.println(relatorio1.clone());
	   
	   Relatorio relatorio2 = new LATEX();
	   System.out.println(relatorio2.clone());
	   
	}
	
}
