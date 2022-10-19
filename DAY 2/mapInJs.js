const numbers = [5, 62, 66, 22, 78, 44];
// const newNums = numbers.map();

// console.log(newNums);
numbers.map((value, index) => {
    console.log("Value at " + index + " is " + value);
})

const hero = ['superman', 'batman', 'wonder women', 'cyborg'];
hero.map(function (value, index, heros) {
    console.log("Hero at index " + index + " is " + value.toUpperCase())
    heros.push(value.toUpperCase());

})


// map function create another array and take a callback function to
// manipulate the indices 
