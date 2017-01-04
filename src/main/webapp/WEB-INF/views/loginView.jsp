<HTML>
<HEAD>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Форма входа в систему</title>
</HEAD>

<BODY>

<FORM NAME="login" METHOD="POST">
    Login: <input type="text" name="user" size="10"><br>
    Password: <input type="password" name="password" size="10"><br>
    <INPUT TYPE="BUTTON" VALUE="Войти" ONCLICK="enter()">
    <INPUT TYPE="BUTTON" VALUE="Регистрация" ONCLICK="register()">
</FORM>

<SCRIPT LANGUAGE="JavaScript">
    <!--
    function enter()
    {
        location.href="/index"

    }
    function register()
    {
        location.href="/registration"
    }
    // -->
</SCRIPT>
</BODY>
</HTML>