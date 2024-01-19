<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>

    <script
      src="https://kit.fontawesome.com/c52493ba6c.js"
      crossorigin="anonymous"
    ></script>

    <script src="https://www.google.com/recaptcha/api.js" async defer></script>

    <link rel="stylesheet" href="static/css/style.css" />
  </head>

  <body>
    <main>
      <div class="login-wrapper">
        <form action="signup.do" class="form" method="post">
          <!-- <a href="index.do"
            ><i class="fa-solid fa-arrow-left" style="color: #ffffff"></i
          ></a> -->
          <img src="static/img/download.jpg" alt="ricky-morty-image" />
          <h2>SIGNUP</h2>
          <div class="input-group">
            <input type="text" name="name" id="name" required />
            <label for="name">User Name</label>
          </div>
          <div class="input-group">
            <input type="text" name="email" id="email" required />
            <label for="email">Email</label>
          </div>
          <div class="input-group">
            <input type="password" name="password" id="password" required />
            <label for="password">Password</label>
          </div>
          <div class="input-group">
            <input type="text" name="phone" id="phone" required />
            <label for="phone">phone</label>
          </div>

          <div class="input-group">
            <select name="state" id="state" required>
              <c:forEach var="state" items="${states}">
                <option value="${state.stateId}">${state.name}</option>
              </c:forEach>
            </select>
            <label for="state">state</label>
          </div>
          <div class="input-group">
            <div
              class="g-recaptcha"
              data-sitekey="6Lc5sSopAAAAAEoDTF_P9Pu1h3vt1IwrONV73YSm"
            ></div>
          </div>
          <input type="submit" value="Signup" class="submit-btn" />
        </form>
      </div>
    </main>
  </body>
</html>
