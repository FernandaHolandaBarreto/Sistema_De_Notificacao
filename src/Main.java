void main() {

    Email email = new Email();
    email.setNome(IO.readln("Digite seu nome: "));
    email.setPara(IO.readln("Para: "));
    IO.println(email);



    email.Enviar("Oie professora segue a atividade");



    SMS sms = new SMS();


    sms.setNome(IO.readln("Digite seu nome: "));
    IO.println(sms);



    sms.setNumero(Double.parseDouble(IO.readln("Digite seu número: ")));
    IO.println(sms);
    sms.Enviar("Estou mandando um SMS");


}