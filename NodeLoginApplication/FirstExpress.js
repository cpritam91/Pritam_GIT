/**
 * http://usejsdoc.org/
 */
var express = require('express');
//var bodyParser = require('body-parser');
var app = express();

app.use(express.urlencoded());

app.get('/', function(req,res){
		console.log("Got a GET Request for the homepage");
		res.send("Hello GET");
	});

app.get('/about',function(req,res){
	res.sendfile('./views/Login.html');
});

app.post('/login',function(req,res){
	var username = req.body.uname;
	var password = req.body.pword;
	console.log("Username = "+username+" , Password = "+password);
	res.end("yes");
});

var server = app.listen(8081, function() {
	
	var host = server.address().address;
	var port = server.address().port;
	
	console.log("Example app listening at http://%s:%s",host,port);
	
});