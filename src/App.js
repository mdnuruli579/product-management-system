import logo from './logo.svg';
import './App.css';
import Navbar from './component/Navbar'; 
import { Route, Routes } from 'react-router-dom';
import AddProduct from './component/AddProduct';
import EditProduct from './component/EditProduct';
import Home from './component/Home';
function App() {
  return (
    <>
    <Navbar/>
    <Routes>
      <Route path='/' element={<Home/>}></Route>
      <Route path='/add' element={<AddProduct/>}></Route>
      <Route path='/edit/:id' element={<EditProduct/>}></Route>
    </Routes>
    </>
  );
}

export default App;
