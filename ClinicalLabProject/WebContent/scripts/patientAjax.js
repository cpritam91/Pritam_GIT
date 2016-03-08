/**
 * 
 */
$(function(){ //Ready Handler
	
	$("#docId").on('keyup',function(){
		var usrId = $(this).val();
		$.ajax({
			type: 'GET', 
            url: "data/doctors.json",
            dataType: "text",
            success: function(data) {
                var flag = false;
                var docArray = $.parseJSON(data);
                for (var i=0;i<docArray.length;++i) {
                	if(usrId == docArray[i].code) {
                		$("#docName").val(docArray[i].name);
                		flag = true;
                	}
                }
                if(!flag)
                	$("#docName").val("");
            }
		});
	});
	
	
});

$(function(){ //Ready Handler
	
	$("#patientCode").on('keyup',function(){
		var patId = $(this).val();
		var datastream = "patientCode="+patId;
		$.ajax({
			type: 'GET', 
            url: "GetPatientDetails",
            dataType: "text",
            data: datastream,
            success: function(data) {
                var patient = $.parseJSON(data);
                $("#patientName").val(patient.patientName);
                $("#age").val(patient.age);
                $("#handPhone").val(patient.handPhone);
                $("#email").val(patient.email);
            }
		});
	});

});


var counter = 6;
$(function() {
    jQuery('input.addTest').click(function(event){
        event.preventDefault();
        counter++;
        var newRow = jQuery('<tr><td><input type="text" id="testCode' +
            counter + '"/></td id="testName'+counter+'"><td></td><td id="testAmt'+counter+'"></td></tr>');
        $('#TestList tr:last').before(newRow);
    });
    //-------------------------------------------- DEBUG
    $("#testCode"+counter).on('keyup',function(){
    	var testId = $(this).val();
		var datastream = "testCode="+testId;
		$.ajax({
			type: 'GET', 
            url: "GetTestDetails",
            dataType: "text",
            data: datastream,
            success: function(data) {
                var test = $.parseJSON(data);
                $("#testName"+counter).val(test.testName);
                $("#testAmt"+counter).val(test.amount);
            }
		});
    });
    //---------------------------------------------
});
function fetchData(event) {
    var textbox = event.target;
    var id=textbox.id;
    var index = parseInt(id.slice(8,id.length));
	
    var request = new XMLHttpRequest();
    
    request.onreadystatechange = function(response) {
    	if (request.readyState === 4 && request.status === 200) { 
    	    var jsonOptions = JSON.parse(request.responseText);
    	    var ele1 = document.getElementById("testName"+index); 
    	    ele1.innerHTML = jsonOptions.testName;
    	    var ele2 = document.getElementById("testAmt"+index); 
    	    ele2.innerHTML = jsonOptions.amount;
    	}
    }    
    url='GetTestDetails?testCode='+textbox.value;
    request.open('GET', url, true);
    request.send();
}
for(var i=1;i<counter;i++) {
	var textBox = document.getElementById("testCode"+i);
	textBox.addEventListener ("keyup", fetchData, false);
}

