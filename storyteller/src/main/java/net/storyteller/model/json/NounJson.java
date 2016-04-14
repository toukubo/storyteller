package net.storyteller.model.json;

import java.util.List;

/**
 * Created by ITRex-User on 4/14/2016.
 */
public class NounJson {

    private String name;

    private List<AttrJson> attr;

    public NounJson(String name, List<AttrJson> attr) {
        this.name = name;
        this.attr = attr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AttrJson> getAttr() {
        return attr;
    }

    public void setAttr(List<AttrJson> attr) {
        this.attr = attr;
    }
}
