import React from "react";
import {Link} from "react-router-dom";
import '../StyleSheets/NavBar.css'

const NavBar = () => {


return (
    <div className="navbar-wrapper">
        <div>
            <ul className="navbar-links no-decoration">
            <li>
                <Link to="/">Home</Link>
            </li>
            <li>
                <Link to="/sealife">Sea Life</Link>
            </li>
            <li>
                <Link to="/beachetiquette">Beach Etiquette</Link>
            </li>
            <li>
                <Link to="/contact">Contact</Link>
            </li>
            </ul>
        </div>


    </div>
);

}

export default NavBar;