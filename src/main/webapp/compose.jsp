<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title></title>
  <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0" />
  <link rel="stylesheet" href="css/compose.css">
</head>

<body>
   <main class="container">
     <form>
     <div class="content">
       <section class="icons">
         <button>
           <span class="material-symbols-outlined">attachment</span>
         </button>
         <button formaction="send">
           <span class="material-symbols-outlined">send</span>
         </button>
       </section>
       <input type="text" placeholder="From" value="${fromId}">
       <input type="text" placeholder="To" name="to">
       <input type="text" placeholder="Subject" name="subject">
   <textarea placeholder="Compose email" name="message"></textarea>
     </div>
     </form>
   </main>
</body>

</html>