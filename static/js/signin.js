// console.log("chala");
const inputFields = document.querySelectorAll(".input-fields");
const inputLabels = document.querySelectorAll(".input-labels");
const inputGroup = document.querySelectorAll(".input-group");

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

let email = document.querySelector("#email");
let password = document.querySelector("#password");
let emllbl = document.querySelector("#emllbl");
const checkEmail = async (email) => {
  const response = await fetch("check_email.do?email=" + email);
  const result = await response.text();
  return result;
};

email.addEventListener("blur", () => {
  checkEmail(email.value)
    .then((data) => {
      if (data == 0) {
        console.log("Not found functionality");
        emllbl.innerHTML = "Invalid email address";
      } else if (data == 1) {
        console.log("Email verified functionality");
      } else if (data == 2) {
        console.log("Email not verified functionality");
      }
    })
    .catch((error) => {
      console.log(error);
    });
});
