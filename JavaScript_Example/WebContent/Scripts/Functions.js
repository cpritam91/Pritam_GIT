/**
 * 
 */

function init() {
	var item = {
		"itemName":"Television",
		"itemImage":"Images/tv.jpg",
		showItem:function(){
			console.log('show Item Called');
			var ele = document.getElementById("itemName");
			ele.innerHTML = this.itemName;
			/*var img = document.getElementById("pict");
			img.innerHTML = this.itemImage;*/
			document.getElementsByTagName("img")[0].src = this.itemImage;
		}
	};
	
	console.log("Init Called");
	console.log(item.itemName);
	item.showItem();
	
}

(function(){
	init();
})();