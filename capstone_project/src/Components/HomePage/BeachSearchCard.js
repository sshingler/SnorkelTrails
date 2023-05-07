import React from "react";

const BeachSearchCard = ({beach}) => {





    return(
        <>
            <div className="beach-search-card">
                <div className="beachsearch-border">
                    <div className="beachsearch-front">
                        <p className="beachsearch-location"> {beach.location} </p>
                        <div className="beachsearchcard-image">
                        <img src = {require("../../Images/Beaches/" + beach.image)} alt = {`A picture of a ${beach.name}`} height="280" width="350" style={{ objectFit: "fill" }}></img>
                        </div>
                        <p className="beachsearch-name"> {beach.name}</p>
                        <p className="beachsearch-village"> Nearest village: {beach.nearestVillage}</p>
                    </div>
                </div>
            </div>
        </>
    );
};

export default BeachSearchCard;