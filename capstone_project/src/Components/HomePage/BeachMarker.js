import { Icon } from "leaflet";
import React from "react";
import { MapContainer, TileLayer, useMap, Marker, Popup } from "react-leaflet";

const BeachMarker = ({ beach }) => {

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
                    <a href="/sealife">sealife</a>
                </Popup>
            </Marker>
        </>
    );
};

export default BeachMarker;