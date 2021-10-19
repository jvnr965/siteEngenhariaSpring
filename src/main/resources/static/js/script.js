function mostrarjanela(){
  document.getElementById('container_janela').style.display = 'block';
}

function fecharjanela(){
  if (event.target.id == 'container_janela') {
    document.getElementById('container_janela').style.display = 'none';
  }
  
}