$(function() {

	// solving the active menu problem

	switch (menu) {

	case 'About':
		$('#about').addClass('active');
		break;

	case 'Contact':
		$('#contact').addClass('active');
		break;
		
	case 'All_Products':
		
		$('#listProducts').addClass('active');
		break;

	default:
		$('#listProducts').addClass('active');
		$('#a_').addClass('active');
		break;
	}

});