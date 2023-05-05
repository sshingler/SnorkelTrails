import React from "react";
import { MapContainer, TileLayer, useMap, Marker, Popup } from "react-leaflet";

import '../../StyleSheets/HomePage/HomeMap.css'
import 'leaflet/dist/leaflet.css'
import { Icon } from "leaflet";
import MarkerClusterGroup from "react-leaflet-cluster";

import BeachMarker from "./BeachMarker";

const HomeMap = ({ beaches }) => {

    const customIcon = new Icon({
        iconUrl: require("../../Images/MapIcons/redIcon.png"),
        iconSize: [38, 38]
    })

    const beachNodes = beaches.map((beach) => {
        return <BeachMarker key={beach.id} beach = {beach}/>
    })

    return (
        <>
            <div id="map" >
                <MapContainer center={[56.9722529,-4.4786009]} zoom={7}>
                    <TileLayer 
                        attribution= '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a>contributors'
                        url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
                    />
                    <MarkerClusterGroup>
                        {beachNodes}
                    </MarkerClusterGroup>
                </MapContainer>
            </div>

        </>
    );
};

export default HomeMap;