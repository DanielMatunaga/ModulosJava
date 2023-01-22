# ModulosJava
Testando funcionalidade de modulos em java

Foi criada uma estrutura básica mockada de uma camada de serviço, banco e aplicação. Foram criadas factories para esconder a implementação das interfaces e, através da funcionalidade de módulos, foram exportados e importados somente os pacotes que eram necessários. Isso esconde a implementação das interfaces e deixa o desenvolvimento mais controlado, além de que garante que a camada da aplicação não conversará com a camada de banco.
