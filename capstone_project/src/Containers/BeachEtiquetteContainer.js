import React from "react";
import '../StyleSheets/BeachEtiquettePage/BeachEtiquetteContainer.css';
import BeforeYouGo from "../Images/Backgrounds/BeforeYouGo.png";
import AtTheBeach from "../Images/Backgrounds/AtTheBeach.png";
import InTheWater from "../Images/Backgrounds/InTheWater.png";
import Warning from "../Images/Backgrounds/Warning.png";
import RiskStatement from "../Images/Backgrounds/RiskStatement.png";


const BeachEtiquetteContainer = () => {



    return (
        <>
            <div className="beach-etiquette-container">
                <br/>
                <div className ="beach-etiquette-container-title">
                    <h1> Be a safe and responsible snorkeler!</h1>
                    <br/>
                    <br/>
                    <img src={BeforeYouGo} alt="Before you go information"/>
                    <br/>
                    <br/>
                    <img src={AtTheBeach} alt="At the beach information"/>
                    <br/>
                    <br/>
                    <img src={InTheWater} alt="In the water information"/>
                    <br/>
                    <br/>
                    <img src={Warning} alt="Warning information"/>
                </div>
                <br/>
                <br/>
                <br/>
            </div>
        </>
    );
};

export default BeachEtiquetteContainer;