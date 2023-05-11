package com.projektr.tomcatservertest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

@Path("/get-cameras")
public class Cameras {
    @GET
    @Produces("application/json")
    public String hello() throws JAXBException {
        BufferedReader in = null;

        try {
            URL url = new URL("https://b2b.promet-info.hr/dc/b2b.hak.cameras.datex");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String user = "";
            String password = "";
            String auth = user + ":" + password;
            byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(StandardCharsets.UTF_8));
            String authHeaderValue = "Basic " + new String(encodedAuth);
            connection.setRequestProperty("Authorization", authHeaderValue);

            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        } catch (
                Exception err) {
            System.out.println(err);
        }
        JAXBContext jc = JAXBContext.newInstance("com.projektr.tomcatservertest");
        Unmarshaller unmarshaller = jc.createUnmarshaller();

        Object schemaObject = JAXBIntrospector.getValue(unmarshaller.unmarshal(in));
        D2LogicalModel d2lm = (D2LogicalModel) schemaObject;

        PredefinedLocationsPublication plp = (PredefinedLocationsPublication) d2lm.getPayloadPublication();
        List<PredefinedLocationContainer> plcList = plp.getPredefinedLocationContainer();

        //String a = "";

        int id = -1;
        String imeStanice = "";
        String linkSlike = "";
        float geoSirina = -1;
        float geoDuzina = -1;

        JSONObject featureCollection = new JSONObject();
        //featureCollection.put("type", "FeatureCollection");
        //featureCollection.put("name", "cameraList");
        JSONObject propertiesCrs = new JSONObject();
        propertiesCrs.put("name", "urn:ogc:def:crs:OGC:1.3:CRS84");
        JSONObject crs = new JSONObject();
        crs.put("type", "name");
        crs.put("properties", propertiesCrs);
        featureCollection.put("crs", crs);

        JSONArray features = new JSONArray();

        //featureCollection.put("features", features);

        for (PredefinedLocationContainer plc : plcList) {
            TrafficCameraRecord trc = plc.getPredefinedLocationContainerExtension().getTrafficCameraRecord();
            PredefinedLocation pl = (PredefinedLocation) plc;
            Point point = (Point) pl.getLocation();

            for (MultilingualStringValue msv : trc.getCameraTitle().getValues().getValue()) {
                /* a += (
                        "ID: " + trc.getCameraId() +
                                " " + msv.getValue()
                ); */
                id = Integer.parseInt(trc.getCameraId());
                imeStanice = msv.getValue();
            }
            /*a += (
                    " ImageUrl: " + trc.getStillImageUrl()
                            + " " + point.getLocationForDisplay().getLatitude()
                            + " " + +point.getLocationForDisplay().getLongitude()
                            + "\n"
            ); */
            linkSlike = trc.getStillImageUrl();
            geoSirina = point.getLocationForDisplay().getLatitude();
            geoDuzina = point.getLocationForDisplay().getLongitude();
            JSONObject feature = new JSONObject();
            feature.put("type", "Feature");

            JSONObject properties = new JSONObject();
            properties.put("ID", id);
            properties.put("ime", imeStanice);
            properties.put("imgLink", linkSlike);
            feature.put("properties", properties);

            JSONObject geometry = new JSONObject();
            geometry.put("type", "Point");
            JSONArray coordinates = new JSONArray();
            coordinates.put(geoDuzina);
            coordinates.put(geoSirina);
            geometry.put("coordinates", coordinates);
            feature.put("geometry", geometry);

            features.put(feature);
        }
        featureCollection.put("type", "FeatureCollection");
        featureCollection.put("name", "cameraList");
        featureCollection.put("features", features);
        return featureCollection.toString();
    }
}
