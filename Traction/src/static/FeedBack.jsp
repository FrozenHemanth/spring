<html>
<head>
<title>FeedBack page</title>
</head>
<body>

<h1>FeedBack</h1>

<form action="feedback">

<pre>
    Name<input type="text" name="name">
    Email<input type="email" name="email">
    Feedback<input type="text" name="feedback">
    Rating<input type="text" name="rating">
    <input type="submit" value="Submit">

     <h1><span>${feedbackMessage}</span></h1>

</pre>
</form>
</body>
</html>
