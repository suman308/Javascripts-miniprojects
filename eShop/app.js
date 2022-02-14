const http = require('http'); 
const server = http.createServer((req, res)=> {
console.log(req.url, req.method);

 const url = req.url; 
 if (url == '/') {
     res.write('<html> <p1> This is the first page </p1>  </html> ')
 } else if( url =='/new'){
     res.write('<html> <p1> This is the second page page </p1>  </html> ')
 } else if( url =='/notnew'){
     res.write('<html> <p1> This is the third page </p1>  </html> ')
 }
   else {
     res.write('<html> <p1> 404 error </p1>  </html> ')
   }
});

server.listen(3000);