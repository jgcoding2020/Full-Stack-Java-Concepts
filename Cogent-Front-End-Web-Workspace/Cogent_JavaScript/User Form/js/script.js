function validate(){
    if (document.loginform.user.value == "" || document.loginform.password.value)
    {
        alert("All fields need to be entered!")      
            document.loginform.user.focus();
            return false;      
    }
    return true;
}

