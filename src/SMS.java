public class SMS implements Notificador{

    private String nome;
    private double Numero;


    @Override
    public void Enviar(String mensagem) {
        IO.println("Enviando SMS: " + mensagem);

    }

    public String getNome() {
        return nome;
    }

    public double getNumero() {
        return Numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(double numero) {
        Numero = numero;
    }

    @Override
    public String toString() {
        return "SMS{" +
                "nome='" + nome + '\'' +
                ", Numero=" + Numero +
                '}';
    }
}
