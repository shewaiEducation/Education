<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>login</title>
<meta name="description"
	content="particles.js is a lightweight JavaScript library for creating particles.">
<meta name="author" content="Vincent Garreau" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link rel="stylesheet" media="screen" href="css/style.css">
<link rel="stylesheet" type="text/css" href="css/default.css">
<!--必要样式-->
<link rel="stylesheet" type="text/css" href="css/styles.css">

<!-- 自己的调试样式 -->
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>

	<!-- count particles -->
	<!-- particles.js container -->
	<div id="particles-js">

		<div class='login'>
			<div class='login_title'>
				<span>账号登录</span>
			</div>
			<div class='login_fields'>
				<div class='login_fields__user'>
					<div class='icon'>
						<img src='img/user_icon_copy.png'>
					</div>
					<input placeholder='用户名' type='text' name="username" id="username" />
					<div class='validation'>
						<img src='img/tick.png'>
					</div>
					</input>
				</div>
				<div class='login_fields__password'>
					<div class='icon'>
						<img src='img/lock_icon_copy.png'>
					</div>
					<input placeholder='密码' type='password' name="password"
						id="password" />
					<div class='validation'>
						<img src='img/tick.png'>
					</div>
				</div>
				<div class='login_fields__submit'>
					<input type='submit' value='登录'>
					<div class='forgot'>
						<a href='#'>忘记密码?</a>
					</div>
				</div>
				<div class='disclaimer'>
					<p id="alert"
						style="font-size:18px;color:rgba(202, 51, 51, 0.9);display:none">用户名或密码错误</p>
				</div>
			</div>
			<div class='success'>
				<h2>认证成功</h2>
				<p>欢迎回来</p>
			</div>
			<div class='disclaimer'>
				<p style="font-size:18px">欢迎进入涉外经济学院教务处</p>
			</div>
		</div>
		<div class='authent' id="myauthent">
			<img src='img/puff.svg'>
			<p>认证中...</p>
		</div>


	</div>


	<!-- 背景 -->
	<!-- scripts -->


</body>

<script src="js/particles.min.js"></script>

<script src="js/app.js"></script>
<script type="text/javascript" src='js/stopExecutionOnTimeout.js?t=1'></script>
<script src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery-ui.min.js"></script>
<script>
	//base64加密开始  
	var keyStr = "ABCDEFGHIJKLMNOP" + "QRSTUVWXYZabcdef" + "ghijklmnopqrstuv"
			+ "wxyz0123456789+/" + "=";

	function encode64(input) {

		var output = "";
		var chr1, chr2, chr3 = "";
		var enc1, enc2, enc3, enc4 = "";
		var i = 0;
		do {
			chr1 = input.charCodeAt(i++);
			chr2 = input.charCodeAt(i++);
			chr3 = input.charCodeAt(i++);
			enc1 = chr1 >> 2;
			enc2 = ((chr1 & 3) << 4) | (chr2 >> 4);
			enc3 = ((chr2 & 15) << 2) | (chr3 >> 6);
			enc4 = chr3 & 63;
			if (isNaN(chr2)) {
				enc3 = enc4 = 64;
			} else if (isNaN(chr3)) {
				enc4 = 64;
			}
			output = output + keyStr.charAt(enc1) + keyStr.charAt(enc2)
					+ keyStr.charAt(enc3) + keyStr.charAt(enc4);
			chr1 = chr2 = chr3 = "";
			enc1 = enc2 = enc3 = enc4 = "";
		} while (i < input.length);

		return output;
	}
	/**
		
	*/
	$('input[type="submit"]').click(function() {
		var uname = $("#username").val();
		var upass = $("#password").val();
		$.ajax({
			url : "loginAction_login",
			datatype : "json",
			type : "post",
			data : {
				"username" : encode64(uname),
				"password" : encode64(upass)
			},
			success : function(data) {
				setTimeout(function() {
					$('.authent').show().animate({
						right : 100
					}, {
						easing : 'easeOutQuint',
						duration : 600,
						queue : false
					});
					$('.authent').animate({
						opacity : 0
					}, {
						duration : 200,
						queue : false
					}).addClass('visible');
					$('.login').removeClass('testtwo');
				}, 1000);
				setTimeout(function() {
					$('.login').removeClass('test');
				}, 1200);
				if (data == 'success') {
					setTimeout(function() {
						$('.success').fadeIn();
					}, 1500);
				} else {
					$('#alert').show();
					$('.login').fadeIn();
					setTimeout(function() {
						$('.authent').css('display', 'none');
					}, 1700);
				}
			},
			error : function(e) {
				alert(222);
			},
			beforeSend : function() {
				$('.login').addClass('test');
				setTimeout(function() {
					$('.login').addClass('testtwo');
				}, 200);
				setTimeout(function() {
					$('.authent').show().animate({
						right : 450
					}, {
						easing : 'easeOutQuint',
						duration : 600,
						queue : false
					});
					$('.authent').animate({
						opacity : 1
					}, {
						duration : 200,
						queue : false
					}).addClass('visible');
				}, 500);
			}
		});

	});
	$('input[type="text"],input[type="password"]').focus(function() {
		$(this).prev().animate({
			'opacity' : '1'
		}, 200);
	});
	$('input[type="text"],input[type="password"]').blur(function() {
		$(this).prev().animate({
			'opacity' : '.5'
		}, 200);
	});
	$('input[type="text"],input[type="password"]').keyup(function() {
		if (!$(this).val() == '') {
			$(this).next().animate({
				'opacity' : '1',
				'right' : '30'
			}, 200);
		} else {
			$(this).next().animate({
				'opacity' : '0',
				'right' : '20'
			}, 200);
		}
	});
	var open = 0;
	$('.tab').click(function() {
		$(this).fadeOut(200, function() {
			$(this).parent().animate({
				'left' : '0'
			});
		});
	});
</script>
</html>
