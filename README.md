<a id="about"></a>

## Sobre


   2ª Avaliação referente a disciplina de Padrões de Projeto, ministrada pelo professor [Frederico Barboza](http://lattes.cnpq.br/2897532678011764), por meio do repositorio: [link do repositorio](https://github.com/pooinf008/INF011-2022.1).
   
## Alunos:    

[Lucas Fonsêca](https://github.com/infLucasinf/PadroesProjeto) 

[Matheus Bonfim](https://github.com/matheus1994/AvaliacaoII2022.2) 

<a id="features"></a>


## Problema:

1 - Deseja-se criar serviços que possa converter as obras em objetos XML, 
Json e (futuramente) outros formatos abertos para a exportação dos dados da base. Estes serviços serão usados, 
por exemplo, em REST-APIs de consulta do nosso sistema. A solução deve alterar o mínimo possível as classes do modelo e permitir, futuramente, a exportação para outros formatos abertos. Identifique o/os padrão/padrões, que lhe permita realizar a conversão das obras, respeitando o fato que os dados a serem exportados para cada tipo de obra são diferentes.


2 - Projete e implemente uma solução, que permita a geração de relatórios formatados para a base de dados. Para este momento foram solicitados quatro tipos de relatórios: relatório resumido HTML; relatório completo HTML; relatório resumido LaTeX; relatório completo LaTeX. Futuramente outros formatos e outros tipos de relatório podem ser solicitados. A solução deve evitar a explosão de classes, devido ao conjunto de combinações possíveis entre estrutura (completo, resumido, etc.) e formato (HTML, LaTeX, etc.). 

## Solução

Usamos o padrão Adapter em ambas as questões com a finalidade de criar novos formatos de arquivos e diferentes relatóros, com essa solução, foi possível aplicar a implementação sem a necessidade de mexer nas classe e conseguimos evitar também a explosão de classes.


## Tecnologias Utilizadas

Esse projeto foi desenvolvido utilizando a seguinte tecnologia:

- [Java](https://www.java.com/pt-BR/)

<a id="how-to-use"></a>


