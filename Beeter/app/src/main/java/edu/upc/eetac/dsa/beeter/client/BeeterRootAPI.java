package edu.upc.eetac.dsa.beeter.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.upc.eetac.dsa.beeter.client.entity.Sting;


public class BeeterRootAPI {

    private Map<String, Link> links;

    public void setLinks(Map<String, Link> links) {
        this.links = links;
    }

    public BeeterRootAPI() {
        links = new HashMap<String, Link>();
    }
    public Map<String, Link> getLinks() {
        return links;
    }

}