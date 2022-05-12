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
		
		item.addEventListener('click', loadTree);
	}
	
}

/*
    <div id="displayWindow" class="border border-top-0 rounded-bottom">
      <div id="dir-java" class="directory-col">
        <button class="treeItem btn btn-light">Fundamentals</button>
      </div>

      <div id="dir-java-fundamentals" class="directory-col">
        <button class="treeItem btn btn-light">Arrays</button>
      </div>
    </div>
*/
var loadTree = function(event){
	console.log(event.target.textContent);
	let selectedTree = event.target.textContent;
	let tree = data[selectedTree];
	let path = selectedTree;


	let directories = tree["directories"];
	let itemColContainer = htmlToElement('<div id="dir-java" class="directory-col"></div>');
	for(let i = 0; i < directories.length; ++i){
		let dir = tree.directories[i];
		let dirName = dir.name;
		let item = createTreeItem(dirName, "");
		itemColContainer.append(item);
	}
	
	let treeDisplay = document.getElementById('displayWindow');
	treeDisplay.textContent = "";
	treeDisplay.append(itemColContainer);
	
}

function htmlToElement(html) {
    var template = document.createElement('template');
    html = html.trim(); // Never return a text node of whitespace as the result
    template.innerHTML = html;
    return template.content.firstChild;
}

var createTreeItem = function(item_name, path){
	let itemButton = htmlToElement('<button class="treeItem btn btn-light" onclick="loadDirFile()"></button>');
	itemButton.textContent = item_name;
	return itemButton;
	/*
	let button = document.createElement('button');
	button.classList.add('treeItem');
	button.classList.add('btn');
	button.classList.add('btn-light')
	button.textContent = item_name;
	button.onclick = loadDirFile;
	return button;
	*/
	//<button class="treeItem btn btn-light">Fundamentals</button>	
}

var loadDirFile = function(event){
	console.log(event.target.textContent);
}



// Editor scripts
var updateEditor = function(snippet){
  let codeEditor = ace.edit("editorCode");
  codeEditor.setValue(snippet);
}