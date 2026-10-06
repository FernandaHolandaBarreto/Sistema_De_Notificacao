public class Email implements Notificador{

    private String nome;
    private String para;


    @Override
    public void Enviar(String mensagem) {

        IO.println("Enviando e-mail: " + mensagem);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    @Override
    public String toString() {
        return "Email{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
