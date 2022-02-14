const http = require('http'); 
const server = http.createServer((req, res)=> {
console.log(req.url, req.method);
    res.write('<html><p>suman a</p></html>')
    res.setHeader('Content-Type','text/html');
    res.write('<p>hello there </p>');
});

server.listen(3000);