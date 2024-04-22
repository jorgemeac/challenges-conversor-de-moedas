
## 🚀 Sobre mim
Sou uma pessoa desenvolvedora Back-End em formação. Iniciei no Front-End com HTML, CSS e JavaScript como parte da selação do programa ONE da Oracle, Turma 6.

Sou professor de Física, Matemática e Robótica Educacional e atualmente estou em fase de transição de carreira. Muito prazer, me chamo

# Jorge Silva de Sousa

## Como me encontrar?
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/jorgemeac)

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/jorgemeac)
# Conversor de Moedas

Este é um projeto Java para um conversor de moedas simples que utiliza uma API externa para obter as taxas de câmbio atualizadas desenvolvido no Curso da Alura em parceria com a Oracle, turma 6 do programa ONE. Abaixo estão os principais componentes e funcionalidades do projeto:

## Componentes Principais

### Main

O arquivo `Main.java` é o ponto de entrada da aplicação. Ele instancia a classe `MenuPrincipal` para iniciar o programa.

### MenuPrincipal

O `MenuPrincipal.java` é responsável por exibir o menu inicial ao usuário, onde ele pode inserir seu nome e escolher as opções de conversão de moeda. Após a escolha, ele chama a classe `ExecutaMenuPrincipal`.

### ExecutaMenuPrincipal

A classe `ExecutaMenuPrincipal.java` processa as escolhas do usuário no menu principal. Ele permite que o usuário escolha a moeda de origem e de destino para a conversão, bem como o valor a ser convertido. Em seguida, chama a classe `ConectaApi` para obter as taxas de câmbio e realizar a conversão. Após a conversão, exibe o resultado e permite ao usuário retornar ao menu anterior ou sair do programa.

### ExecutaSubMenuPrincipal

O `ExecutaSubMenuPrincipal.java` é acionado quando o usuário deseja retornar ao menu principal para realizar mais conversões ou outras operações. Ele oferece opções adicionais, como visualizar mais opções de conversões, acessar o histórico de conversões ou de logs, além de permitir sair do programa.

### ConectaApi

A classe `ConectaApi.java` é responsável por se conectar à API externa para obter as taxas de câmbio atualizadas. Ela utiliza a biblioteca Gson para fazer parsing do JSON retornado pela API e realizar a conversão de moeda conforme a escolha do usuário.

### MoedaRecebida

O arquivo `MoedaRecebida.java` define uma classe de registro (record) para representar os dados recebidos da API de conversão de moedas. Ele possui campos para o resultado da conversão, o código da moeda base e as taxas de conversão para outras moedas.

## Funcionalidades

- **Conversão de Moedas:** O programa permite que o usuário escolha a moeda de origem e de destino, bem como o valor a ser convertido. Ele utiliza uma API externa para obter as taxas de câmbio atualizadas e realiza a conversão com base nessas taxas.

- **Menu Interativo:** O programa apresenta menus interativos que permitem ao usuário navegar pelas opções disponíveis e realizar suas escolhas de forma intuitiva.

- **Tratamento de Erros:** O código inclui tratamento de exceções para lidar com erros de conexão à API, erros de entrada do usuário e outras situações inesperadas.

- **Formatação de Saída:** Os valores de conversão são formatados para exibir duas casas decimais, proporcionando uma apresentação mais legível para o usuário.

Este projeto oferece uma maneira simples e eficaz de realizar conversões de moeda, fornecendo uma interface amigável e confiável.



## Licença

Este projeto está licenciado sob a Licença MIT - consulte o arquivo LICENSE para obter detalhes.

---

Feito com ❤️ por [jorgemeac]

## Status
![GitHub Stats](https://github-readme-stats.vercel.app/api?username=jorgemeac&theme=transparent&bg_color=0ff&border_color=00f&show_icons=true&icon_color=000&title_color=000&text_color=00f)

## Linguagens Mais Utilizadas

![Top Langs](https://github-readme-stats-git-masterrstaa-rickstaa.vercel.app/api/top-langs/?username=jorgemeac&theme=transparent&bg_color=0ff&border_color=00f&show_icons=true&icon_color=000&title_color=000&text_color=00f)

## Estatísticas de Sequência

[![GitHub Streak](https://streak-stats.demolab.com/?user=jorgemeac&theme=transparent&bg_color=0ff&border_color=00f&show_icons=true&icon_color=000&title_color=000&text_color=00f)](https://github.com/jorgemeac)

Estou iniciando nesta jornada, mas o futuro é promisssor... 🚀


## Documentação

[Documentação](https://docs.oracle.com/en/java/)

