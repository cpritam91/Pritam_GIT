/**
 * 
 */
function normalFunction() {
	alert("I am a Normal Function.");
}

function withArgFunction(name) {
	alert("Welcome to JavaScript Functions " +name);
}

function returnFunction(name) {
	return "Welcome to JavaScript Functions " +name;
}

function takeFunctionAsArg(func) {
	
	var recvd = func;
	alert(recvd);
}

function returningFunctions() {
	return {
		addClass:function(){
			alert("Add Class Called");
		},
		removeClass:function(){
			alert("Remove Class Called");
		}
	};
}

var element1 = document.getElementById("btn1");
element1.addEventListener("click", normalFunction);

var element2 = document.getElementById("btn2");
element2.addEventListener("click", function(event) {
	withArgFunction("Pritam");
});

var element3 = document.getElementById("btn3");
element3.addEventListener("click", function(event) {
	var ret = returnFunction("Chakraborty");
	alert(ret);
});

var element4 = document.getElementById("btn4");
element4.addEventListener("click", function(event) {
	takeFunctionAsArg(returnFunction("Pritam"));
});

var element5 = document.getElementById("btn5");
element5.addEventListener("click", function(event) {
	var ret = returningFunctions();
	ret.addClass();
	ret.removeClass();
});