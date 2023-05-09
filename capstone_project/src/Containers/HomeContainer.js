import React, { useEffect, useState } from "react";
import '../StyleSheets/HomePage/HomePage.css'
import HomeMap from "../Components/HomePage/HomeMap";
import BeachSearch from "../Components/HomePage/BeachSearch";
import logo from '../Images/logo.png'

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

            <div className="logo-div">
                <img className="logo" src={logo} />
            </div>

        <div className="page-body">
            <div className="search">
                <BeachSearch beaches={beaches}/>
            </div>

            <div className="map">
                <HomeMap beaches={beaches}/>
            </div>
        </div>
        </>
    );
};

export default HomeContainer;