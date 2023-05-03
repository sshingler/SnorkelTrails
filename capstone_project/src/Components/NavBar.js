import React from "react";
import {Link} from "react-router-dom";
import '../StyleSheets/NavBar.css'

const NavBar = () => {


return (
    <div className="navbar-wrapper">
        <ul>
      <li>
        <Link to="/">Home</Link>
      </li>
      <li>
        <Link to="/sealife">Sea Life</Link>
      </li>
    </ul>


    </div>
);

}

export default NavBar;