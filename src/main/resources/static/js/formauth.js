
function validateForm() {
 // alert("inside validateform");	
  var fname = document.getElementById("fname").value;
  var lname = document.getElementById("lname").value;
  var addr = document.getElementById("addr").value;
/**   var sgender = document.getElementById("sgender").value;*/
  var gender_value;
 var country = document.getElementById("Country").value;
 var county = document.getElementById("County").value;
 var email = document.getElementById("email").value;
 var pswd =   document.getElementById("pswd").value;
// alert("fname"+fname);
 //alert ("email->"+email);
 //alert ("password->"+pswd);
 /*alert("First name:"+ fname +",  Last name:"+lname + ", ADddresss :"+addr+",   gender"+gender_value);*/

if (fname == "" || fname == null) {
	document.getElementById("fname1").innerHTML = "Enter firstname!";
    return false;
  }
 else
 if (lname == "" || lname == null) {
	document.getElementById("fname1").innerHTML = "Enter lastname!!";
    return false;
  }
  else
 if(email == "" || email == null)
 {
	document.getElementById("email1").innerHTML = "Enter your email id";
     return false;
 }
 else
 if (addr == "" || addr == null) {
	document.getElementById("addr1").innerHTML = "Enter the address!";
    return false;
  }
   else
 if(country == "none")
 {
	document.getElementById("location").innerHTML = "Select the country!";
    return false;
 }
 else
 if(county == "none")
 {
	document.getElementById("location").innerHTML = "Select the county!";
    return false;
 }
else
 if(pswd == "" || pswd == null)
 {
	document.getElementById("pswd1").innerHTML = "Enter the password";
    return false;
	
 }
 else
	if(document.querySelector('input[name = "gender"]:checked') == null)
	{
		/*alert(document.querySelector('input[name = "gender"]:checked'));*/
		document.getElementById("identity").innerHTML = "Choose your gender!";
		return false;
	}
	else
	{
		/*alert(document.querySelector('input[name = "gender"]:checked').value);*/
		gender_value = document.querySelector('input[name = "gender"]:checked').value;
	}

}

function checkform(){
	//alert("checkform included");
 var myfile = document.getElementById("myfile").value;
	 if(myfile == "" || myfile == null)
 {
	document.getElementById("myfile1").innerHTML = "CV is manadatory!";
    return false;
	
 }
else
if(myfile!="" || myfile!=null)
{
	alert(" Thank you. You have sucessfully registered for TalentHire Recruitment services.You will be redirected to the home page now");
	window.location.replace("http://localhost:8080/home.html");
	return false;
}
}