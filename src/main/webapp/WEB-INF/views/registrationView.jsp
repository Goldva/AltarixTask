<HTML>
<HEAD>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Форма входа в систему</title>
</HEAD>

<BODY>

<FORM NAME="register" METHOD="POST">
    Фамилия: <input type="text" name="surname" size="20"><br>
    Имя: <input type="text" name="firstname" size="20"><br>
    Отчество: <input type="text" name="midlename" size="20"><br>
    E-mail: <input type="text" name="email" size="20"><br>
    Логин: <input type="text" name="login" size="20"><br>
    Пароль: <input type="password" name="password" size="20"><br>
    <INPUT TYPE="BUTTON" VALUE="Зарегистрироваться" ONCLICK="register()">
    <INPUT TYPE="BUTTON" VALUE="Отмена" ONCLICK="cancel()">
</FORM>

<SCRIPT LANGUAGE="JavaScript">
    <!--
    function register()
    {
    }
    function cancel()
    {
        location.href="/login"
    }
    // -->
</SCRIPT>
</BODY>
</HTML>