
// setup
let codeEditor = ace.edit("editorCode");

// ACE docs: https://github.com/ajaxorg/ace/wiki
let editorLib = {
  init(){
    // ace configuration

    //Theme
    codeEditor.setTheme('ace/theme/dreamweaver');

    //Set language
    codeEditor.session.setMode("ace/mode/java");

    // Set Options
    // Options: https://github.com/ajaxorg/ace/wiki/Configuring-Ace
    codeEditor.setOptions({
      fontFamily:'Inconsolata',
      fontSize:'12',
      enableBasicAutocompletion:true,
      enableLiveAutocompletion:true
    });

  }
}

editorLib.init();

