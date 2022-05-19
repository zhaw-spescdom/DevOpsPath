$(function() {
	var list = $('.slide');
	var current = 0;
	
	var main = $('#main');
	
	var nav = $('#nav');
	for (var i = 0; i < list.size(); i++) {
		if (i == 0) {
			nav.append('<li id="' + i + '" class="active"><span class="button"></span></li>');
		} else {
			nav.append('<li id="' + i + '" class=""><span class="button"></span></li>');
		}
	}
	
	$('#nav li').click(function() {
		current = $('#nav li').index(this);
		scroll();
	});
	$(window).bind('mousewheel', function(event) {
		if (event.originalEvent.wheelDelta >= 0) {
			scroll(-1);
		} else {
			scroll(1);
		}
	});
	
	/* Functions */
	var isScrolling = false;
	function scroll(dir) {
		if(isScrolling){
				return;
		}
		isScrolling = true;

		if (dir == -1) {
				if (current > 0) {
						current--;
				}
		} else {
				if (current < list.size() - 1) {
						current++;
				}
		}
		var number = 100 * current;
		var value = "translateY(-" + number + "vh)";
		main.css("transform", value);
		for (var i = 0; i < list.size(); i++) {
				$('#nav li:nth-child(' + (i + 1) + ')').removeClass('active');
		}
		$('#nav li:nth-child(' + (current + 1) + ')').addClass('active');

		setTimeout(function() {
				isScrolling = false;
		},500); // -> Here you can modify the time between functions call
	}
});