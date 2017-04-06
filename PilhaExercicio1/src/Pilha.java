/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luiz Eduardo
 */
public class Pilha {
        
        private String[] arquivo;
        public int topopilha;
        
        public Pilha(int tamanhopilha){
        
            this.arquivo = new String[tamanhopilha];
            this.topopilha = -1;
        }
        
        public void Insercao(String nome)
        {
            String[] cheio;
                                   
            if (topopilha == arquivo.length - 1)
            {
                System.out.print("\n Pilha cheia");                               
                cheio = arquivo.clone();
                arquivo = (String[]) new String[(topopilha+1)*2];
                for(int x = 0; x < cheio.length ;x++)
                {
                    arquivo[x] = cheio[x];
                }  
            }     
            else
            {    
                 topopilha = topopilha + 1;
                 arquivo[topopilha] = nome;
                 System.out.print("\n"+arquivo[topopilha]);
                  
            }
        }
        
            public void Remove()
            {
                if (topopilha < 0)
                {
                    System.out.print("A pilha está vazia :(");
                }
                else
                {
                    arquivo[topopilha] = null;
                    --topopilha;
                }      
             }
            public void Contapilha()
            {
                for(int b = 0; b < arquivo.length; b++){
                    System.out.print("\n Item ["+ (b+1) +"] = "+arquivo[b]);
                }
                    System.out.println("\n Tamanho total da pilha: "+ arquivo.length+"\n Topo da pilha = "+(topopilha+1));
            }   
           
}
