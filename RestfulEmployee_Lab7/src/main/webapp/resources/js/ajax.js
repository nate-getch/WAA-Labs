//$(document).ready(function(){
	
	var contextRoot = "/" + window.location.pathname.split('/')[1];

	// Translate form to array
	// Then put in JSON format
	function serializeObject(form) {
		var jsonObject = {};
		var array = form.serializeArray();
		//	console.log(array);
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
				$('#formInput').html("");
				$("#formInput").append( '<H3 align="center"> New Employee Information <H3>');                
				$('#formInput').append("<H4 align='center'>First Name:  " + response.firstName  + "</h4>"  );
				$('#formInput').append("<H4 align='center'>Last Name: " + response.lastName  + "</h4>" );
				$('#formInput').append("<H4 align='center'>Email: " + response.email  + "</h4>");
				$("#formInput").append('<h4 align="center"> <a href="#" onclick="toggle_visibility(\'formInput\');resetForm(\'employeeForm\');"><b>EXIT</b> </a> </h4>');
				//make_visible('formInput');
				//make_hidden('errors');
				
			},
			error : function(errorObject) {
				// error: function(jqXHR, textStatus, HTTPStatus ){
				// jqXHR = jQuery XMLHttpRequest superset of XMLHttpRequest
				// EXAMPLE values: error: function(jQuery XMLHttpRequest, "error",
				// "Bad Request" ){
				// see http://api.jquery.com/jquery.ajax/
	
				if (errorObject.responseJSON.errorType == "ValidationError") {
					$('#success').html("");
					$('#errors').html("");
					$("#errors").append('<H3 align="center"> Error(s)!! <H3>');
					$("#result").append('<p>');
	
					var errorList = errorObject.responseJSON.errors;
					$.each(errorList, function(i, error) {
						$("#errors").append(error.message + '<br>');
					});
					$("#errors").append('</p>');
					$('#result').show();
				} else {
					alert(errorObject.responseJSON.errors(0)); // "non" Validation
					// Error
				}
			}
		});
	};

//});
		
/* 
function makeAjaxCall(){


	
	$.ajax({
 
		success: function(       ) {
			$('#formInput').html("");
			$("#formInput").append( '<H3 align="center"> New Employee Information <H3>');                
			$('#formInput').append("<H4 align='center'>First Name:  " +   + "</h4>"  );
			$('#formInput').append("<H4 align='center'>Last Name: " +   + "</h4>" );
			$('#formInput').append("<H4 align='center'>Email: " +   + "</h4>");
			$("#formInput").append('<h4 align="center"> <a href="#" onclick="toggle_visibility(\'formInput\');resetForm(\'employeeForm\');"><b>EXIT</b> </a> </h4>');
			make_visible('formInput');
			make_hidden('errors');
		},

		error: function(        ){	
			
		}
	
	});
}

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
*/
