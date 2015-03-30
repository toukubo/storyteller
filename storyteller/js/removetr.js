/**
 * remove
 * @param {element} element 
 */
 function removetr(element) {
 	var flag = true;
 	var count = 1;
 	while (flag) {
 		alert(element.parentNode);
 		if(element.parentNode == '[object HTMLTableRowElement]'){
	 		flag=false;
	 		return element.parentNode;
 		}else if(count > 5){
 			flag = false;
 		}else{
 				element = element.parentNode;
 				flag = true;
 		}
 		count = count + 1;
 	}
 		alert('called');
 }