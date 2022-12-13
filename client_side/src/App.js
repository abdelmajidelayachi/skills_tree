import './App.css';
import { Route, Routes } from 'react-router-dom';
import Home from './views/Home';
import Login from './views/Login';

function App() {
  return (
    <div className="">
      <Routes>
        <Route path="/" exact element={<Home/>} />
        <Route path="/login" exact element={<Login/>} />
      </Routes>
    </div>
  );
}

export default App;
