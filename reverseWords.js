function reverseWords(sentence) {
    // Split the sentence into words
    const words = sentence.split(' ');

    // Reverse each word and store them in an array
    const reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });

    // Join the reversed words to form the new sentence
    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter a sentence: ', (sentence) => {
    const reversedSentence = reverseWords(sentence);
    console.log('Reversed sentence: ' + reversedSentence);
    rl.close();
});
