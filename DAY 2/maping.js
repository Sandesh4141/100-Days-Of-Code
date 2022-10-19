
const friends = [
    { name: "sandesh", surname: "pawar" },
    { name: "ajay", surname: "tambade" },
    { name: "sudesh", surname: "vyas" },
    { name: "swapnil", surname: "wable" }
]

console.log(friends[0])
friends.map(function (value, index, array) {
    // console.log(index, value);
    // console.log(array[index]);
    console.log("Friend " + index + " is " + value.name.toUpperCase());
    // console.log(array);
    console.log("Name of friend is " + value.name.toUpperCase() + " and surname is " + value.surname.toUpperCase());

})

function getDetails(value){
    console.table(value);
}
// friends.map(getDetails());
// console.table(friends);


friends.map(e=>{
    
    console.log(e.name.toUpperCase());
    console.log(e.surname.toUpperCase());
})