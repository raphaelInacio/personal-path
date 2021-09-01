## Tecnicas para melhroar a perfomance de aplicações spring boot

Venho enfrentados desafios no meu dia a dia relacionados ao tempo de resposta e disponibilidade de microserviços

Durante esse processo, tanto eu como outros times onde trabalho passaram por problemas semelhantes e que aplicando essas
simples configurações poderiam ter pulado os problemas que eu passei

Antes de tudo vale lembrar que intuito aqui é compartilhar o conhecimento e não julgar o que é certo ou o que é errado,
cada empresa possui o ser cenário e os times possui o seu cenário.

Essas configurações podem salvar dias ou até semanas de analise em seu time.

Esse artigo vai ser divido em algumas séries para ficar mais didatico e para que voce possa aplicar esses conhecimentos
em seus projetos, acompanharem os resultados e tirarem suas proprias concluesões.

Vou tentar seguir da forma mais simples para resolver certos problemas de comunicação entre serviços até a forma que no
meu ver aparenta ser a melhor

## Stack

- Java
- Spring boot
- Rest
- K6 (Testes de performance)

## Indice

- ### Connection Poll Http - Aumentando o Troughput da sua aplicação REST
- ### Retry Parte 1 - Resolvendo problemas de intermitencia de rede ou serviços
- ### Retry Parte 2 - Tratando retrys de forma dimanica com exponencial backoof
- ### Retry Parte 3 - Fallback - Retornado resultados parciais
- ### Connection Poll - Aumentando o numero de conexões com o banco de dados
- ### Circiut Brake - As vezes é melhor dizer que estamos com problema

## Timeouts - Salvando sua aplicação de sistemas lentos

Cenário:

Precisamos construir uma API que retorna um cliente e suas empresas parceiras, o cliente vamos recuperar de uma base
interna e os parceiros desse cliente precisamos consumir uma API de parceiros.

A API de parceiros tem um tempo médio de 1000ms, nossa API precisa responder em até 1500ms na média e nossa
disponibilidade precisa de ser de 99,90%.

- Primeiro passo - identificando o Gargalo 
- Segundo passo - Aplicando as configurações de timeout

## Connection Poll Http - Aumentando o Troughput da sua aplicação REST

## Retry Parte 1 - Resolvendo problemas de intermitencia de rede ou serviços

## Retry Parte 2 - Tratando retrys de forma dimanica com exponencial backoof

## Retry Parte 3 - Fallback - Retornado resultados parciais

## Connection Poll - Aumentando o numero de conexões com o banco de dados

## Circiut Brake - As vezes é melhor dizer que estamos com problema


