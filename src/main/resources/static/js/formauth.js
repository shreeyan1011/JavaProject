
function validateForm() {
  var fname = document.getElementById("fname").value;
  var lname = document.getElementById("lname").value;
  var addr = document.getElementById("addr").value;
/**   var sgender = document.getElementById("sgender").value;*/
  var gender_value;
 var country = document.getElementById("addr").value;
 var county = document.getElementById("County").value;
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