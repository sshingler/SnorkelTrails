import React, { useEffect, useState } from "react";
import '../StyleSheets/HomePage/HomePage.css'
import HomeMap from "../Components/HomePage/HomeMap";
import BeachSearch from "../Components/HomePage/BeachSearch";

const HomeContainer = () => {

    const [beaches, setBeaches] = useState([])

    async function fetchBeaches() {
        const res = await fetch('http://localhost:8080/beaches');
        const beaches = await res.json();
        setBeaches(beaches);
    }

    useEffect(() => {
        fetchBeaches();
    }, [])

    if (!beaches.length){
        return "Loading"
    }


    return (
        <>
        <div className="banner">
            <h2>SnorkelTrails</h2>
        </div>
        <BeachSearch beaches={beaches}/>
        <br></br>
        <br></br>
        <HomeMap beaches={beaches}/>
        <br></br>
        <br></br>
        <br></br>
        

        </>
    );
};

export default HomeContainer;