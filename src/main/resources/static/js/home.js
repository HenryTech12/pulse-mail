

let navBar = document.querySelector('.navbar');
let openBtn = document.getElementById('open');
let closeBtn = document.getElementById('close');
function closeBar(event) {
  event.preventDefault();
   navBar.classList.add('remove');
   navBar.classList.remove('animate');
   setTimeout(() => {
     navBar.style.display = 'none';
   }, 500);
}

function openBar(event) {
  event.preventDefault();
  console.log('clicked')
  navBar.style.display = 'block';
  navBar.classList.add('animate');
  navBar.classList.remove('remove');
}

openBtn.addEventListener('click', openBar);
closeBtn.addEventListener('click',closeBar);