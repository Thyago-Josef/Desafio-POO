package org.example;

public class Iphone implements RepordutorMusical, AparelhoTelefonico, Navegador {

    private int bateria;
    private boolean ligado;
    private boolean defeito;


    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }



    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isDefeito() {
        return defeito;
    }

    public void setDefeito(boolean defeito) {
        this.defeito = defeito;
    }

    public Iphone() {
        this.bateria = 100;
        this.ligado = true;
        this.defeito = false;
    }


    public void chamadas(int numero){

    }

    //Ligações
    @Override
    public void ligar() {
        System.out.println("ligando");


    }

    @Override
    public void atender() {
        System.out.println("atender");
    }

    @Override
    public void iniciarCorreioVoz() {

    }

    //Navegador
    @Override
    public void exibirPagina() {

    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void atualizarPagina() {

    }

    //Repordutor


    @Override
    public void tocar() {

    }

    @Override
    public void pausar() {

    }

    @Override
    public void selecionarMusica() {

    }


}

