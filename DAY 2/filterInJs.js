
// filter in js
let demoArr = [5, 1, 4, 6, 7, 55, 56, 53, 63, 66];

let newArr = demoArr.filter(function (element) {
    if (element < 10) {
        console.log("element found less than 10 : " + element);
        return element;
    }
})
console.log(newArr); // all the array of elements less than 10

// filter()
// if one argument is passed -> it will return values of array
