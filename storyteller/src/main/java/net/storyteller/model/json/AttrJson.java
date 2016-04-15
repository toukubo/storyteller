package net.storyteller.model.json;

/**
 * Created by ITRex-User on 4/14/2016.
 */
public class AttrJson {

    private String name;
    private String type;

    public AttrJson(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
