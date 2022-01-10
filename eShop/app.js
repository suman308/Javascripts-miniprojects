const http = require('http'); 
const server = http.createServer((req, res)=> {
const url = req.url
console.log(req.url, req.method, req.headers);
}); 

server.listen(3000, ()=> {
    console.log( "server started at the port 4000")
})