const http = require('http'); 
const express = require('express')
const app = express(); 

app.use( (req, res, next) => {
    req.send('<h> hello there </h>')
    console.log
})


servr.listen(3000)