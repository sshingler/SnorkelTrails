import React from "react";
import {Link} from "react-router-dom";
import '../StyleSheets/NavBar.css'

const NavBar = () => {


return (
    <div className="navbar-wrapper">
        <div className="inner-wrapper">
            <ul className="navbar-links no-decoration">
            <li className="link">
                <Link to="/">Home </Link>
                
            </li>
            <li className="link">
                <Link to="/sealife">Sea Life</Link>
            </li>
            <li className="link">
                <Link to="/beachetiquette">Beach Etiquette</Link>
            </li>
            <li className="link">
                <Link to="/contact">Contact</Link>
            </li>
            </ul>
        </div>


    </div>
);

}

export default NavBar;