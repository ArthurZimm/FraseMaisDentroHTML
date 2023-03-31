
## Projeto de Análise de HTML

Este projeto consiste em um programa em Java que realiza a análise de um documento HTML, coletando-o de uma URL e validando a sintaxe do seu código.
  
## 


## Funcionamento

O programa é dividido em diversas classes, cada uma responsável por uma etapa da análise.


A classe **ColectHtml** é responsável por coletar o código HTML a partir de uma URL fornecida como parâmetro e transformá-lo em um arquivo de texto para facilitar a análise posterior.

A classe **HTMLValidator** é responsável por validar a sintaxe do código HTML coletado.

A classe **ListHtml** é responsável por transformar o arquivo de texto em uma lista para facilitar a análise.

O programa também conta com a classe **HtmlAnalyzer** que, ao receber uma URL como parâmetro, chama as classes acima para realizar a análise completa do documento HTML.
 

## Como usar

O programa pode ser utilizado através do terminal com os seguintes passos:
  

Compile os arquivos .java através do comando **javac HtmlAnalyzer.java.**

Execute o programa com o comando **java HtmlAnalyzer URL**, onde "**URL**" é a URL do documento HTML a ser analisado.

Caso ocorra algum problema, uma mensagem de erro será exibida na tela informando o ocorrido.


## Considerações finais

Este projeto é uma boa opção para quem busca compreender melhor o funcionamento do código HTML e a sua sintaxe. Além disso, ele pode ser utilizado como base para a criação de outras ferramentas de análise e validação de documentos HTML.
