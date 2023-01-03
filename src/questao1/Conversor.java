package questao1;

//O pacote aval20222.q1 significa que é a resposta da primeira questão.
//Essa é a interface Conversor.
//Na primeira questão nós utilizamos o padrão prototype.

import model.Obra;

public interface Conversor {
 public String converte(Obra obra);
 public Conversor clone();
}

