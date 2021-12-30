const http  = require('http'); 
const server = http.createServer((req, res)=> {
    const url = req.url 
    const method = req.method;
    if(url === '/'){
    res.setHeader('Content-type', 'text/html'); 
    res.write('<html>'); 
    res.write('<head><title>"My first Page"</title></head>');
    res.write('<body><h1>"this is my first page made in the node.js"</h1> <form action="/message" type="text"><input type="text"></input> <button type="submit"></button></form> </body>' ); 
    return res.end();
    } 
    if(url ==='/')
});
server.listen(3000);