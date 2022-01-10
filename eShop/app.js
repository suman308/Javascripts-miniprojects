const http = require('http'); 
const express = require('express')
const app = express(); 

app.use( (req, res, next) => {
    req.send('<h> hello there </h>')
    console.log
})

const server = http.createServer(app)
server.listen(3000)