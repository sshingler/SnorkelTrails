import React from "react";
import {Helmet} from "react-helmet";


const BeachTide = () => {

    

    return(
        <>
        <div className="tide-widget">
            <Helmet>
            <script src="https://www.tidetimes.org.uk/mallaig-tide-times.js" type="text/javascript"></script>
            </Helmet>

        </div>
        </>
    );
};

export default BeachTide;