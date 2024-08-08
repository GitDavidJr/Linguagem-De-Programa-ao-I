class Conta{

    protected int number;
    protected Double balance;
    protected Cliente holder;

    public Conta(int number, Double balance, Cliente holder){
        this.number = number;
        this.balance = balance;
        this.holder = holder;
    }

    public void credit(Double value){
        balance += value;
    }

    public void debit(Double value){
        if(balance >= value){
            balance -= value;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void viradaM(){
    }

    public void extract(){
        holder.printCliente();
        System.out.println("Numero da conta: " + number);
        System.out.println("Saldo: " + balance);
    }
   
}

