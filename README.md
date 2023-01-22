# ModulosJava
Testando funcionalidade de modulos em java

Foi criada uma estrutura básica mockada de uma camada de serviço, banco e aplicação. Foram criadas factories para esconder a implementação das interfaces e, através da funcionalidade de módulos, foram exportados e importados somente os pacotes que eram necessários. Isso esconde a implementação das interfaces e deixa o desenvolvimento mais controlado, além de que garante que a camada da aplicação não conversará com a camada de banco.

Detalhes importantes:
- Até que o módulo tenha o arquivo module-info.java o módulo deixa tudo público. A partir do momento que o arquivo é criado, por padrão tudo dentro dele vira privado.
- Deve existir somente um arquivo module-info.java por módulo e ele deve ficar na raíz do projeto, ou seja, fora de qualquer pacote criado.
- Como não foi utilizado nenhum framework, as factories tiveram que ser criadas para esconder a implementação das interfaces. Caso contrário seria necessário importar os pacotes "core" dos módulos.
