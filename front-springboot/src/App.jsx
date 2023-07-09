import { useState, useEffect } from 'react'

function App() {

  const [usuarios, setUsuarios] = useState([])

  useEffect(() => {
    fetch('http://localhost:8080/usuarios')
      .then(response => response.json())
      .then(data => setUsuarios(data))
  }, [])

  return (
    <>
      <h1>App</h1>
      {
        usuarios &&
        usuarios.map(usuario => (
          <div key={Math.random()}>
            <p>{usuario.nombre}</p>
            <p>{usuario.email}</p>
          </div>
        ))
      }
    </>
  )
}

export default App
