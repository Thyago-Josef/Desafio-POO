package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int usar = 1;
        Scanner esc = new Scanner(System.in);
        //System.out.println("oque deseja fazer?");

        Iphone iphone = new Iphone();
        if(iphone.getBateria() > 0 && iphone.isLigado() == true && iphone.isDefeito() == false){
            System.out.println("Digite 1 para usar o aparelho e 0 para sair");
            while (esc.nextInt() == 1) {
                System.out.println("Digite 1 para fazer chamadas / 2 para acessar a internet / 3 para ouvir musicas");

                switch (esc.nextInt()) {
                    case 1: //"chamadas":
                        System.out.println("Oque voce quer fazer? 1 ligar para alguem, 2 atender, 3correio de voz");
                        usar = esc.nextInt();
                        if(usar ==1){
                        iphone.ligar();
                        }
                        if(usar ==2){
                        iphone.atender();
                        }
                        if(usar ==3){
                        iphone.iniciarCorreioVoz();
                        }
                        break;
                    case 2: //"internet":
                        System.out.println("Oque voce quer fazer? 1 exibir pagina, 2 Adcionar nova aba, 3 Atualizar pagina");
                        if(esc.nextInt() == 1){
                        iphone.exibirPagina();
                        }
                        if(esc.nextInt() == 2){
                        iphone.adicionarNovaAba();
                        }
                        if(esc.nextInt() == 3){
                        iphone.atualizarPagina();
                        }
                        break;
                    case 3: //"ouvir musicas":
                        System.out.println("Oque voce quer fazer? 1 tocar, 2 pausar, 3 selecionar musica");
                        if(esc.nextInt() == 1){
                        iphone.tocar();
                        }
                        if(esc.nextInt() == 2){
                        iphone.pausar();
                        }
                        if(esc.nextInt() == 3){
                        iphone.selecionarMusica();
                        }

                        break;
                }
            }

        }else{
            System.out.println("Não foi possivel usar o aparelho");
        }





    }
}