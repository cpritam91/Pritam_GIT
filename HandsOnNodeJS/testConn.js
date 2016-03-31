var mongodb = require('mongodb');
var express = require('express');
//var bodyParser = require('body-parser');
var app = express();
app.use(express.urlencoded());
var MongoClient = mongodb.MongoClient;
var assert = require('assert');
var ObjectId = require('mongodb').ObjectID;
var url = 'mongodb://localhost:27017/moviesDB';

app.get('/',function(req,res){
	res.sendfile('./views/index.html');
});

app.get('/jquery',function(req,res){
	res.sendfile('./views/jslibs/jquery-1.12.1.js');
});

app.get('/findSongs/:name', function(req, res) {
	
	var movieName = req.params.name;
	
	MongoClient.connect(url, function (err, db) {
		
	db.collection('movies').findOne({name:movieName},function(err,docs){
				res.send(docs);
			});	
	});
    
	});


app.get("/movies", function(req, res) {
	
	MongoClient.connect(url, function (err, db) {
	
	var cursor =db.collection('movies').find( ).toArray(function(err,docs){
		res.send(docs);
	});
    
	});
});

MongoClient.connect(url, function (err, db) {
  if (err) {
    console.log('Unable to connect to the mongoDB server. Error:', err);
  } else {
    console.log('Connection established to', url);

    /*var collection = db.collection('movies');

    var mvie1 = {name: 'Baazigar', roles: ['abc', 'def', 'ghi']};
    var mvie2 = {name: 'Pardes', roles: ['jkl', 'mno', 'pqr']};
    var mvie3 = {name: 'Deewana', roles: ['stu', 'vwx', 'yza']};
    
    // Insert some users
    collection.insert([mvie1, mvie2, mvie3], function (err, result) {
      if (err) {
        console.log(err);
      } else {
        console.log('Inserted %d documents into the "movies" collection. The documents inserted with "_id" are:', result.length, result);
      }
      
      
      
      //Close connection
      
    });*/
    /*assert.equal(null, err);
    findMovies(db, function() {
        db.close();
    });*/
  }
});

/*var findMovies = function(db, callback) {
	   var cursor =db.collection('movies').find( ).toArray();
	   cursor.each(function(err, doc) {
	      assert.equal(err, null);
	      if (doc !== null) {
	         console.dir(doc);
	      } else {
	         callback();
	      }
	   });
	};*/
	
	var server = app.listen(8081, function() {
		
		var host = server.address().address;
		var port = server.address().port;
		
		console.log("Example app listening at http://%s:%s",host,port);
		
	});
	
/*$.getJSON("/movies", function(data){
    for (var i = 0, len = data.length; i < len; i++) {
        console.log(data[i]);
    }
});*/