// import express from "express";
const express = require("express");

var app = new express(); // created object of the express class

app.get("/", function (request, responce) {
    responce.send("<h1> hello </h1> ");

});
app.get("/contact", function (req, res) {
    res.send("<h1>This is contact page </h1>");
})
app.get("/about", function (req, res) {
    res.send("<h1>This is about page </h1>");
})
app.listen(3000, showMsg);

function showMsg() {
    console.log("Server Started...");
}
