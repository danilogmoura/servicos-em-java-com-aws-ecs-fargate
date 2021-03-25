### Criando serviços em Java com AWS ECS e Fargate

------

[Msc. Paulo Siecola](https://www.udemy.com/course/aws-ecs-fargate-java/)

#### Conteúdo programático

#### 1: Introdução

- [x] Conceitos iniciais de AWS

#### 2: Conceitos de Spring Boot

- [x] Criando o primeiro projeto
- [x] Abrindo o projeto no IntelliJ IDEA
- [x] Criando o primeiro endpoint REST

#### 3: Executando a aplicação em um container Docker

- [x] Visão geral do Docker
- [x] Criando o repositório no Docker Hub
- [x] Preparando o projeto para gerar a imagem do Docker
- [x] Executando a aplicação em um container Docker no IntelliJ IDEA

#### 4: Introdução ao AWS CloudFormation

- [x] Introdução ao AWS CloudFormation
- [x] Analisando stacks, eventos, recursos e parâmetros
- [x] Apagando uma stack

#### 5: Introdução ao AWS CDK

- [ ] Criação do usuário IAM para o AWS CDK
- [ ] Instalação do AWS CDK
- [ ] Criando o projeto com CDK
- [ ] Entendendo a estrutura do projeto com CDK

#### 6: Introdução ao AWS ECS com Fargate

- [ ] Arquitetura com AWS ECS e Fargate
- [ ] VPC - Virtual Private Cloud
- [ ] Cluster
- [ ] Task e Task definition
- [ ] Service
- [ ] Auto-scaling
- [ ] ALB - Application load balancer, target group e security group

#### 7: Deployment da aplicação no AWS ECS com Fargate

- [ ] Criação da stack da VPC
- [ ] Criação da stack do cluster com AWS CDK
- [ ] Criação do application load balancer e demais recursos
- [ ] Configuração do target group
- [ ] Criação das regras de auto-scaling
- [ ] Deployment dos recursos com o AWS CDK
- [ ] Analisando as stacks criadas no AWS CloudFormation

#### 8: Monitorando o serviço criado no ECS

- [ ] Gráficos de CPU e memória
- [ ] Definição da tarefa
- [ ] Service
- [ ] Logs da aplicação no CloudWatch Insights
- [ ] Criando e executando uma nova versão da aplicação
- [ ] Destruindo os recursos criados

#### 9: Monitorando o Application Load Balancer e seus componentes

- [ ] Console do Application Load Balancer e suas métricas
- [ ] Target Group e o health check
- [ ] Security group e as regras de segurança

#### 10: Como o funciona o processo de deployment de uma nova versão da aplicação

- [ ] Preparando uma nova versão da aplicação
- [ ] Nova revisão da definição da tarefa
- [ ] Atualização do service com a nova revisão da tarefa
- [ ] Monitoramento do target group das novas instâncias
- [ ] Destruição das instâncias antigas

#### 11: Criação do CRUD de produtos utilizando AWS RDS com MySQL

- [ ] Arquitetura da aplicação com o AWS RDS
- [ ] Criando a instância do RDS com AWS CDK
- [ ] Configurando a aplicação para a acessar o banco de dados
- [ ] Criando o modelo de produtos
- [ ] Criando o repositório de produtos
- [ ] Criando o controller de produtos
- [ ] Criando uma nova definição de tarefa do ECS para acessar o RDS
- [ ] Testando o CRUD de produtos

#### 12: Publicando eventos de produtos com o AWS SNS

- [ ] Arquitetura da aplicação com AWS SNS
- [ ] Criando o tópico do SNS com AWS CDK
- [ ] Configurando a aplicação para acessar o novo tópico
- [ ] Criando os modelos para representar os eventos
- [ ] Criando o serviço para publicar eventos no AWS SNS
- [ ] Atribuindo a permissão à tarefa do ECS para acessar o SNS
- [ ] Testando o envio de notificações pelo AWS SNS

#### 13: Criando a aplicação para consumir os eventos de produtos

- [ ] Arquitetura da nova aplicação
- [ ] Verificando a infraestrutura da aplicação

#### 14: Consumindo os eventos de produtos com AWS SQS

- [ ] Arquitetura da aplicação com AWS SQS
- [ ] Criando a nova fila e inscrevendo-a no tópico com o AWS CDK
- [ ] Configurando a aplicação para acessar a nova fila
- [ ] Criando os modelos que representam os eventos
- [ ] Consumindo os eventos de produtos do AWS SQS com o JMS
- [ ] Atribuindo a permissão à tarefa do ECS para acessar a fila através do AWS CDK
- [ ] Testando o consumidor de eventos de produtos
- [ ] Entendendo as métricas e gráficos do SQS

#### 15: Persistindo os eventos de produtos no DynamoDB

- [ ] Arquitetura da aplicação com AWS DynamoDB
- [ ] Criando a tabela no DynamoDB com AWS CDK
- [ ] Configurando a aplicação para acessar a tabela no DynamoDB
- [ ] Criando o modelo de evento de produto
- [ ] Criando o repositório de evento de produto
- [ ] Persistindo os eventos de produtos
- [ ] Atribuindo a permissão à tarefa do ECS para acessar a tabela do DynamoDB
- [ ] Visualizando os eventos de produtos no console do DynamoDB
- [ ] Entendendo as métricas e gráficos do DynamoDB

#### 16: Criando um controller para buscar os eventos de produtos

- [ ] Criando o novo controller
- [ ] Buscando eventos pelo código do produto e tipo do evento
- [ ] Testando o novo controller com o Postman

#### 17: Preparando para os testes de carga

- [ ] Criando a coleção no Postman
- [ ] Executando o teste de carga
- [ ] Verificando os gráficos de consumo de recursos
- [ ] Analisando os gráficos do DynamoDB

#### 18: Configurando o autoscaling da tabela do DynamoDB com AWS CDK

- [ ] Alterando as configurações da tabela do DDB para ligar o autoscaling
- [ ] Gerando tráfego para testar o autoscaling da tabela do DDB
- [ ] Analisando os gráficos e métricas da tabela do DDB

#### 19: Configurando a tabela do DynamoDB para on demand

- [ ] Alterando a tabela do DynamoDB para on demand
- [ ] Repetindo o teste de carga
- [ ] Analisando os gráficos de consumo de capacidades do DynamoDB

#### 20: Importando arquivos com o AWS S3

- [ ] O que é o AWS Simple Storage Service - S3?
- [ ] Arquitetura da aplicação com AWS S3
- [ ] Criando o bucket no S3, SNS e SQS com o AWS CDK
- [ ] Configurando a aplicação para acessar o bucket
- [ ] Configurando a aplicação para acessar o SQS
- [ ] Criando o modelo para solicitar a URL pré-assinada
- [ ] Criando o controller para solicitar a URL pré-assinada
- [ ] Criando os modelos para importar os arquivos
- [ ] Criando o consumidor de eventos do S3
- [ ] Criando as operações de pesquisa de notas fiscais
- [ ] Atribuindo a permissão à tarefa do ECS para acessar o SQS e o S3
- [ ] Testando a importação de arquivos no S3