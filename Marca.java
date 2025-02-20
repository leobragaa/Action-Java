
package atividadeSala;

public class Marca {
    
    private String nomeMarca;
    
    public Marca(){
    }
    
    public Marca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }
    
    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Marca marca = (Marca) obj;
        return nomeMarca != null ? nomeMarca.equals(marca.nomeMarca) : marca.nomeMarca == null;
    }

    @Override
    public int hashCode() {
        return nomeMarca != null ? nomeMarca.hashCode() : 0;
    }
 
    @Override
    public String toString() {
        
        return "\nNome da Marca: " + nomeMarca;
        
    }
}
