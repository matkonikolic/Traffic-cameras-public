async function getStanice() {

    const response = await fetch('https://d2projektr.azurewebsites.net/api/get-cameras');
    const json_Stanice_1 = await response.json();

    var highlightLayer;
    function highlightFeature(e) {
        highlightLayer = e.target;

        if (e.target.feature.geometry.type === 'LineString') {
            highlightLayer.setStyle({
                color: '#ffff00',
            });
        } else {
            highlightLayer.setStyle({
                fillColor: '#ffff00',
                fillOpacity: 1
            });
        }
    }
    var map = L.map('map', {
        zoomControl: true, maxZoom: 28, minZoom: 1
    }).fitBounds([[43.45277591727928, 12.957972144277901], [46.594682384391525, 19.367151609818865]]);
    var hash = new L.Hash(map);
    map.attributionControl.setPrefix('<a href="https://github.com/tomchadwin/qgis2web" target="_blank">qgis2web</a> &middot; <a href="https://leafletjs.com" title="A JS library for interactive maps">Leaflet</a> &middot; <a href="https://qgis.org">QGIS</a>');
    var autolinker = new Autolinker({ truncate: { length: 30, location: 'smart' } });
    var bounds_group = new L.featureGroup([]);
    function setBounds() {
    }
    map.createPane('pane_OpenStreetMap_0');
    map.getPane('pane_OpenStreetMap_0').style.zIndex = 400;
    var layer_OpenStreetMap_0 = L.tileLayer('https://tile.openstreetmap.org/{z}/{x}/{y}.png', {
        pane: 'pane_OpenStreetMap_0',
        opacity: 1.0,
        attribution: '',
        minZoom: 1,
        maxZoom: 28,
        minNativeZoom: 0,
        maxNativeZoom: 19
    });
    layer_OpenStreetMap_0;
    map.addLayer(layer_OpenStreetMap_0);
    function pop_Stanice_1(feature, layer) {
        layer.on({
            /*mouseout: function (e) {
                for (i in e.target._eventParents) {
                    e.target._eventParents[i].resetStyle(e.target);
                }
            },*/ 
            mouseover: highlightFeature,
        });
        var popupContent = '<table>\
            <tr>\
                <th scope="row">ID</th>\
                <td>' + (feature.properties['ID'] !== null ? autolinker.link(feature.properties['ID'].toLocaleString()) : '') + '</td>\
            </tr>\
            <tr>\
                <td colspan="2"><strong>Ime stanice</strong><br />' + (feature.properties['ime'] !== null ? autolinker.link(feature.properties['ime'].toLocaleString()) : '') + '</td>\
            </tr>\
            <tr>\
                <th scope="row">slika:</th>\
            </tr>\
            <tr>\
                <img width = "300" src=' + feature.properties['imgLink'] + '>\
            </tr>\
        </table>';
        layer.bindPopup(popupContent, { maxHeight: 700 });
    }

    function style_Stanice_1_0() {
        return {
            pane: 'pane_Stanice_1',
            radius: 4.0,
            opacity: 1,
            color: 'rgba(35,35,35,1.0)',
            dashArray: '',
            lineCap: 'butt',
            lineJoin: 'miter',
            weight: 1,
            fill: true,
            fillOpacity: 1,
            fillColor: 'rgba(217,220,53,1.0)',
            interactive: true,
        }
    }
    map.createPane('pane_Stanice_1');
    map.getPane('pane_Stanice_1').style.zIndex = 401;
    map.getPane('pane_Stanice_1').style['mix-blend-mode'] = 'normal';
    var layer_Stanice_1 = new L.geoJson(json_Stanice_1, {
        attribution: '',
        interactive: true,
        dataVar: 'json_Stanice_1',
        layerName: 'layer_Stanice_1',
        pane: 'pane_Stanice_1',
        onEachFeature: pop_Stanice_1,
        pointToLayer: function (feature, latlng) {
            var context = {
                feature: feature,
                variables: {}
            };
            return L.circleMarker(latlng, style_Stanice_1_0(feature));
        },
    });
    var cluster_Stanice_1 = new L.MarkerClusterGroup({
        showCoverageOnHover: false,
        spiderfyDistanceMultiplier: 2
    });
    cluster_Stanice_1.addLayer(layer_Stanice_1);

    bounds_group.addLayer(layer_Stanice_1);
    cluster_Stanice_1.addTo(map);
    setBounds();
}
getStanice();