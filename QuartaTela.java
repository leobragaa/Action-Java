
package app;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class QuartaTela extends JFrame{
    
    private JTable tabela;
    private JScrollPane scroll;
    private JButton jbSair;
    private JButton jbCadastrar;
    private JPanel painel;
    
    public QuartaTela(){
        init();
        acoes();
    }
    public void init(){
        
        painel= new JPanel(new FlowLayout());
        
        jbSair = new JButton("SAIR");
        jbCadastrar = new JButton("CADASTRAR");
        
        setLayout(new BorderLayout());
        
        tabela = new JTable(10,4);
        scroll = new JScrollPane();
        scroll.setViewportView(tabela);
        
        
        add(scroll,BorderLayout.CENTER);
        add(painel,BorderLayout.PAGE_END);
        
        painel.add(jbSair);
        painel.add(jbCadastrar);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
    }
    
    public static void main(String[] args){
        new QuartaTela().setVisible(true);
    }

    private void acoes() {
        jbCadastrar.addActionListener((e)->{
            new TerceiraTela().setVisible(true);
        });
        jbSair.addActionListener((e)->{
            dispose();
        });
    }
}