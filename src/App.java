public class App {
    public static void main(String[] args) throws Exception {

        //Criando a primeira conta
        contaBancaria c1 = new contaBancaria(1001, "Gabriela", 500.0);

        System.out.printf("Saldo inicial (c1): R$%.2f\n", c1.getSaldo());
        c1.depositar(540.0);
        System.out.printf("Após depósito de R$150: R$%.2f\n", c1.getSaldo());
        boolean ok = c1.sacar(900.0);
        System.out.println("Tentativa de saque de R$700: " + (ok ? "sucesso" : "falha"));
        System.out.printf("Saldo final (c1): R$%.2f\n\n", c1.getSaldo());

        //Criando a segunda conta
        contaBancaria c2 = new contaBancaria(1002, "Carlos Souza", 800.0);

        System.out.printf("Saldo inicial (c2): R$%.2f\n", c2.getSaldo());
        c2.depositar(300.0);
        System.out.printf("Após depósito de R$200: R$%.2f\n", c2.getSaldo());
        boolean ok2 = c2.sacar(1500.0);
        System.out.println("Tentativa de saque de R$500: " + (ok2 ? "sucesso" : "falha"));
        System.out.printf("Saldo final (c2): R$%.2f\n", c2.getSaldo());
    }
}
