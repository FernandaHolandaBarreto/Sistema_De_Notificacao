void main() {

    Email email = new Email();
    email.getNome();

    email.setNome("Fernanda");
    IO.println(email);




    email.Enviar("Oie professora segue a atividade");






    SMS sms = new SMS();
    sms.getNome();
    sms.setNome("Fernanda");
    IO.println(sms);


    sms.getNumero();
    sms.setNumero(1134567809);
    IO.println(sms);
    sms.Enviar("Estou mandando um SMS");




}