
package atividadeSala;

public class Usuario {
    
    private String usuario;
    private String cpf;
    private String data;
    private String idade;

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setNomeUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        return "\nNome: "+ usuario + 
                "\nCPF inserido: " + cpf +
                "\nData de nascimento: " + data +
                "\nIdade inserida: " + idade;
    }
}
