<%@page import="java.util.*, jakarta.mail.*, jakarta.mail.search.FlagTerm, jakarta.mail.internet.* " %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=Edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <title>HTML</title>
  
  <!-- HTML -->
  

  <!-- Custom Styles -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
  <link rel="stylesheet" href="css/style.css">
</head>

<body>
  <!-- Project -->
  <main class="container">
    <div class="header">
      <section class="hc">
        <button class="menu-btn" onclick="openN()">
          <div class="menu-icon"></div>
        </button>
        <input type="text" placeholder="Search Mail">
      </section>
    </div>
    
    <div class="navbar" id="navbar">
       <ol>
         <section>
           <header><h1>MailBox</h1></header>
           <button onclick="closeN()" class="cls"><span class="material-symbols-outlined">close</span>
           </button>
         </section>
         <form>
         <li>
           <button formaction="inbox">
              <span class="material-symbols-outlined">inbox</span> 
            <span>Inbox</span>
           </button>
        </li>
         <li>
           <button>
              <span class="material-symbols-outlined">outbox</span>
              <span>Outbox</span>
           </button>
         </li>
         <li>
           <button formaction="compose">
             <span class="material-symbols-outlined">edit_note</span>
             <span>Compose</span>
           </button>
         </li>
         <li>
           <button>
             <span class="material-symbols-outlined">recycling</span>
             <span>Recycle</span>
           </button>
         </li>
         <li>
           <button>
             <span class="material-symbols-outlined">settings</span>
             <span>Settings</span>
           </button>
         </li>
         </form>
       </ol>
    </div>
    
    <div class="content">
      <span>${hdr}</span>
        
      <% List<Message> list = (List) request.getAttribute("list"); %>
      <% if(list != null) { %>
         <% for(int i = 0; i < list.size(); i++) { %>
             <button>
               <span><%= list.get(i).getSubject() %></span>
                <span> <%= list.get(i).getReceivedDate() %> </span>
             </button>
           <% } %>
       <% } %>           
       <button>
    </div>
  </main>
  <script src="js/main.js"></script>
</body>
</html>