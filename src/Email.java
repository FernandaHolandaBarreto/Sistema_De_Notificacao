public class Email implements Notificador{

    private String nome;


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

    @Override
    public String toString() {
        return "Email{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
