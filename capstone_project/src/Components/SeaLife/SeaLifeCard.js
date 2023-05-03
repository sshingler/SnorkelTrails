import React from "react";

import '../../StyleSheets/SeaLife/SeaLife.css'

const SeaLifeCard = ({ creature }) => {


    console.log(creature.img);


    return (
        <>
            <div className="sea-life-card">
                <p> Type: '{creature.type}' </p>
                <p> Name: {creature.name}</p>
                <img className="img-size" src = {require("../../Images/Creatures/" + creature.img)} alt = {`A picture of a ${creature.name}`}></img>
                <p> Size: {creature.size}</p>
                <p> Habitat: {creature.habitat}</p>
                <p> Notes: {creature.notes}</p>
            </div>
        </>
    );
};

export default SeaLifeCard;