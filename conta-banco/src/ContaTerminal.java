import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        Conta conta1 = new Conta(1021, "067-8", "MARIO ANDRADE", 237.48);
        Conta conta2 = new Conta(1022, "067-8", "JOSE PAULO", 300.0);
        Conta conta3 = new Conta(1023, "067-8", "ADRIANA FERREIRA", 250.50);
        Conta conta4 = new Conta(1024, "067-8", "ANTONIO FRANCISCO", 800.00);
        Conta conta5 = new Conta(1025, "067-8", "ANDRE SOUZA", 450.00);

        Conta[] contas = {conta1, conta2, conta3, conta4, conta5};
        

        System.out.println("Por favor, digite o numero da agencia: ");
        int numeroAgencia = reader.nextInt();

        for(int i=0; i < contas.length;i++){
            if(numeroAgencia == contas[i].getNumero()){
                System.out.println("Olá " + contas[i].getNomeCliente() + ", " + 
                "obrigado por criar uma conta em nosso banco, " + 
                "sua agência é " + contas[i].getAgencia() + ", conta "+ contas[i].getNumero() + " " +
                "e seu saldo " + contas[i].getSaldo() + " já está disponível para saque!");
            }
            else{
                System.out.println("Esse numero nao esta cadastrado!");
            }
        }

        
        reader.close();
    }
}
