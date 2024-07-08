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
        console.log(numBottles%numExchange)
        numBottles = numBottles + (rem);
        console.log(numBottles, sum)
    }

    return sum;
};