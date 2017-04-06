/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luiz Eduardo
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Pilha p1 = new Pilha(5);
                         
          p1.Insercao("Teste1");
          p1.Insercao("Teste2");
          p1.Insercao("Teste3");
          p1.Insercao("Teste4");
          p1.Insercao("Teste5");
          p1.Insercao("Teste6");
         
          p1.Contapilha();
          
         
          p1.Remove();
        }
        
    }
    

