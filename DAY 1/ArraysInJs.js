
let arr = ['Superman', 'Black Adam', 'shazam', 'Batman', 876];
console.log(arr);

// Because JavaScript Arrays are just special kinds of objects, we can have elements of different types stored together in the same array. The example above is an array with a string, a number, and an empty object.

// we can use push and pop methods to manipulate arrays

arr.push("Wonder Woman");
console.log(arr);
arr.push("joker");
console.log(arr);
arr.pop();
console.log(arr);

// shift() also work similar to push
arr.shift();
console.log(arr);


// unshift() method
arr.unshift(0, "Watchmen");
console.log(arr);

// Splicing arrays in JavaScript removes a certain part from an array to create a new array, made up from the part we took out

let splice = arr.splice(0, 3);
console.log(splice);