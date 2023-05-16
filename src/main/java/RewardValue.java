public class RewardValue {
    double cash;
    int miles;

    RewardValue(double cashValue){
        cash = cashValue;
    }
    RewardValue(int milesValue){
        miles = milesValue;
    }

    double getCashValue(){
        return cash;
    }

    int getMilesValue(){
        miles = (int)(cash * (1.0 - .0035));
        return miles;
    }


}
