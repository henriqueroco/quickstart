cdi-alternativa: demostrates CDI Alternativas
================================================== ====
Autor: Nevin Zhu
N�vel: Intermedi�rio
Technologies: CDI, Servlet, JSP
Resumo: Demonstra o uso de CDI Alternativas onde o feij�o � selecionado durante a implanta��o
Projeto Alvo: JBoss Application Server
Fonte: <https://github.com/wildfly/quickstart/>

O que � isso?
-----------

Quando mais de uma vers�o de um bean � implementado para fins diferentes, a capacidade de alternar entre as vers�es durante a fase de desenvolvimento atrav�s da inje��o de um qualifier ou outro � mostrado nesta demonstra��o.

Em vez de ter de alterar o c�digo fonte da aplica��o, pode-se fazer a escolha no momento da implanta��o usando alternativas.

Alternativas s�o comumente utilizados para fins como o seguinte:

1. Para lidar com a l�gica de neg�cios espec�ficos do cliente que � determinado em tempo de execu��o.
2. Para especificar feij�o que s�o v�lidos para um cen�rio de implanta��o particular, por exemplo, quando as leis de impostos sobre vendas espec�ficas de cada pa�s exigem l�gica de neg�cios de imposto sobre vendas espec�ficas de cada pa�s.
3. Para criar vers�es fict�cias ou simuladas de feij�o para ser usado para o teste.

Qualquer classe java que tem um construtor sem argumentos e est� em um arquivo com uma beans.xml est� dispon�vel para consulta e inje��o.
Para a resolu��o EL, ele deve conterNamed


Requerimentos do sistema
-------------------

Tudo que voc� precisa para construir este projeto � Java 7.0 (Java SDK 1.7) ou melhor, Maven 3.1 ou melhor.

A aplica��o deste projecto produz � projetado para ser executado em JBoss JBoss Application Server.

�
Configure Maven
---------------

Se voc� ainda n�o tiver feito isso, voc� deve [Configurar Maven] (../ README.md # mavenconfiguration) antes de testar os quickstarts.


Inicie o JBoss JBoss Application Server
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
        
4.Isso implantar� `target/cdi-alternative.ear` para a inst�ncia em execu��o do servidor.


Acesse o aplicativo
---------------------

A aplicativo ser� executado na seguinte URL <http://localhost:8080/cdi-alternative>.

Voc� pode especificar as vers�es alternativas do feij�o no arquivo / beans.xml WEB-INF, efectuando um dos seguintes procedimentos:

1. voc� pode remover a tag '<alternativas>'
2. voc� pode alterar o nome da classe.

Neste in�cio r�pido, a fim de voltar para a implementa��o padr�o,
comentar o '<alternativas>' bloco no arquivo / beans.xml WEB-INF e reimplantar o in�cio r�pido.

Undeploy o Arquivo
--------------------

1. Certifique-se de ter iniciado o servidor JBoss como descrito acima.
2. Abra uma linha de comando e navegue at� o diret�rio raiz do quickstart.
3. Quando terminar o teste, digite este comando para undeploy o arquivo:

        mvn wildfly:undeploy


Execute o Guia de in�cio r�pido em JBoss Developer Studio ou Eclipse
-------------------------------------
Voc� pode tamb�m iniciar o servidor e implantar os quickstarts de Eclipse usando ferramentas JBoss. Para obter mais informa��es, consulte [Utilizar JBoss Developer Studio ou Eclipse para executar o Quickstarts] (../ README.md # useeclipse)

Depurar o aplicativo
------------------------------------

Se voc� quiser depurar o c�digo-fonte ou olhar para os Javadocs de qualquer biblioteca do projeto, execute um dos seguintes comandos para pux�-los em seu reposit�rio local. A IDE deve ent�o detect�-los.

    mvn dependency:sources
    mvn dependency:resolve -Dclassifier=javadoc

