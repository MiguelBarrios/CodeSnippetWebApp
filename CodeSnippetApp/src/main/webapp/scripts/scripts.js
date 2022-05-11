var testSendRequest = function(selected_tree){
  console.log(selected_tree);
  let xhr = new XMLHttpRequest();

  xhr.open('GET', 'http://127.0.0.1:8095/api/trees/Java');

  xhr.onreadystatechange = function() {
    if (xhr.readyState === 4) {
      if (xhr.status === 200) {
        let data = JSON.parse(xhr.responseText);
        console.log(data);
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


// Editor scripts
var updateEditor = function(snippet){
  let codeEditor = ace.edit("editorCode");
  codeEditor.setValue(snippet);
}