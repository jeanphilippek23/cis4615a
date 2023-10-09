//Rule 00. Input Validation and Data Sanitization (IDS)
//IDS03-J. Do not log unsanitized user input Given the non-compliant code below:
if (loginSuccessful) {
logger.severe(”User login succeeded for: ”+username) ;
} else {
logger.severe(”User login failed for : ”+username) ;
}
//Correct the code as shown in theCompliant Solution below:
if (loginSuccessful) {
logger.severe(”User loginsucceededfor:”+sanitizeUser(username));
}else{
logger.severe(”User loginfailedfor:”+sanitizeUser(username));
}
publicStringsanitizeUser(String username){
returnPattern.matches (”[ A−Za−z0−9 ]+” , username ))
? username : ” unauthorizeduser” ;
}
//Refer to: Rule 00. Input Validation and Data Sanitization (IDS)



