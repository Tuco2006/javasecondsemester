package br.com.fiap.main;

import br.com.fiap.entities.Produto;

import javax.swing.*;

public class TesteVetor {

    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j){
        return Integer.parseInt(j);
    }

    static double real(String j){
        return Double.parseDouble( JOptionPane.showInputDialog(j));
    }


    public static void main (String [] args){

        Produto[] vetorProduto = new Produto[3];

        int indice = 0;

        do{

            vetorProduto[indice] = new Produto();
            vetorProduto[indice].setCodigo(inteiro("código"));
            vetorProduto[indice].setTipo(texto("Tipo"));
            vetorProduto[indice].setMarca(texto("Marca"));
            vetorProduto[indice].setValor(real("Valor"));

            indice ++;
        }while( JOptionPane.showConfirmDialog(null,
                "Add more products?". "Storage",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0 );


        for(int buscar =0; buscar < indice; buscar ++){
            System.out.println(
                    "\n\nCodigo: " + vetorProduto[buscar].getCodigo() +
                            
            );
        }

    }
}