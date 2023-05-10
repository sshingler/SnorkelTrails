import React from "react";
import '../StyleSheets/Footer.css'

const Footer = () => {



return (
    <div className="footer-wrapper">
        <div className="wildlifelink">
        <a href="https://www.wildlifetrusts.org//" target="_blank"> The Wildlife Trusts </a>
        </div>
        <div className="snorkeltrails">
            <p> &copy;SnorkelTrails 2023</p>
        </div>
        <div className="oceanlink">
            <a href="https://theoceancleanup.com/" target="_blank"> The Ocean Clean Up </a>
        </div>
    </div>
);

};

export default Footer;