/** ALL */

/** TOP-BAR */

class Utilities {

  // TODO implement this method(time display of the header)
  NowDateTime () {
    let now = new Date();
    return document.getElementById("time").innerHTML = now.toLocaleString();
  }

}

// class Users extends Utilities {

//   var exampleModal = document.getElementById('exampleModal')
//   exampleModal.addEventListener('show.bs.modal', function (event) {
//     // Button that triggered the modal

//     var button = event.relatedTarget // edit button
//     // Extract info from data-bs-* attributes
    
//     var lastname = button.getAttribute('data-bs-object').getAttribute[0];
//     var firstname = button.getAttribute('data-bs-object').getAttribute[1]; 
//     // If necessary, you could initiate an AJAX request here
//     // and then do the updating in a callback.
//     //
//     // Update the modal's content.
//     var modalTitle = exampleModal.querySelector('.modal-title')
//     var modalBodyInput = exampleModal.querySelector('.modal-body input')
  
//     modalTitle.textContent = 'New message to ' + recipient
//     modalBodyInput.value = recipient
//   })

// }