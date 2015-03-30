
function selectall(form){
i = 0;

	for(;i < form.elements.length;i++){

		if(form.elements[i].type=="checkbox"){
			form.elements[i].checked=true;
		}
	}
}
function deselectall(form){
i = 0;
	for(;i < form.elements.length;i++){
		if(form.elements[i].type=="checkbox"){
			form.elements[i].checked=false;
		}
	}
}
