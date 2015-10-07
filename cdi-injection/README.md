cdi-injection: Example Using CDI (Contexts and Dependency Injection)
====================================================================
Author: Jason Porter  
Level: Beginner  
Technologies: CDI  
Summary: Demonstra o uso de CDI 1.1 injeção e qualificadores com JSF como o cliente de front-end. 
Target Project: WildFly
Source: <https://github.com/wildfly/quickstart/>  

O que é isso?
-----------

Este exemplo demonstra o uso do CDI * 1.1 injeção e qualificadores * em * JBoss JBoss Application Server * com JSF como o cliente de front-end.


Requerimentos do sistema
-------------------

Tudo que você precisa para construir este projeto é Java 7.0 (Java SDK 1.7) ou melhor, Maven 3.1 ou melhor.

A aplicação deste projecto produz é projetado para ser executado em JBoss JBoss Application Server.

Configure Maven
---------------

Se você ainda não tiver feito isso, você deve [Configurar Maven] (../ README.md # mavenconfiguration) antes de testar os quickstarts.


Inicie o JBoss JBoss Application Server com o perfil Web
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

4. Isso implantará   `target/wildfly-cdi-injection.war` para a instância em execução do servidor.


Acesse o aplicativo
---------------------

A aplicativo será executado na seguinte URL<http://localhost:8080/wildfly-cdi-injection/>.


Undeploy o Arquivo
--------------------

1. Certifique-se de ter iniciado o servidor JBoss como descrito acima.
2. Abra uma linha de comando e navegue até o diretório raiz do quickstart.
3. Quando terminar o teste, digite este comando para undeploy o arquivo

        mvn wildfly:undeploy


Run Início Rápido no JBoss Developer Studio ou Eclipse
-------------------------------------
Você pode também iniciar o servidor e implantar os quickstarts de Eclipse usando ferramentas JBoss. Para obter mais informações, consulte [Utilizar JBoss Developer Studio ou Eclipse para executar o Quickstarts] (../ README.md # useeclipse)

Depurar o aplicativo
------------------------------------

Se você quiser depurar o código-fonte ou olhar para os Javadocs de qualquer biblioteca do projeto, execute um dos seguintes comandos para puxá-los em seu repositório local. A IDE deve então detectá-los.

        mvn dependency:sources
        mvn dependency:resolve -Dclassifier=javadoc
