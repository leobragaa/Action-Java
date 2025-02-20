
package atividadeSala;

public class Produto {
    
    private String produtoNome;
    private float valorProduto;
    private Marca marca;
    private Usuario usuario;
    
    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public Float getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Float valorProduto) {
        this.valorProduto = valorProduto;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    @Override
    public String toString() {
        return "\nProduto: "+ produtoNome+ 
                "\nValor: R$" + valorProduto +
                "\nMarca: " + (marca!=null?marca.getNomeMarca():"")+
                "\n Cadastrado por: " + usuario.getUsuario();
    }
}
