public class Exercicio1 {
    public static void main(String[] args) {
        Cliente cliente1;
        cliente1 = new Cliente();
        cliente1.setNome("Gabriel");
        cliente1.setSobrenome("Silva");

        Conta conta1;
        conta1 = new Conta();
        conta1.setNumeroDaConta(15592);
        conta1.setSaldo(600);
        conta1.setTitular("Gabriel Silva");

        conta1.depositar(500);

        System.out.println("deposito efetuado" + conta1.getSaldo());

        System.out.println(conta1.getSaldo());

        conta1.sacar(1200);

        System.out.println("saldo insuficiente" + conta1.getSaldo());

        System.out.println(conta1.getSaldo());

        Cliente cliente2;
        cliente2 = new Cliente();
        cliente2.setNome("Mateus");
        cliente2.setSobrenome("Souza");

        Conta conta2;
        conta2 = new Conta();
        conta2.setNumeroDaConta(18892);
        conta2.setSaldo(200);
        conta2.setTitular("Mateus Souza");

        conta2.depositar(100);

        System.out.println("deposito efetuado" + conta2.getSaldo());

        System.out.println(conta2.getSaldo());

        conta2.sacar(40);

        System.out.println("saque efetuado" + conta2.getSaldo());

        System.out.println(conta2.getSaldo());
    }


}


