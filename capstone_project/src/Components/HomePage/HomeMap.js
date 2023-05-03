import React from "react";
import { MapContainer, TileLayer, useMap, Marker, Popup } from "react-leaflet";

import '../../StyleSheets/HomePage/HomeMap.css'
import 'leaflet/dist/leaflet.css'
import { Icon } from "leaflet";
import MarkerClusterGroup from "react-leaflet-cluster";

const HomeMap = () => {

    const customIcon = new Icon({
        iconUrl: require("../../Images/MapIcons/redIcon.png"),
        iconSize: [38, 38]
    })


    return (
        <>
            <div id="map">
                <MapContainer center={[56.9722529,-4.4786009]} zoom={7}>
                    <TileLayer 
                        attribution= '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a>contributors'
                        url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
                    />
                    <MarkerClusterGroup>
                        <Marker position={[55.547933,-5.0958]} icon={customIcon}>
                            <Popup>
                                Arran - Clauchlands Farm <br />
                                <a href="/sealife">sealife</a>
                            </Popup>
                        </Marker>

                        <Marker position={[55.536425,-5.123452]} icon={customIcon}>
                            <Popup>
                                Arran - Lamlash <br />
                                <a href="/sealife">sealife</a>
                            </Popup>
                        </Marker>

                        <Marker position={[55.489476,-5.095962]} icon={customIcon}>
                            <Popup>
                                Arran - Whiting Bay <br />
                                <a href="/sealife">sealife</a>
                            </Popup>
                        </Marker>

                        <Marker position={[55.441853,-5.130202]} icon={customIcon}>
                            <Popup>
                                Arran - Kildonan <br />
                                <a href="/sealife">sealife</a>
                            </Popup>
                        </Marker>
                        </MarkerClusterGroup>
                </MapContainer>
            </div>

        </>
    );
};

export default HomeMap;