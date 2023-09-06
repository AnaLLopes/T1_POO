# T1_POO
Trabalho 1 da disciplina de Programação Orientada a Objetos
Especificação do Trabalho 1
Descrição:
O trabalho 1 da disciplina consiste no desenvolvimento das classes
para um programa Frente de Loja, conforme modelagem realizada em
aula (ver diagrama de classes no documento anexo). Para validar a
sua implementação, crie uma classe de teste contendo um método
main(). Essa classe deve testar/validar todos os métodos de todas as
classes implementadas. Importante: a interface pública das classes
deve respeitar o que foi modelado no diagrama de classes.
A loja vende diversos tipos de produtos. O catálogo de produtos
mantém a relação de produtos com os quais a loja trabalha ou já
trabalhou. Sobre cada produto, armazena-se o código (int), a
descrição (String) e o preço unitário (double). A empresa trabalha
com um estoque centralizado. O sistema de estoque armazena para
cada produto a quantidade disponível no estoque. Antes de qualquer
venda é necessário consultar o estoque para ver a disponibilidade do
produto. A loja não limita a quantidade de produtos por cliente (desde
que exista disponibilidade no estoque). Uma venda pode incluir vários
itens diferentes. Para cada item informa-se a quantidade desejada e
calcula-se o valor do item. O vendedor pode oferecer até 10% de
desconto sobre o valor total da venda para vendas acima de R$ 250.
Ao final da venda deve-se acrescentar 25% de imposto e calcular o
valor final da venda. A figura que segue é um exemplo de “venda”:
Recibo de venda número: 32
Número do item . Código .    Descrição    . Preço unitário cobrado . Quantidade . Valor do item
     01        .  1233  .    Geladeira    .        2500,00         .      1     .   2500,00
     02        .  4461  .    Ventilador   .        174,00          .      3     .   522,00
     03        .  6765  .       Fogão     .        879,00          .      1     .   879,00
     04        .  3943  . Ferro de passar .        225,00          .      2     .   450,00
Total 4351,00
Desconto 0,00
Imposto 1087,75
Valor da venda 5438,75
Uma vez a venda efetivada é necessário dar baixa no estoque. A loja
deve manter o registro de todas as vendas para eventual consulta
futura e geração de relatórios.
