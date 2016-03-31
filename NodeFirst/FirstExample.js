var http = require('http');

try{
http.createServer(function (request, response) {
    response.writeHead(200, {'Content-Type': 'text/plain'});
    response.end('Hello World\n');
}).listen(2020);

console.log('Server started');
}
catch(err){
  console.log("Error");
}