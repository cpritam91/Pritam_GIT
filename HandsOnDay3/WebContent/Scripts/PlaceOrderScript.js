/**
 * 
 */
var submit = document.getElementById("sub");

submit.addEventListener("click",function() {
	var name = document.getElementById("name");
	newName = prompt("Is your name entered correctly?",name.value);
	if(newName != null)
		name.value = newName;
	confirmAllInfo();
});

function arrToString(arr) {
	var str="";
	var len = arr.length;
	for(var i = 0; i<len-1 ; i++)
		str = str + arr[i] +",";
	str = str + arr[len-1];
	return str;
}

function confirmAllInfo() {
	
	var name = document.getElementById("name").value;
	
	var l = document.getElementsByName("location")[0];
	var loc = l.options[l.selectedIndex].text;
	

	var payment = document.getElementsByName("payment");
	var payment_value;
	for(var i = 0; i < payment.length; i++){
	    if(payment[i].checked){
	    	payment_value = payment[i].value;
	    }
	}
	
	var off = document.getElementsByName("offer");
	var offers = [];
	var ind=0
	for(var i = 0; i < off.length; i++){
	    if(off[i].checked){
	    	offers.push(off[i].value);
	    }
	}
	
	var flag = confirm("Dear " +name+"\nConfirm Your Choices : \nLocation : "+loc+"\nPayment : "
			+payment_value+"\nGifts : "+arrToString(offers));
	if(flag==true) {
		alert("Thanks for confirming.");
		document.getElementById("myForm").submit();
	}
	else
		document.getElementById("myForm").reset();
}