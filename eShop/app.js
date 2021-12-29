const http  = require('http'); 
const server = http.createServer((req, res)=> {
    
    res.setHeader('Content-type', 'text/html'); 
    res.write('<html>'); 
    res.write('<head><title>"My first Page"</title></head>');
    res.write('<body><h1>"this is my first page made in the node.js"</h1></body>' ); 
    res.end();
     
});
server.listen(3000);