import './App.css';
import './StyleSheets/Constants.css'
import './StyleSheets/HomePage/HomePage.css'

import Footer from './Components/Footer';
import NavBar from './Components/NavBar';
import ContactContainer from './Containers/ContactContainer';
import BeachEtiquetteContainer from './Containers/BeachEtiquetteContainer';
import BeachContainer from './Containers/BeachContainer';

import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import HomeContainer from './Containers/HomeContainer';
import SeaLifeContainer from './Containers/SeaLifeContainer';

function App() {

 
  return (
    <>

    <Router>
    <NavBar />
    <Routes>
      <Route path="/" element={<HomeContainer/>}/>
      <Route path="/Sealife" element={<SeaLifeContainer/>}/>
      <Route path ="/Contact" element={<ContactContainer/>}/>
      <Route path ="/BeachEtiquette" element={<BeachEtiquetteContainer/>}/>
      <Route path ="/BeachContainer" element={<BeachContainer/>}/>
    </Routes>

  

    <Footer />
    
    </Router>
    </>
  );
}

export default App;
