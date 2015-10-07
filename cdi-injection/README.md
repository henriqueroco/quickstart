cdi-injection: Example Using CDI (Contexts and Dependency Injection)
====================================================================
Author: Jason Porter  
Level: Beginner  
Technologies: CDI  
Summary: Demonstra o uso de CDI 1.1 inje��o e qualificadores com JSF como o cliente de front-end. 
Target Project: WildFly
Source: <https://github.com/wildfly/quickstart/>  

O que � isso?
-----------

Este exemplo demonstra o uso do CDI * 1.1 inje��o e qualificadores * em * JBoss JBoss Application Server * com JSF como o cliente de front-end.


Requerimentos do sistema
-------------------

Tudo que voc� precisa para construir este projeto � Java 7.0 (Java SDK 1.7) ou melhor, Maven 3.1 ou melhor.

A aplica��o deste projecto produz � projetado para ser executado em JBoss JBoss Application Server.

Configure Maven
---------------

Se voc� ainda n�o tiver feito isso, voc� deve [Configurar Maven] (../ README.md # mavenconfiguration) antes de testar os quickstarts.


Inicie o JBoss JBoss Application Server com o perfil Web
-------------------------

1. Abra uma linha de comando e navegue at� o diret�rio raiz do servidor JBoss.
2. O seguinte mostra a linha de comando para iniciar o servidor com o perfil web:

        For Linux:   JBOSS_HOME/bin/standalone.sh
        For Windows: JBOSS_HOME\bin\standalone.bat

 
Construir e implantar o Guia de in�cio r�pido
-------------------------

_Observa��o: A comando de compila��o seguinte assume que voc� tenha configurado suas configura��es de usu�rio Maven. Se voc� n�o tiver, voc� deve incluir Maven definir os argumentos na linha de comando. Veja [construir e implantar o Quickstarts] (../ README.md # buildanddeploy) para obter instru��es completas e options._ adicional

1. Certifique-se de ter iniciado o servidor JBoss como descrito acima.
2. Abra uma linha de comando e navegue at� o diret�rio raiz do quickstart.
3. Digite este comando para criar e implantar o arquivo:

        mvn clean package wildfly:deploy

4. Isso implantar�   `target/wildfly-cdi-injection.war` para a inst�ncia em execu��o do servidor.


Acesse o aplicativo
---------------------

A aplicativo ser� executado na seguinte URL<http://localhost:8080/wildfly-cdi-injection/>.


Undeploy o Arquivo
--------------------

1. Certifique-se de ter iniciado o servidor JBoss como descrito acima.
2. Abra uma linha de comando e navegue at� o diret�rio raiz do quickstart.
3. Quando terminar o teste, digite este comando para undeploy o arquivo

        mvn wildfly:undeploy


Run In�cio R�pido no JBoss Developer Studio ou Eclipse
-------------------------------------
Voc� pode tamb�m iniciar o servidor e implantar os quickstarts de Eclipse usando ferramentas JBoss. Para obter mais informa��es, consulte [Utilizar JBoss Developer Studio ou Eclipse para executar o Quickstarts] (../ README.md # useeclipse)

Depurar o aplicativo
------------------------------------

Se voc� quiser depurar o c�digo-fonte ou olhar para os Javadocs de qualquer biblioteca do projeto, execute um dos seguintes comandos para pux�-los em seu reposit�rio local. A IDE deve ent�o detect�-los.

        mvn dependency:sources
        mvn dependency:resolve -Dclassifier=javadoc
