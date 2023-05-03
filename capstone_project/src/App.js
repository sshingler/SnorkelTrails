import './App.css';
import './StyleSheets/Constants.css'
import './StyleSheets/HomePage/HomePage.css'

import Footer from './Components/Footer';
import NavBar from './Components/NavBar';
import HomePage from './Components/HomePage/HomePage';
import SeaLifePage from './Components/SeaLife/SeaLifePage';
import SeaLife from './Containers/SeaLife';
import ContactPage from './Components/ContactPage/ContactPage';
import BeachEtiquettePage from './Components/BeachEtiquettePage/EtiquettePage';

import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';

function App() {

 
  return (
    <>

    <Router>
    <NavBar />
    <Routes>
      <Route path="/" element={<HomePage/>}/>
      <Route path="/Sealife" element={<SeaLifePage/>}/>
      <Route path ="/Contact" element={<ContactPage/>}/>
      <Route path ="/BeachEtiquette" element={<BeachEtiquettePage/>}/>
    </Routes>

  

    <Footer />
    
    </Router>
    </>
  );
}

export default App;
