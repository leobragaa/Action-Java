
package app;

import controle.PrimeiraClasse;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TerceiraTela extends JFrame{
    
    JLabel jlNome;
    JLabel jlIdade;
    JLabel jlEndereco;
    
    JTextField jtNome;
    JTextField jtIdade;
    
    JTextArea jtEndereco;
    
    JScrollPane jsScroll;
    
    JButton jbSalvar;
    JButton jbSair;
    
    public TerceiraTela(){
          
       iniciaComponentes();
        
    }
    private void iniciaComponentes() {
        
        //Alocação dos componentes   
        jbSair = new JButton("Sair");
        jbSalvar = new JButton ("Salvar");
        jlNome = new JLabel("Nome : ");
        jlIdade = new JLabel("Idade : ");
        jlEndereco = new JLabel("Endereco : ");
        jtNome = new JTextField();
        jtIdade = new JTextField();
        jtEndereco = new JTextArea();
        jsScroll= new JScrollPane(jtEndereco);
        
        posicionarComponentes();
        acoesComponentes();
        
        setSize(500,500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args){
        new TerceiraTela().setVisible(true);
    }
    private void posicionarComponentes() {
        setLayout(null);
        jlIdade.setBounds(10,10,60,30);
        jtIdade.setBounds(80,10,360,30);
        
        jlNome.setBounds(10,50,60,30);
        jtNome.setBounds(80,50,360,30);
        
        jlEndereco.setBounds(10,90,80,30);
        jsScroll.setBounds(80,90,360,160);
        
        jbSalvar.setBounds(150,250,100,40);
        jbSair.setBounds(250, 250, 100, 40);
        
        add(jlIdade);
        add(jtIdade);
        
        add(jlNome);
        add(jtNome);
        
        add(jlEndereco);
        add(jsScroll);
        
        add(jbSalvar);
        add(jbSair);
    }   

    private void acoesComponentes() {
        jbSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                PrimeiraClasse.cadastro(jtNome.getText(),jtIdade.getText(),jtEndereco.getText());
                
                JOptionPane.showMessageDialog(rootPane, "Salvo com Sucesso !");
            }
        });  
        
        jbSair.addActionListener((e->{
            dispose();
        }));
    }
    
}
