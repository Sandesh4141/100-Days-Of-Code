const express = require("express");
const bodyParser = require('body-parser');


let app = express();
app.use(bodyParser.urlencoded({extended:true}));

app.get('/', function (req, res) {
    res.sendFile(__dirname + "/index.html");
    // res.send(__dirname);
});
app.post('/', function (req, res) {
    // res.send("Thanks for posting me..");
    console.log(req.body);
    console.log(req.body.num1);
    console.log(req.body.num2);

    var num1 = Number(req.body.num1);
    var num2 = Number(req.body.num2);
    var result = num1 + num2;
    res.send("Addition is "+result);

})
app.listen(3000, function () {
    console.log("Server Started at Port 3000");
})
