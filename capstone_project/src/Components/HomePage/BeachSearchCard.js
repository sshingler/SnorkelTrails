import React from "react";
import '../../StyleSheets/HomePage/BeachSearchCard.css';
import { Link } from "react-router-dom";
import BeachAmenities from "../BeachPage/BeachAmenities";


const BeachSearchCard = ({beach}) => {





    return(
        <>
            
            <div className="beach-search-card">
                <div className="beachsearch-border">
                    <div className="beachsearch-front">
                        <p className="beachsearch-location"> {beach.location} </p>
                        <div className="beachsearchcard-image">
                        <img src = {require("../../Images/Beaches/" + beach.beach_image)} alt = {`A picture of a ${beach.name}`} height="280" width="350" style={{ objectFit: "fill" }}></img>
                        </div>
                        <div className="beachsearch-name">
                        <Link  to='/BeachContainer' state={beach} > {beach.name} </Link>
                        </div>
                        <p className="beachsearch-village"> Nearest village: {beach.nearestVillage}</p>
                        <div className="beachsearch-amenities">
                        <BeachAmenities beachAmenities={beach.amenities}/>
                        </div>
                    </div>
                </div>
            </div>
           
        </>
    );
};

export default BeachSearchCard;