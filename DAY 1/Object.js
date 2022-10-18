let emptyObj = {};

console.log(typeof (emptyObj))

let superHero = {
    name: "Superman",
    canFly: true,
    canShootLaser: true,
    canDie: false,

    fly: function () {
        console.log("Flying...")
    },
    shootLaser: function () {
        console.log("Shooting Laser")
    }
}
console.log(superHero.name);
console.log(superHero.canFly);
console.log(superHero.canShootLaser);
// another mehtod of accesssing values
console.log(superHero['name']);

console.log(superHero.fly());

console.log(superHero.shootLaser());
