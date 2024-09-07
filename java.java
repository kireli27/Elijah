function changeTheme() {
  const body = document.querySelector('body');
  const currentTheme = body.classList.value;

  if (currentTheme === 'theme1') {
    body.classList.remove('theme1');
    body.classList.add('theme2');
  } else if (currentTheme === 'theme2') {
    body.classList.remove('theme2');
    body.classList.add('theme1');
  } else {
    body.classList.add('theme1');
  }
}