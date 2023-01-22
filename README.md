# ModulosJava
Testando funcionalidade de modulos em java

## branch main

Foi criada uma estrutura básica mockada de uma camada de serviço, banco e aplicação. Foram criadas factories para esconder a implementação das interfaces e, através da funcionalidade de módulos, foram exportados e importados somente os pacotes que eram necessários. Isso esconde a implementação das interfaces e deixa o desenvolvimento mais controlado, além de que garante que a camada da aplicação não conversará com a camada de banco.

Detalhes importantes:
- Até que o módulo tenha o arquivo module-info.java ele é considerado como um módulo sem nome. Um módulo sem nome é um recurso utilizado para não quebrar a compatibilidade com os códigos antigos, onde não era necessário criar módulos. Basicamente tudo que está em um módulo sem nome se torna público. A partir do momento que o arquivo module-info.java é criado, por padrão tudo dentro dele vira privado.
- Deve existir somente um arquivo module-info.java por módulo e ele deve ficar na raíz do projeto, ou seja, fora de qualquer pacote criado.
- Como não foi utilizado nenhum framework, as factories tiveram que ser criadas para esconder a implementação das interfaces. Caso contrário seria necessário importar os pacotes "core" dos módulos.

## branch providesAndUses

A estrutura básica criada na main foi alterada para usar os recursos nativos dos módulos para expor interfaces sem expor implementações. Para isso foi usado os comandos "provides" e "uses".
 - Provides: expõe qual interface será visível, através do comando "provides", e quem será a implementação, através do comando "with".
 - Uses: Diz qual será a interface usada.
Além disso foi utilizado o ServiceLoader para carregar as implementações das interfaces. Esse é um recurso do java que serve para descobrir as implementações das interfaces/APIs.

Detalhes importantes:
- Somente utilizar o "provides" não é o suficiente, é necessário utilizar o uses para quem for usar a interface, caso contrário um erro acontece.
- Mesmo com esse recurso, ainda teria o problema de precisar instanciar a implementação no app. Para contornar pode ser utilizado o recurso de inversão de dependência com a factory ou o ServiceLoader.
