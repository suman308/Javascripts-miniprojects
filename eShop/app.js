const http = require('http'); 
const server = http.createServer((req, res) => {
    console.log(req.url, req.method, req.header);
});
server.listen(3000,()=> console.log(req.url)) // this 