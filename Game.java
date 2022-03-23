public class Game {
    private double piggyBank;

    public Game(){
        this.piggyBank = 0;
    }

    public void setPiggyBank(double newTotMoney){
        this.piggyBank = newTotMoney;
    }

    public double getPiggyBank(){
        return piggyBank;
    }

    public void addToPiggyBank(double money){
        this.piggyBank += money;
    }
}
