/**
 * 
 */
$(document).ready(function(){
	$('.table .eBtn').on('click',function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		$.get(href, function(user, status){
			$('.myForm #id').val(user.id);
			$('.myForm #userName').val(user.userName);
			$('.myForm #message').val(user.message);
		});
		
		$('.myForm #exampleModal').modal();
	});
});