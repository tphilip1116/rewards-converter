public class RewardValue {
    double cash;
    double miles;

    public RewardValue(double cashValue){
        cash = cashValue;
        miles = cashValue / 0.0035;
    }

    public RewardValue(int mileValue){
        cash = mileValue * 0.0035;
        miles = mileValue;
    }

    public double getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        return miles;
    }
}
