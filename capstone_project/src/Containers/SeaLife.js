import React, { useEffect, useState } from "react";

import '../StyleSheets/SeaLife/SeaLifePage.css'
import '../StyleSheets/Constants.css'
import SeaLifeCard from "../Components/SeaLife/SeaLifeCard";

const SeaLife = () => {
    const [seaLife, setSeaLife] = useState([]);

    async function fetchSeaLife() {
        const res = await fetch('http://localhost:8080/creatures');
        const seaLife = await res.json();
        setSeaLife(seaLife);
    }

    useEffect(() => {
        fetchSeaLife();
    }, [])

    if (!seaLife.length){
        return "Loading";
    }

    const entityNodes = seaLife.map((animal) => {
        return <SeaLifeCard key = {animal.id} creature = {animal} />
    });

    return (
        <>
        <div className="container">
            {entityNodes}
        </div>
        </>
    );
};

export default SeaLife;