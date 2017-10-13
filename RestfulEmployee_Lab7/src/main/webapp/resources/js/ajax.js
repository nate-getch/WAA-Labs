var contextRoot = "/" + window.location.pathname.split('/')[1];

toggle_visibility = function(id) {
    var element = document.getElementById(id);
    if(element.style.display == 'block')
    	element.style.display = 'none';
    else
    	element.style.display = 'block';
 }	

make_hidden = function(id) {
    var element = document.getElementById(id);
    element.style.display = 'none';
        }	   

make_visible = function(id) {
    var element = document.getElementById(id);
    element.style.display = 'block';
 }	   

resetForm = function(id) {
    var element = document.getElementById(id);
    $(element)[0].reset();

    }	  

// Translate form to array
// Then put in JSON format
function serializeObject (form)
{
    var jsonObject = {};
    var array = form.serializeArray();
    $.each(array, function() {
         	jsonObject[this.name] = this.value;
    });
    return jsonObject;

};

function makeAjaxCall(){
	var dataToSend = JSON.stringify(serializeObject($('#employeeForm')));
	$.ajax({
		type : 'POST',
		url : contextRoot + '/api/employee/save',
		dataType : "json", // Accept header
		data : dataToSend,
		contentType : 'application/json', // Sends - Content-type
		success : function(response) {
			$('#errors').html("");

			console.log(response);
			$('.modal-body').html("");             
			$('.modal-body').append("<H4 align='center'>First Name:  " + response.firstName  + "</h4>"  );
			$('.modal-body').append("<H4 align='center'>Last Name: " + response.lastName  + "</h4>" );
			$('.modal-body').append("<H4 align='center'>Email: " + response.email  + "</h4>");
			//make_visible('formInput');
			make_hidden('errors');
			resetForm('employeeForm');
			$('#myModal').modal('show');
		},
		error : function(errorObject) {
			// error: function(jqXHR, textStatus, HTTPStatus ){
			// jqXHR = jQuery XMLHttpRequest superset of XMLHttpRequest
			// EXAMPLE values: error: function(jQuery XMLHttpRequest, "error",
			// "Bad Request" ){
			// see http://api.jquery.com/jquery.ajax/
			
			console.log(errorObject.responseJSON.errorType);
			if (errorObject.responseJSON.errorType == "ValidationError") {
				$('#success').html("");
				$('#errors').html("");
				$("#errors").append('<H3 align="center"> Error(s)!! <H3>');

				var errorList = errorObject.responseJSON.errors;
				$.each(errorList, function(i, error) {
					$("#errors").append(error.message + '<br>');
				});
				$("#errors").append('</p>');
				make_visible('errors');
			} else {
				alert(errorObject.responseJSON.errors(0)); // "non" Validation
				// Error
			}
		}
	});
};
