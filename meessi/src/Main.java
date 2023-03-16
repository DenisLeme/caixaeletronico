import javax.swing.*;

public class Main {
    public static void main(String[] args) {




        final int saldoInicial = 150;

        int opcao;

        float depositar, saldoDisponivel , saque;

        opcao = Integer.parseInt(JOptionPane.showInputDialog("Caixa Eletronico: \n" +
                "1 - Depositar \n" +
                "2 - Sacar \n" +
                "Sair/n"));

        switch(opcao){

            case 1: depositar = Float.parseFloat(JOptionPane.showInputDialog(null, "Deseja depositar quanto?"));

            saldoDisponivel = saldoInicial + depositar;
            JOptionPane.showMessageDialog(null, "Seu saldo é:" + saldoDisponivel);

                break;

            case 2: saque = Float.parseFloat(JOptionPane.showInputDialog(null, "Deseja sacar quanto?"));

            if(saque > saldoInicial) {
                JOptionPane.showMessageDialog(null, "Valor Indisponível para saque:");


            }else {
                saldoDisponivel = saldoInicial - saque;
                JOptionPane.showMessageDialog(null, "Saque realizado com sucesso" + saldoDisponivel);

            }
                break;

            case 3:
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção informada não disponível no MENU");


        }}


    }
