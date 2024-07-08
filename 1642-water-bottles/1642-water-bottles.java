class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;

    while(numBottles>=numExchange){
        int rem= numBottles%numExchange;
        numBottles = numBottles/numExchange;
        sum += numBottles;
        numBottles = numBottles + (rem);
    }

    return sum;
    }
}