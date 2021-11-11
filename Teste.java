public class Teste {
    public static void main(String[]args){

    ContaCorrente conta=new ContaCorrente();
    conta.setSaldo(100);
    conta.deposita(1100);
    conta.saca(2000);
    System.out.println("Saldo: "+conta.getSaldo());
    conta.limiteUtilizado();
    System.out.println("Limite disponível: "+conta.getLimite());
    if (conta.getLimite()>0){
        System.out.println("Cheque Especial");
    }
    else{
        System.out.println("No azul");
        }

    }
}
