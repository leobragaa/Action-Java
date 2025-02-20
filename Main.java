
package atividadeSala;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class Main {
    
    public static void main (String[] args){
        
        List <Usuario> usuarios = new LinkedList<>();
        List <Produto> produtos = new LinkedList<>();
        List <Marca> marcas = new LinkedList<>();
        
        String op;
        
        do{
            op = JOptionPane.showInputDialog(" 0 . Sair"
                    + "\n 1 . Cadastrar Produto "
                    + "\n 2 . Mostrar Produtos ");
                    
            switch(op){
                case "0":
                    
                    JOptionPane.showMessageDialog(null,  " Saindo ...... ");
                    break;
                    
                case "1":    
                    
                    Usuario user = new Usuario();
                    
                    user.setNomeUsuario(JOptionPane.showInputDialog(" Informe o seu Nome: "));
                    user.setCpf(JOptionPane.showInputDialog(" Informe o CPF: "));
                    user.setData(JOptionPane.showInputDialog(" Data de Nascimento (dd/mm/aaaa): "));
                    user.setIdade(JOptionPane.showInputDialog(" Informe a sua Idade: "));
                    usuarios.add(user);
                    
                    
                    String marca = JOptionPane.showInputDialog(" Informe o nome da Marca: ");
                    Marca m = new Marca(marca.toLowerCase());
                    
                    if (!marcas.contains(marca)) {
                        marcas.add(m);
                    }
                    
                    Produto p = new Produto();
                    
                    p.setProdutoNome(JOptionPane.showInputDialog(" Nome do Produto: "));
                    p.setValorProduto(Float.valueOf(JOptionPane.showInputDialog(" Valor do Produto: ")));
                    produtos.add(p);
                    
                    break;
                    
                case "2":

                    StringBuilder listaUsuarios = new StringBuilder("Usuários:\n");
                    
                    for (Usuario u : usuarios) {
                        listaUsuarios.append(u.toString()).append("\n");
                    }
                    
                    JOptionPane.showMessageDialog(null, listaUsuarios.toString());

                    StringBuilder listaProdutos = new StringBuilder("Produtos:\n");
                    
                    for (Produto produto : produtos) {
                        listaProdutos.append(produto.toString()).append("\n");
                    }
                    
                    JOptionPane.showMessageDialog(null, listaProdutos.toString());

                    StringBuilder listaMarcas = new StringBuilder("Marcas:\n");
                    
                    for (Marca mark : marcas) {
                        listaMarcas.append(mark.toString()).append("\n");
                    }
                    
                    JOptionPane.showMessageDialog(null, listaMarcas.toString());
                    
                    break;
                    
                default:
                    
                    JOptionPane.showMessageDialog(null,  "Este valor não existe, tente novamente!");
                    break;
            }        
            
        }while(!"0".equals(op));
        
        JOptionPane.showMessageDialog(null,  " ------- Programa Encerrado ------- ");
    }
}
