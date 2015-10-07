cdi-alternativa: demostrates CDI Alternativas
================================================== ====
Autor: Nevin Zhu
Nível: Intermediário
Technologies: CDI, Servlet, JSP
Resumo: Demonstra o uso de CDI Alternativas onde o feijão é selecionado durante a implantação
Projeto Alvo: JBoss Application Server
Fonte: <https://github.com/wildfly/quickstart/>

O que é isso?
-----------

Quando mais de uma versão de um bean é implementado para fins diferentes, a capacidade de alternar entre as versões durante a fase de desenvolvimento através da injeção de um qualifier ou outro é mostrado nesta demonstração.

Em vez de ter de alterar o código fonte da aplicação, pode-se fazer a escolha no momento da implantação usando alternativas.

Alternativas são comumente utilizados para fins como o seguinte:

1. Para lidar com a lógica de negócios específicos do cliente que é determinado em tempo de execução.
2. Para especificar feijão que são válidos para um cenário de implantação particular, por exemplo, quando as leis de impostos sobre vendas específicas de cada país exigem lógica de negócios de imposto sobre vendas específicas de cada país.
3. Para criar versões fictícias ou simuladas de feijão para ser usado para o teste.

Qualquer classe java que tem um construtor sem argumentos e está em um arquivo com uma beans.xml está disponível para consulta e injeção.
Para a resolução EL, ele deve conterNamed


Requerimentos do sistema
-------------------

Tudo que você precisa para construir este projeto é Java 7.0 (Java SDK 1.7) ou melhor, Maven 3.1 ou melhor.

A aplicação deste projecto produz é projetado para ser executado em JBoss JBoss Application Server.

 
Configure Maven
---------------

Se você ainda não tiver feito isso, você deve [Configurar Maven] (../ README.md # mavenconfiguration) antes de testar os quickstarts.


Inicie o JBoss JBoss Application Server
-------------------------

1. Abra uma linha de comando e navegue até o diretório raiz do servidor JBoss.
2. O seguinte mostra a linha de comando para iniciar o servidor com o perfil web:

        For Linux:   JBOSS_HOME/bin/standalone.sh
        For Windows: JBOSS_HOME\bin\standalone.bat


Construir e implantar o Guia de início rápido
-------------------------

_Observação: A comando de compilação seguinte assume que você tenha configurado suas configurações de usuário Maven. Se você não tiver, você deve incluir Maven definir os argumentos na linha de comando. Veja [construir e implantar o Quickstarts] (../ README.md # buildanddeploy) para obter instruções completas e options._ adicional

1. Certifique-se de ter iniciado o servidor JBoss como descrito acima.
2. Abra uma linha de comando e navegue até o diretório raiz do quickstart.
3. Digite este comando para criar e implantar o arquivo:

        mvn clean package wildfly:deploy
        
4.Isso implantará `target/cdi-alternative.ear` para a instância em execução do servidor.


Acesse o aplicativo
---------------------

A aplicativo será executado na seguinte URL <http://localhost:8080/cdi-alternative>.

Você pode especificar as versões alternativas do feijão no arquivo / beans.xml WEB-INF, efectuando um dos seguintes procedimentos:

1. você pode remover a tag '<alternativas>'
2. você pode alterar o nome da classe.

Neste início rápido, a fim de voltar para a implementação padrão,
comentar o '<alternativas>' bloco no arquivo / beans.xml WEB-INF e reimplantar o início rápido.

Undeploy o Arquivo
--------------------

1. Certifique-se de ter iniciado o servidor JBoss como descrito acima.
2. Abra uma linha de comando e navegue até o diretório raiz do quickstart.
3. Quando terminar o teste, digite este comando para undeploy o arquivo:

        mvn wildfly:undeploy


Execute o Guia de início rápido em JBoss Developer Studio ou Eclipse
-------------------------------------
Você pode também iniciar o servidor e implantar os quickstarts de Eclipse usando ferramentas JBoss. Para obter mais informações, consulte [Utilizar JBoss Developer Studio ou Eclipse para executar o Quickstarts] (../ README.md # useeclipse)

Depurar o aplicativo
------------------------------------

Se você quiser depurar o código-fonte ou olhar para os Javadocs de qualquer biblioteca do projeto, execute um dos seguintes comandos para puxá-los em seu repositório local. A IDE deve então detectá-los.

    mvn dependency:sources
    mvn dependency:resolve -Dclassifier=javadoc

