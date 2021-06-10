
function validation() {
	var name = document.getElementById("name").value;
    if (name == null || name == "") {
        alert("campos nao podem ser vazios caro usuario estimado!");
        return false;
    }
    
    var description = document.getElementById("description").value;
    if (description == null || description == "") {
    	alert("campos no podem ser vazios caro usuario estimado!");
        return false;
    }
}