import './App.css';
import Navbar from './Navbar';
import Database from "./pages/Database"
import About from './pages/About';
import Home from './pages/Home';
import Login from './pages/Login';
import { Route, Routes } from 'react-router-dom';
import { Component } from 'react';


class App extends Component {
    render() {
      return (
      <div className="App">
        <Navbar />
        
        {/* <Database /> */}
          <div className="container1">
            <Routes>
              <Route path="/" element={<Home />} />
              <Route path="/login" element={<Login />} />
              <Route path="/database" element={<Database />} />
              <Route path="/about" element={<About />} />
            </Routes>
          </div>
      </div>
      );
    }
      
}

export default App;