
package apiCarbon;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "grams",
    "litres"
})

public class Renewable implements Serializable
{

    @JsonProperty("grams")
    private Double grams;
    @JsonProperty("litres")
    private Double litres;
    private final static long serialVersionUID = 1051393644885853994L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Renewable() {
    }

    /**
     * 
     * @param litres
     * @param grams
     */
    public Renewable(Double grams, Double litres) {
        super();
        this.grams = grams;
        this.litres = litres;
    }

    @JsonProperty("grams")
    public Double getGrams() {
        return grams;
    }

    @JsonProperty("grams")
    public void setGrams(Double grams) {
        this.grams = grams;
    }

    @JsonProperty("litres")
    public Double getLitres() {
        return litres;
    }

    @JsonProperty("litres")
    public void setLitres(Double litres) {
        this.litres = litres;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Renewable.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("grams");
        sb.append('=');
        sb.append(((this.grams == null)?"<null>":this.grams));
        sb.append(',');
        sb.append("litres");
        sb.append('=');
        sb.append(((this.litres == null)?"<null>":this.litres));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.grams == null)? 0 :this.grams.hashCode()));
        result = ((result* 31)+((this.litres == null)? 0 :this.litres.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Renewable) == false) {
            return false;
        }
        Renewable rhs = ((Renewable) other);
        return (((this.grams == rhs.grams)||((this.grams!= null)&&this.grams.equals(rhs.grams)))&&((this.litres == rhs.litres)||((this.litres!= null)&&this.litres.equals(rhs.litres))));
    }

}
