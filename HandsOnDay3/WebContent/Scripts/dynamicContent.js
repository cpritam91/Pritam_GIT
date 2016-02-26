/**
 * 
 */
//var priceList = JSON.parse(priceList);
var table = document.getElementById("table1");
for(var i = 0; i <priceList.length;i++) {
	
	var row= table.insertRow(i);
	
	var cell1 = row.insertCell(0);
	var element1 = document.createElement("input");
    element1.type = "checkbox";
    element1.name="addItem";
    element1.id="addItem"+i;
    element1.value="Item"+i;
    cell1.appendChild(element1);
	
    var cell2 = row.insertCell(1);
    cell2.id="Item"+i;
    cell2.innerHTML=priceList[i].itemName;
    
    
    var cell3 = row.insertCell(2);
    cell3.id="Price"+i;
    cell3.innerHTML=priceList[i].price;
}
var total=0;
for(i=0;i<priceList.length;i++) {
	var checkbox = document.getElementById("addItem"+i);
	checkbox.addEventListener ("change", calculateTotal, false);
}
function calculateTotal(event) {
    var checkbox = event.target;
    var val =checkbox.value;
    var index = parseInt(val.slice(4,val.length));
    if (checkbox.checked) {
        total+=parseFloat(priceList[index].price);
    }
    else {
    	total-=parseFloat(priceList[index].price);
    }
    document.getElementById("total").innerHTML = total;
}