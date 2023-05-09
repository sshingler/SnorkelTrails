import React from "react";
import '../../StyleSheets/HomePage/BeachSearchCard.css';
import { Link } from "react-router-dom";
import BeachAmenities from "../BeachPage/BeachAmenities";


const BeachSearchCard = ({beach}) => {





    return(
        <>
            <Link  to='/BeachContainer' state={beach} >
            <div className="beach-search-card">
                <div className="beachsearch-border">
                    <div className="beachsearch-front">
                        <div className="beachsearchcard-image">
                        <img src = {require("../../Images/Beaches/" + beach.beach_image)} alt = {`A picture of a ${beach.name}`} height="200" width="300" style={{ objectFit: "fill" }}></img>
                        </div>
                        <p className="beachsearch-location"> {beach.location} </p>
                        <div className="beachsearch-name">
                        {beach.name} 
                        </div>
                        <div className="beachsearch-amenities">
                        <BeachAmenities beachAmenities={beach.amenities}/>
                        </div>
                    </div>
                </div>
            </div>
            </Link>
           
        </>
    );
};

export default BeachSearchCard;