package org.example;

import org.example.service.FindRouterDict;
//essa classe vai definir se o caminho existe ou não NADA MAIS QUE ISSO
public class Main {
    public static void main(String[] args) {
        FindRouterDict rout = new FindRouterDict("D:\\ArthurBuniss");

        if (rout.find()) {
            System.out.println("Encontrado!");
        } else {
            System.out.println("Não encontrado!");
        }
    }
}
