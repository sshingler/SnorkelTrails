import React, { useEffect } from "react";
import { useLocation } from "react-router-dom";

const BeachContainer = () => {

    const location = useLocation();
    const beach = location.state;

    return (
        <>
        <h1>
            {beach.name}
        </h1>
        </>
    );
};

export default BeachContainer;