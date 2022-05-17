<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>Snippet Tree</title>
    <meta name="description" content="" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="css/editor-style.css" />
    <link rel="stylesheet" href="css/style.css" />
  </head>
  <body>
    
    <!-- User Trees Display -->
    <div id="userTreesDisplay">
    </div>
  	
    <div id="selectedTreeContainer" class="border border-bottom-0 rounded-top">
      <h1 id="selectedTreeHeader">Java</h1>
    </div>

    <div id="displayWindow" class="border border-top-0 rounded-bottom">
      <div id="dir-java" class="directory-col">
        <button class="treeItem btn btn-light">Fundamentals</button>
      </div>

      <div id="dir-java-fundamentals" class="directory-col">
        <button class="treeItem btn btn-light">Arrays</button>
      </div>
    </div>

    <!-- Modal -->

    <!-- Button trigger modal -->
    <!-- <button id="showModal" class="btn btn-primary">Add</button> -->

    <!-- Modal -->
    <div
      class="modal fade"
      id="addItemModal"
      tabindex="-1"
      aria-labelledby="exampleModalLabel"
      aria-hidden="true"
    >
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
          </div>
          <div class="modal-body">...</div>
          <div class="modal-footer">
            <button type="button" class="btn btn-secondary closeModalBtn">
              Close
            </button>
            <button type="button" class="btn btn-primary">Add</button>
          </div>
        </div>
      </div>
    </div>

    <!-- Editor-->
    <div class="editor">
      <div class="editor__wrapper">
        <div class="editor__body">
          <div id="editorCode" class="editor__code"></div>
        </div>
      </div>
    </div>

    <!-- Ace Editor -->
    <!-- https://pagecdn.com/lib/ace -->
    <script src="https://pagecdn.io/lib/ace/1.4.13/ace.js"></script>
    <script src="https://pagecdn.io/lib/ace/1.4.13/mode-java.js"></script>
    <script src="https://pagecdn.io/lib/ace/1.4.13/mode-javascript.js"></script>
    <script src="https://pagecdn.io/lib/ace/1.4.13/ext-language_tools.js"></script>

    <script
      src="https://code.jquery.com/jquery-3.6.0.js"
      integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
      integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
      crossorigin="anonymous"
    ></script>
    <script src="scripts/scripts.js"></script>
    <script src="scripts/editor.js"></script>
    <script src="scripts/treeDisplay.js"></script>
    <!-- view display-->

    <script>
      var addItemToTree = function(element){
        console.log(element.parentNode.id);

        $("#addItemModal").modal("show");
      }

      $('.closeModalBtn').on('click', function(element_id){
        $('#addItemModal').modal('hide')
      });
    </script>
  </body>
</html>
