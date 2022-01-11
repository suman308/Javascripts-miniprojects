const http = require('http'); 
const express = require('express')
const app = express(); 

app.use( (req, res, next) => {
    res.send('<h>hello there</h>');
    console.log("the server is running")
    next();
})

const server = http.createServer(app)
server.listen(3000)