$( document ).ready(function() {
    console.log( "ready!" );
    getUserFiles();
});

var data;

var getUserFiles = function(){
  let xhr = new XMLHttpRequest();

  xhr.open('GET', 'api/trees/usertrees');

  xhr.onreadystatechange = function() {
    if (xhr.readyState === 4) {
      if (xhr.status === 200) {
        data = JSON.parse(xhr.responseText);
        loadUserTrees(data);
        
      }
      else if (xhr.status === 404) {
        console.error('api/users not found.');
      }
      else {
        console.error('Unknown error: ' + xhr.status + ': ' + xhr.responseText);
      }
    }
  };

  xhr.send();
  
}

var testSendRequest = function(selected_tree){
  console.log(selected_tree);
  let xhr = new XMLHttpRequest();

  xhr.open('GET', 'http://127.0.0.1:8095/api/trees/Java');

  xhr.onreadystatechange = function() {
    if (xhr.readyState === 4) {
      if (xhr.status === 200) {
        let data = JSON.parse(xhr.responseText);
        
      }
      else if (xhr.status === 404) {
        console.error('api/users not found.');
      }
      else {
        console.error('Unknown error: ' + xhr.status + ': ' + xhr.responseText);
      }
    }
  };

  xhr.send();

};

var loadUserTrees = function(data){
	/*
	  <div id="userTreesDisplay">
     	 <div class="userTreeName">
       		 <h3>Java</h3>
      	</div>
      </div> */
    let displayContainer = document.getElementById("userTreesDisplay");
	for(const tree in data){
		let display = document.createElement('div');
		display.classList.add("userTreeName");
		let item = document.createElement('h3');
		item.textContent = tree;
		display.append(item);
		displayContainer.appendChild(display);
	}
	
}


// Editor scripts
var updateEditor = function(snippet){
  let codeEditor = ace.edit("editorCode");
  codeEditor.setValue(snippet);
}