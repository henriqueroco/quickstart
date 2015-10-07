JBoss Application Server Quickstarts
====================
Resumo: Os quickstarts demonstrar Java EE 7 e algumas tecnologias adicionais da pilha JBoss. Eles fornecem exemplos pequenos, específico, trabalho que podem ser usados como referência para seu próprio projeto.

Introdução
---------------------


Estes quickstarts executado no JBoss JBoss Application Server. Esta versão utiliza as dependências corretas e garante que você testar e compilar contra seu ambiente de tempo de execução.

Certifique-se de ler este documento inteiro antes de tentar trabalhar com os tutoriais. Ele contém as seguintes informações:

* [Disponível Quickstarts] (# disponíveis-quickstarts): Lista dos quickstarts disponíveis e detalhes sobre cada um.

* [Sugerida Abordagem dos Quickstarts] (# sugeriu-abordagem-to-the-quickstarts): uma abordagem sugerida para a trabalhar com os tutoriais.

* [Requerimentos do Sistema] (# system-requisitos): Lista de software necessário para executar os quickstarts.

* [Configurar Maven] (# configure-maven): Como configurar o repositório Maven para uso pelos quickstarts.

* [Execute o Quickstarts] (# run-as-quickstarts): instruções gerais para criação, implantação e execução dos quickstarts.

* [Executar os testes Arquillian] (# os Arquillian-testes-run-): Como executar os testes Arquillian fornecidos por alguns dos quickstarts.

* [Componentes opcionais] (#-componentes opcionais): Como instalar e configurar componentes opcionais exigidas por alguns dos quickstarts.


Quickstarts Disponível 
---------------------

O que se segue é uma lista dos quickstarts atualmente disponíveis. A tabela lista cada nome de início rápido, as tecnologias que demonstra, dá uma breve descrição do quickstart, eo nível de experiência necessário para configurá-lo. Para informações mais detalhadas sobre um início rápido, clique sobre o nome de início rápido.

Alguns quickstarts são projetados para aumentar ou estender outros quickstarts. Estes são anotados nos Pré-requisitos ** ** coluna. Se um quickstart lista pré-requisitos, estes devem ser instalados ou implantados antes de trabalhar com o início rápido.

Quickstarts com tutoriais no [Comece a desenvolver Applications] (https://github.com/wildfly/quickstart/guide/Introduction/ "começar a desenvolver aplicativos") estão marcados com dois asteriscos (**) que seguem o nome de início rápido.

[TOC-quickstart]

Abordagem sugeriu aos Quickstarts
--------------------------------------

Sugerimos que você se aproximar dos quickstarts da seguinte forma:

* Independentemente do seu nível de especialização, sugerimos que você comece com o ** ** helloworld quickstart. É o exemplo mais simples e é uma maneira fácil de provar o seu servidor está configurado e iniciado corretamente.
* Se você é um novato ou novo para JBoss, comece com as quickstarts marcados ** ** novato, então tente aqueles marcados como ** ** Intermediário. Quando você está confortável com isso, passar para os ** ** quickstarts avançadas.
* Alguns quickstarts são baseadas em outros quickstarts mas têm expandido as capacidades e funcionalidades. Se um quickstart pré-requisito está listado, certifique-se de instalar e testá-lo antes de olhar para a versão expandida.


Requerimentos do Sistema
-------------

Para executar esses quickstarts com os scripts de construção fornecidos, é necessário o seguinte:

1. Java 1.7, para executar JBoss Application Server e Maven. Você pode escolher entre as seguintes opções:
    * OpenJDK
    * Oracle Java SE

2. Maven 3.1.0 ou mais recente, para construir e implantar os exemplos
     [Guia Maven Introdução] * Se você ainda não instalou o Maven, consulte o (http://maven.apache.org/guides/getting-started/index.html) para mais detalhes.
     * Se você tiver instalado o Maven, você pode verificar a versão ao escrever o seguinte em uma linha de comando:

            mvn --version 

3. A distribuição ZIP JBoss JBoss Application Server.
* Para informações sobre como instalar e executar o JBoss, consulte a documentação do produto.

4. Você também pode usar [JBoss Developer Studio ou Eclipse] (# use-jboss-desenvolvedor-studio-ou-eclipse-to-run-as-quickstarts) para executar os quickstarts.


Configuração do Maven
-------------

### Configurar Maven para JBoss JBoss Application Server

Se você estiver usando a distribuição JBoss JBoss Application Server de início rápido, os artefatos da comunidade estão disponíveis no repositório central Maven então nenhuma configuração adicional é necessária.

### Perfis Maven.

Os perfis são usados ​​pelo Maven para personalizar o ambiente de compilação. O `pom.xml` na raiz do diretório quickstart define os seguintes perfis:

* O `default` perfil define a lista de módulos ou quickstarts que exigem nada além de JBoss Enterprise Application Platform ou JBoss Application Server.
* O `exige-postgres` perfil lista os quickstarts que exigem PostgreSQL para ser executado quando o quickstart é implantado.
* Os `complexo dependency` listas de perfil quickstarts que requerem configuração manual que não pode ser automatizado.
* O `exige-full` listas de perfil Quickstarts a exigir que você iniciar o servidor usando o perfil completo.
* O `exige-xts` listas de perfil Quickstarts a exigir que você iniciar o servidor usando o perfil xts.
* Os `listas de perfil não-maven` Quickstarts que não exigem Maven, por exemplo, tutoriais que dependem de implantação de outros quickstarts ou aqueles que usam outras estruturas, como Forge.


Execute os Quickstarts
-------------------

A pasta raiz de cada indivíduo quickstart contém um arquivo README com detalhes específicos sobre como criar e executar o exemplo. Na maioria dos casos você faça o seguinte:

* [Comece o JBoss JBoss Application Server Servidor] (# inicia-the-jboss-JBoss Application Server-server)
* [Criar e implantar o quickstart] (# build-e-deploy-o quickstart)


### Iniciar o Servidor JBoss JBoss Application Server

Antes de implantar um início rápido, na maioria dos casos você precisa de um servidor em execução. Alguns dos testes Arquillian não necessitam de um servidor em execução. Isto será observado no README para que quickstart.

O servidor JBoss pode ser iniciado algumas maneiras diferentes.

* [Iniciar o Servidor JBoss Com o perfil _web_] (# start-jboss-JBoss Application Server-com-o-web-perfil): Esta é a configuração padrão. Ele define os subsistemas e os serviços mínimos.
* [Iniciar o Servidor JBoss com o perfil _full_] (# start-jboss-JBoss Application Server-com-o full-profile-): Este perfil configura muitos dos subsistemas e serviços mais usados.
* [Iniciar o Servidor JBoss com uma configuração personalizada] (# start-jboss-JBoss Application Server-com-custom-configuração de opções): parâmetros de configuração personalizadas podem ser especificada na linha de comando ao iniciar o servidor.

O README para cada quickstart irá especificar qual configuração é necessária para executar o exemplo.

#### Inicie o JBoss JBoss Application Server com o perfil Web

1. Abra uma linha de comando e navegue até o diretório raiz do servidor JBoss.
2. O seguinte mostra a linha de comando para iniciar o servidor com o perfil web:

        For Linux:   JBOSS_HOME/bin/standalone.sh
        For Windows: JBOSS_HOME\bin\standalone.bat

#### Inicie o JBoss JBoss Application Server com o perfil completo

1. Abra uma linha de comando e navegue até o diretório raiz do servidor JBoss.
2. O seguinte mostra a linha de comando para iniciar o servidor com o perfil completo:

        For Linux:   JBOSS_HOME/bin/standalone.sh -c standalone-full.xml
        For Windows: JBOSS_HOME\bin\standalone.bat -c standalone-full.xml

#### Inicie o JBoss JBoss Application Server com opções de configuração personalizadas

1. Abra uma linha de comando e navegue até o diretório raiz do servidor JBoss.
2. O seguinte mostra a linha de comando para iniciar o servidor. Substitua as opções personalizadas com os parâmetros costume opcionais especificadas no início rápido.

        For Linux:   JBOSS_HOME/bin/standalone.sh CUSTOM_OPTIONS
        For Windows: JBOSS_HOME\bin\standalone.bat CUSTOM_OPTIONS
           
### Construir e implantar o Quickstarts

Consulte o arquivo LEIA-ME em cada pasta quickstart individual para detalhes e informações específicas sobre como executar e acessar o exemplo.

#### Construir o Arquivo Início rápido

Em alguns casos, você pode querer criar o aplicativo para testar erros de compilação ou visualizar o conteúdo do arquivo.

1. Abra uma linha de comando e navegue até o diretório raiz do quickstart você quer construir.
2. Use este comando se você só quer construir o arquivo, mas não implantá-lo:

            mvn clean package

#### Construir e implantar o Arquivo Início rápido

1. Certifique-se que você [iniciar o JBoss servidor] (# start-the-jboss-JBoss Application Server em servidor), como descrito no README.
2. Abra uma linha de comando e navegue até o diretório raiz do quickstart você deseja executar.
3. Utilize este comando para criar e implantar o arquivo:

            mvn clean package wildfly:deploy

#### Undeploy um Arquivo

O comando para desimplantar o início rápido é simplesmente:

        mvn wildfly:undeploy
 
### Verifique as Quickstarts Construa com um comando
-------------------------

Você pode verificar as quickstarts construir usando um comando. No entanto, quickstarts que têm dependências complexas devem ser ignorados. Por exemplo, o início rápido _jax-rs-client_ é um cliente RESTEasy que depende da implantação do quickstart _helloworld-rs_. Como observado acima, o arquivo de raiz `define uma pom.xml` `complex-dependencies` perfil para excluir esses quickstarts do processo de construção de raiz.

Para construir os quickstarts:

1. Não iniciar o servidor.
2. Abra uma linha de comando e navegue até o diretório raiz dos quickstarts.
3. Utilize este comando para construir as quickstarts que não têm dependências complexas:

            mvn clean install '-Pdefault,!complex-dependencies'


### Undeploy os Quickstarts implantado com um comando
-------------------------

Para desimplantar o quickstarts a partir da raiz da pasta de início rápido, você deve passar o argumento `-fae` (falha no final) na linha de comando. Isso permite que o comando para continuar quickstarts últimos que falham devido a dependências complexas e quickstarts que só têm testes Arquillian e não implantar arquivos para o servidor.

Você pode undeploy quickstarts usando o seguinte procedimento:

1. Inicie o servidor.
2. Abra uma linha de comando e navegue até o diretório raiz dos quickstarts.
3. Utilize este comando para undeploy quaisquer quickstarts implantados:

            mvn wildfly:undeploy -fae

Para undeploy quaisquer quickstarts que falham devido a dependências complexas, siga o procedimento descrito no undeploy arquivo LEIA-ME do quickstart.


### Execute os testes Arquillian
-------------------------

Alguns dos quickstarts fornecer testes Arquillian. Por padrão, esses ensaios são configurados para ser omitido, como Arquillian testes requerem a utilização de um recipiente.

Você pode executar esses testes utilizando quer um controle remoto ou recipiente gerenciado. A README quickstart deve dizer-lhe o que você deve esperar para ver no registo de saída e servidor do console quando você executar o teste.

1. Teste o início rápido em um servidor remoto
     * Um recipiente remoto exige que você iniciar o servidor JBoss JBoss Application Server antes de executar o teste. [Comece o JBoss servidor] (# inicia-the-jboss-JBoss Application Server em servidor), como descrito no arquivo quickstart README.
     * Execute o objectivo de teste com o seguinte perfil activado:

            mvn clean test -Parq-wildfly-remote
2. Teste o QuickStart no Servidor Gerenciado

     _Observação: Este teste requer que o servidor não está em execução. Arquillian irá iniciar o recipiente para você, no entanto, você deve primeiro deixá-lo saber onde encontrar o container._ JBoss remoto
     * Abra o arquivo de recursos de teste / / arquillian.xml localizado no diretório quickstart.
     * Encontrar a configuração para o recipiente JBoss remoto. Deve olhar como este:

            <!-- Example configuration for a remote WildFly instance -->
            <container qualifier="jboss" default="true">
                <!-- By default, arquillian will use the JBOSS_HOME environment variable.  Alternatively, the configuration below can be uncommented. -->
                <!--<configuration> -->
                <!--<property name="jbossHome">/path/to/wildfly</property> -->
                <!--</configuration> -->
            </container>
    * Remove the comments from the `<configuration>` elements.

            <!-- Example configuration for a remote WildFly instance -->
            <container qualifier="jboss" default="true">
                <!-- By default, arquillian will use the JBOSS_HOME environment variable.  Alternatively, the configuration below can be uncommented. -->
                <configuration>
                    <property name="jbossHome">/path/to/wildfly</property>
                </configuration>
            </container>
    * Find the "jbossHome" property and replace the "/path/to/wildfly" value with the actual path to your JBoss WildFly server.
    * Run the test goal with the following profile activated:

            mvn clean test -Parq-wildfly-managed

Use JBoss Developer Studio ou Eclipse para executar o Quickstarts
-------------------------------------

Você também pode implantar as quickstarts de Eclipse usando ferramentas JBoss. Para mais informações sobre como configurar Maven e as ferramentas JBoss, consulte [JBoss Enterprise Application Platform 6 Guia do Desenvolvimento] a (https://access.redhat.com/knowledge/docs/JBoss_Enterprise_Application_Platform/) ou [Get Started Desenvolvendo Aplicações ] (https://github.com/wildfly/quickstart/guide/Introduction/ "Get Started Desenvolvendo Aplicativos").


Componentes opcionais
-------------------
Os seguintes componentes são necessários para apenas um pequeno subconjunto dos quickstarts. Não instale ou configurá-los a menos que o quickstart exige.

* [Crie usuários requeridos pela Quickstarts](https://github.com/jboss-developer/jboss-developer-shared-resources/blob/master/guides/CREATE_USERS.md#create-users-required-by-the-quickstarts): Adicionar um usuário ou Gerenciamento de Aplicativos para o tutoriais que são executados em um modo seguro.

* [Configure o banco de dados PostgreSQL para uso com o Quickstarts](https://github.com/jboss-developer/jboss-developer-shared-resources/blob/master/guides/CONFIGURE_POSTGRESQL.md#configure-the-postgresql-database-for-use-with-the-quickstarts): O banco de dados PostgreSQL é usado para os quickstarts transação distribuída.

* [Configurar Byteman para uso com o Quickstarts](https://github.com/jboss-developer/jboss-developer-shared-resources/blob/master/guides/CONFIGURE_BYTEMAN.md#configure-byteman-for-use-with-the-quickstarts): Esta ferramenta é usada para demonstrar a recuperação de falhas para quickstarts transação distribuída.

