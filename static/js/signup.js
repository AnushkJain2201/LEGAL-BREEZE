console.log("chala");
const inputFields = document.querySelectorAll(".input-fields");
const inputLabels = document.querySelectorAll(".input-labels");
const inputGroup = document.querySelectorAll(".input-group");
// console.log(inputGroup);
// console.log(inputFields);
// console.log(inputLabels);

inputFields.forEach((el) => {
  el.addEventListener("focus", (e) => {
    // e.target.classList.add('anima');
    // console.log(e.target.parentElement.children[1]);
    e.target.parentElement.children[1].classList.add("anima");
  });
});

inputFields.forEach((el) => {
  el.addEventListener("blur", (e) => {
    // e.target.classList.add('anima');
    // console.log(e.target.parentElement.children[1]);
    if (e.target.value == "")
      e.target.parentElement.children[1].classList.remove("anima");
  });
});

// ----------------------------- Phone start -------------------------------
const phone = document.querySelector("#phone");
const checkPhoneExists = async (phone) => {
    console.log("Entered mobile number is: " + phone);
  const response = await fetch("check_phone_exists.do?phone=" + phone);
  const result = await response.text();
  console.log("Response recieved from server side: "+ result);
  return result;
};
phone.addEventListener("blur", () => {
    checkPhoneExists(phone.value)
    .then((data) => {
        if (data== 'true') {
            console.log("Duplicate exists");
        } else {
            console.log("Duplicate does not exists");
      }
    })
    .catch((err) => {
        console.log(err);
    });
});
// ----------------------------- Phone end -------------------------------

// ----------------------------- Email start -------------------------------
const email = document.querySelector('#email');
const checkEmailExists = async (email)=>{
    const response = await fetch('check_email_exists.do?email='+email);
    const result = await response.text();
    return result;
}
email.addEventListener('blur',()=>{
    checkEmailExists(email.value).then((data)=>{
        if(data == 'true'){
            console.log("Duplicate exists");
        }else{
            console.log("Duplicate does not exists");
        }
    }).catch((err)=>{
        console.log(err);
    });
});
// ----------------------------- Email end -------------------------------