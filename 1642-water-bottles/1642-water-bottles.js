/**
 * @param {number} numBottles
 * @param {number} numExchange
 * @return {number}
 */
var numWaterBottles = function(numBottles, numExchange) {

    let sum = numBottles;

    while(numBottles>=numExchange){
        let rem= numBottles%numExchange
        numBottles = Math.floor(numBottles/numExchange);
        sum += numBottles;
        numBottles = numBottles + (rem);
    }

    return sum;
};