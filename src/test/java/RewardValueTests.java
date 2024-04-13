import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        RewardValue rewardValue = new RewardValue(100.0); // 100 dollars
        assertEquals(28571, rewardValue.getMilesValue(), "Incorrect miles conversion");
    }

    @Test
    void convert_from_miles_to_cash() {
        RewardValue rewardValue = new RewardValue(28571); // 28571 miles
        assertEquals(100.0, rewardValue.getCashValue(), 0.01, "Incorrect cash conversion");

    }
}
