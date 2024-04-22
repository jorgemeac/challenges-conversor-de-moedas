package com.jorgemeac.conversordemoedas;

import java.util.Scanner;

public class ExecutaSubMenuPrincipal {
    public ExecutaSubMenuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int opcaoSubMenuPrincipal;

        try {

            String subMenuPrincipal = """
                *************************************************************
                Deseja retornar ao MENU anterior ou realizar novas operações?
                1\tRetornar ao MENU anterior
                2\tMais opções de conversões
                3\tHistórico de conversões
                4\tHistórico de LOGs
                5\tSAIR
                *************************************************************
                -------------------------------------------------------------
                *Por favor, escolha uma das opções acima.
                -------------------------------------------------------------
                """;
            System.out.println(subMenuPrincipal);


            do {
                opcaoSubMenuPrincipal = scanner.nextInt();

                switch (opcaoSubMenuPrincipal) {

                    case 1:
                        new ExecutaMenuPrincipal();
                        break;

                        case 2:
                            System.out.println("Em breve mais opções!");
                break;

                case 3:
                    System.out.println("Em breve o histórico estará disponível!");
                break;

                case 4:
                    System.out.println("Em breve o histórico de LOGS estará disponível!");
                    break;

                    case 5:
                        System.out.println("Fim do programa!");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;
                }

            } while (opcaoSubMenuPrincipal != 5);

        } catch (RuntimeException e) {
            System.err.println("Erro ao acessar a API:2 " + e.getMessage());
        }
        scanner.close();
    }
}
