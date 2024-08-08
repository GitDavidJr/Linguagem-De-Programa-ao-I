public class Agencia {
    
    private int idade_abertura;
    private String cnpj;
    public Agencia(int idade_abertura, String cnpj){
        this.idade_abertura = idade_abertura;
        this.cnpj = cnpj;
    }

    public int getIdadeAbertura() {
        return idade_abertura;
    }

    public String getCnpj() {
        return cnpj;
    }
}
