/**
  * Load display containing user directories 
 **/
var displayAvailableTrees = function(){
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
		
		item.addEventListener('click', loadSelectedTreeRootDirectory);
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
var loadSelectedTreeRootDirectory = function(event){
	console.log(event.target.textContent);
	let selectedTree = event.target.textContent;
	let tree = data[selectedTree];
	let path = selectedTree;


	//Load Directories
	let directories = tree["directories"];
	let itemColContainer = htmlToElement('<div id="dir-java" class="directory-col"></div>');
	for(let i = 0; i < directories.length; ++i){
		let dir = tree.directories[i];
		let dirName = dir.name;
		let cur_path = path + "-" + dirName;
		let item = createTreeItem(dirName, cur_path);
		item.classList.add("directory")
		itemColContainer.append(item);
	}
	

	
	//Load Files
	let files = tree["files"];
	for(let i = 0; i < files.length; ++i){
		let file = files[i];
		let fileName = file.name;
		let file_path = path + "-" + "#" + "-" + fileName;
		let item = createTreeItem(fileName, file_path);
		item.classList.add("file");
		itemColContainer.append(item);
	}
	
	let treeDisplay = document.getElementById('displayWindow');
	treeDisplay.textContent = "";
	treeDisplay.append(itemColContainer);
	
}



var createTreeItem = function(item_name, path){
	let itemButton = htmlToElement('<button class="treeItem btn btn-light" onclick="loadSelectedNode(event)"></button>');
	itemButton.textContent = item_name;
	path = path.replace(" ", "_");
	itemButton.id = path;
	return itemButton;
}

var loadSelectedNode = function(event){
	event.preventDefault();
	var target = event.target;
	var id = target.id;
	var path = id.replace("_", " ").split("-");
	console.log(path);
	
	let tree = data[path[0]];
	for(let i = 1; i < path.length; ++i){
		let cur = path[i];

		console.log(tree);
	}
}
