package com.jorgemeac.conversordemoedas;

import java.net.ConnectException;
import java.util.Scanner;

public class ExecutaMenuPrincipal {
    public ExecutaMenuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int opcaoMenuPrincipal;

        ConectaApi conectaApi = new ConectaApi();


        try {
            String menuPrincipal = """
                        --------------------MENU------------------------
                        1\t Dólar (USD)\t\t ====>\t Real Brasil (BRL)
                        2\t Euro (EUR)\t\t\t ====>\t Real Brasil (BRL)
                        3\t Yuan China (CNY)\t ====>\t Real Brasil (BRL)
                        4\t Real Brasil (BRA)\t ====>\t Yuan China (CNY)
                        5\t Real Brasil (BRA)\t ====>\t Euro (EUR)
                        6\t Real Brasil (BRA)\t ====>\t Dólar (USD)
                        7\t Mais opções de conversões
                        8\t Histórico de conversões
                        9\t SAIR
                        -------------------------------------------------
                        
                        *Por favor, escolha uma das opções acima.
                        """;

            System.out.println(menuPrincipal);

            do {
                opcaoMenuPrincipal = scanner.nextInt();

                switch (opcaoMenuPrincipal) {

                    case 1:
                        System.out.print("Quanto você deseja converter? ");
                        double valorConversao = scanner.nextInt();

                        System.out.println("A conversão foi realizada com sucesso!");

                        String resultado = conectaApi.paraConverter("USD", "BRL", valorConversao);
                        System.out.println(resultado);

                        new ExecutaSubMenuPrincipal();

                        break;

                    case 2:
                        System.out.print("Quanto você deseja converter? ");
                        valorConversao = scanner.nextInt();

                        System.out.println("A conversão foi realizada com sucesso!");

                        resultado = conectaApi.paraConverter("EUR", "BRL", valorConversao);
                        System.out.println(resultado);

                        new ExecutaSubMenuPrincipal();
                        break;

                    case 3:
                        System.out.print("Quanto você deseja converter? ");
                        valorConversao = scanner.nextInt();

                        System.out.println("A conversão foi realizada com sucesso!");

                        resultado = conectaApi.paraConverter("CNY", "BRL", valorConversao);
                        System.out.println(resultado);

                        new ExecutaSubMenuPrincipal();
                        break;

                    case 4:
                        System.out.print("Quanto você deseja converter? ");
                        valorConversao = scanner.nextInt();

                        System.out.println("A conversão foi realizada com sucesso!");

                        resultado = conectaApi.paraConverter("BRL", "CNY", valorConversao);
                        System.out.println(resultado);

                        new ExecutaSubMenuPrincipal();
                        break;

                    case 5:
                        System.out.print("Quanto você deseja converter? ");
                        valorConversao = scanner.nextInt();

                        System.out.println("A conversão foi realizada com sucesso!");

                        resultado = conectaApi.paraConverter("BRL", "EUR", valorConversao);
                        System.out.println(resultado);

                        new ExecutaSubMenuPrincipal();
                        break;

                    case 6:
                        System.out.print("Quanto você deseja converter? ");
                        valorConversao = scanner.nextInt();

                        System.out.println("A conversão foi realizada com sucesso!");

                        resultado = conectaApi.paraConverter("BRL", "USD", valorConversao);
                        System.out.println(resultado);

                        new ExecutaSubMenuPrincipal();
                        break;

                    case 7:
                        System.out.println("Em breve mais opções estarão disponíveis!");
                        break;

                    case 8:
                        System.out.println("Em breve o histórico estará disponível!");
                        break;

                    case 9:
                        System.out.println("Fim do programa!");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;
                }

            }  while (opcaoMenuPrincipal != 9) ;
            scanner.close();
        } catch (ConnectException e) {
            System.err.println("Erro de conexão ao acessar a API: " + e.getMessage());
        } catch (RuntimeException e) {
            System.err.println("Erro ao acessar a API: " + e.getMessage()); //Este erro está aparecendo ao final
            //quando tento encerrar apertando 5 no submenu.
        }
    }
}
