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
          <a href="index.do"
            ><i class="fa-solid fa-arrow-left" style="color: #ffffff"></i
          ></a>
          <img src="static/img/download.jpg" alt="ricky-morty-image" />
          <h2>SIGNUP</h2>
          <div class="input-group">
            <input
              class="input-fields"
              type="text"
              name="name"
              id="name"
              required
            />
            <label class="input-labels" for="name">User Name</label>
          </div>
          <div class="input-group">
            <input
              class="input-fields"
              type="text"
              name="email"
              id="email"
              required
            />
            <label class="input-labels" for="email">Email</label>
          </div>
          <div class="input-group">
            <input
              class="input-fields"
              type="password"
              name="password"
              id="password"
              required
            />
            <label class="input-labels" for="password">Password</label>
          </div>
          <div class="input-group">
            <input
              class="input-fields"
              type="text"
              name="phone"
              id="phone"
              required
            />
            <label class="input-labels" for="phone">phone</label>
          </div>
          <!-- Radio buttons start -->
          <div class="flex items-center mb-4">
            <input
              id="radio-1"
              type="radio"
              value="2"
              name="user_type_id"
              class="w-4 h-4 text-blue-600 bg-gray-100 border-gray-300 focus:ring-blue-500 dark:focus:ring-blue-600 dark:ring-offset-gray-800 focus:ring-2 dark:bg-gray-700 dark:border-gray-600"
            />
            <label
              for="radio-1"
              class="ms-2 text-sm font-medium text-gray-900 dark:text-gray-300"
              >I am a service Provider</label
            >
          </div>
          <div class="flex items-center">
            <input
              checked
              id="radio-2"
              type="radio"
              value="1"
              name="user_type_id"
              class="w-4 h-4 text-blue-600 bg-gray-100 border-gray-300 focus:ring-blue-500 dark:focus:ring-blue-600 dark:ring-offset-gray-800 focus:ring-2 dark:bg-gray-700 dark:border-gray-600"
            />
            <label
              for="radio-2"
              class="ms-2 text-sm font-medium text-gray-900 dark:text-gray-300"
              >I am a service Seeker</label
            >
          </div>
          <!-- Radio buttons -->
          <div class="input-group">
            <label for="state">state</label>
            <select name="state" id="state" required>
              <c:forEach var="state" items="${states}">
                <option value="${state.stateId}">${state.name}</option>
              </c:forEach>
            </select>
          </div>
          <br />
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
    <script src="static/js/signup.js"></script>
  </body>
</html>
