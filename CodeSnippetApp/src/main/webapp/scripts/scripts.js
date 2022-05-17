
window.addEventListener('load', function(){
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
        displayAvailableTrees(data);
        
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

function htmlToElement(html) {
    var template = document.createElement('template');
    html = html.trim(); // Never return a text node of whitespace as the result
    template.innerHTML = html;
    return template.content.firstChild;
}

// Editor scripts
var updateEditor = function(snippet){
  let codeEditor = ace.edit("editorCode");
  codeEditor.setValue(snippet);
}