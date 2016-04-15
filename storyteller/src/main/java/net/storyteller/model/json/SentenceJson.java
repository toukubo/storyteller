package net.storyteller.model.json;

/**
 * Created by ITRex-User on 4/14/2016.
 */
public class SentenceJson {

    private String name;

    private NounJson noun;

    private VerbJson verb;

    public SentenceJson(String name, NounJson noun, VerbJson verb) {
        this.name = name;
        this.noun = noun;
        this.verb = verb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NounJson getNoun() {
        return noun;
    }

    public void setNoun(NounJson noun) {
        this.noun = noun;
    }

    public VerbJson getVerb() {
        return verb;
    }

    public void setVerb(VerbJson verb) {
        this.verb = verb;
    }
}
