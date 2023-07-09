
function App() {

  fetch('http://localhost:8080/usuario/1234')
    .then(response => response.json())
    .then(data => console.log(data))

  return (
    <>
      <h1>App</h1>
    </>
  )
}

export default App
