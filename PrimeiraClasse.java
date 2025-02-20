
package controle;

import java.util.List;
import java.util.LinkedList;

class Pessoa{
    
    public String nome;
    public String idade;
    public String endereco;

    public Pessoa(String nome, String idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }
    
}

public class PrimeiraClasse{
    
    private static List lista = new LinkedList();
   
    public static void cadastro(String nome, String idade, String endereco){
        lista.add(new Pessoa(nome, idade, endereco));
    }  

    public static List listar(){
        return lista;
    }
}