<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>Thank you</title>
		<style>
			h1 {
				color: green ;
			}
			h2 {
				color: purple ;
			}
			h3 {
				color: blue;
			}
			q	{
				background-color: yellow
			}
		</style>
	</head>
	<body>
		<h1>THANK YOU</h1>
		<hr>
		<h2>Hi <?php echo $_POST["email"] ; ?>,</h2>
		<h3>Your comment:</h3>
		<big><q><?php echo $_POST["yourcomment"] ; ?></q></big>
		<p>Thank you for your valuable comment.</p>
	</body>
</html>