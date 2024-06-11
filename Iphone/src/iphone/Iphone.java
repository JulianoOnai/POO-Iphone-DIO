package iphone;

import funcionalidadesiphone.sistema.SistemaIphone;

public class Iphone {
    public static void main(String[] args) {
        SistemaIphone iphoneteste = new SistemaIphone();

        System.out.println("Reprodutor Musical");
        iphoneteste.tocar();
        iphoneteste.pausar();
        iphoneteste.selecionarMusica("The Cypher Deffect - Costa Gold");

        System.out.println("Aparelho Telefônico");
        iphoneteste.ligar(123456789);
        iphoneteste.atender();
        iphoneteste.iniciarCorreioVoz();

        System.out.println("Navegador de Internet");
        iphoneteste.exibirPagina("www.google.com");
        iphoneteste.adicionarNovaAba();
        iphoneteste.atualizarPagina();
    }
}