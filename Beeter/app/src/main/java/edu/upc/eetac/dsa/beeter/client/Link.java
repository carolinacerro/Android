package edu.upc.eetac.dsa.beeter.client;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Carolina on 11/11/15.
 */
public class Link {
    private URI uri;
    private String rel;
    private List<String> rels;
    private String title;
    private String type;

    private String target;
    private Map<String, String> parameters;
    public Link() {
        parameters = new HashMap<String, String>();
    }
    public String getTarget() {
        return target;
    }
    public void setTarget(String target) {
        this.target = target;
    }
    public Map<String, String> getParameters() {
        return parameters;
    }
}
