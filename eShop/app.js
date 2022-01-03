const http  = require('http'); 
const server = http.createServer((req, res)=> {
    const url = req.url 
    
    console.log(url)
    const method = req.method;
    if(url === '/'){
    res.setHeader('Content-type', 'text/html'); 
    res.write('<html>'); 
    res.write('<head><title>"My first Page"</title></head>');
    res.write('<body><h1>"this is my first page made in the node.js"</h1> <form action="/message"  method="POST" type="text"><input type="text"></input> <button type="submit"> send</button></form> </body>' ); 
    res.end();
    } 
    if(url ==='/message' && method=="POST"){
        const body = []; 
        
    }
});
server.listen(3000);
