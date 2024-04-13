public class RewardValue {

    private double cashValue;
    private int milesValue;
    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035); // Convert cash value to miles
    }
    // Constructor that accepts miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035; // Convert miles value to cash
    }
    // Get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Get miles value
    public int getMilesValue() {
        return milesValue;
    }

}
