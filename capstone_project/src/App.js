import './App.css';
import './StyleSheets/Constants.css'
import './StyleSheets/HomePage/HomePage.css'

import Footer from './Components/Footer';
import NavBar from './Components/NavBar';
import HomePage from './Components/HomePage/HomePage';

function App() {
  return (
    <>
    <NavBar />
    <HomePage />
    <Footer />
    </>
  );
}

export default App;
