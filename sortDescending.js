function sortDescending(arr) {
    return arr.sort((a, b) => b - a);
}

const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter an array of numbers separated by spaces: ', (input) => {
    const inputArray = input.split(' ').map(Number);
    const sortedArray = sortDescending(inputArray);
    console.log('Sorted array in descending order: ' + sortedArray.join(' '));
    rl.close();
});
