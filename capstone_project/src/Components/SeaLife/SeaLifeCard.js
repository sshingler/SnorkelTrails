import React from "react";

import '../../StyleSheets/SeaLife/SeaLife.css'

const SeaLifeCard = ({ creature }) => {


    console.log(creature.img);


    return (
        <>
            <div className="sea-life-card">
                <div className="card-border">
                    <div className="card-front">
                        <div className="card-image">
                        <img src = {require("../../Images/Creatures/" + creature.img)} alt = {`A picture of a ${creature.name}`} height="280" width="350" style={{ objectFit: "fill" }}></img>
                        </div>
                        <p className="creature-name"> {creature.name}</p>
                        <p className="creature-type"> {creature.type} - {creature.size} </p>
                        <p className="creature-habitat"> {creature.habitat}</p>
                        <p className="creature-notes"> {creature.notes}</p>
                    </div>
                </div>
            </div>
        </>
    );
};

export default SeaLifeCard;