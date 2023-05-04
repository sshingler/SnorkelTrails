import { Icon } from "leaflet";
import React, { useEffect, useState } from "react";
import { MapContainer, TileLayer, useMap, Marker, Popup } from "react-leaflet";
import { Link } from "react-router-dom";

const BeachMarker = ({ beach }) => {

    const [selectedBeach, setSelectedBeach] = useState();

    useEffect(() => {
        setSelectedBeach(beach);
    }, [])

    const customIcon = new Icon({
        iconUrl: require("../../Images/MapIcons/redIcon.png"),
        iconSize: [38, 38]
    })

    const beachLong = beach.longLat.split(",")

    return(
        <>
            <Marker position={[beachLong[0], beachLong[1]]} icon={customIcon}>
                <Popup >
                    {beach.name} <br />
                    <ul>
                        <li>
                            <Link to='/BeachContainer' state={beach} > {beach.name} </Link>
                        </li>
                    </ul>
                </Popup>
            </Marker>
        </>
    );
};

export default BeachMarker;