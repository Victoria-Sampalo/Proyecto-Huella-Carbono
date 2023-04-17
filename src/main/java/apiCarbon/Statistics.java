
package apiCarbon;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "adjustedBytes",
    "energy",
    "co2"
})

public class Statistics implements Serializable
{

    @JsonProperty("adjustedBytes")
    private Double adjustedBytes;
    @JsonProperty("energy")
    private Double energy;
    @JsonProperty("co2")
    private Co2 co2;
    private final static long serialVersionUID = 4125452695274204739L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Statistics() {
    }

    /**
     * 
     * @param co2
     * @param adjustedBytes
     * @param energy
     */
    public Statistics(Double adjustedBytes, Double energy, Co2 co2) {
        super();
        this.adjustedBytes = adjustedBytes;
        this.energy = energy;
        this.co2 = co2;
    }

    @JsonProperty("adjustedBytes")
    public Double getAdjustedBytes() {
        return adjustedBytes;
    }

    @JsonProperty("adjustedBytes")
    public void setAdjustedBytes(Double adjustedBytes) {
        this.adjustedBytes = adjustedBytes;
    }

    @JsonProperty("energy")
    public Double getEnergy() {
        return energy;
    }

    @JsonProperty("energy")
    public void setEnergy(Double energy) {
        this.energy = energy;
    }

    @JsonProperty("co2")
    public Co2 getCo2() {
        return co2;
    }

    @JsonProperty("co2")
    public void setCo2(Co2 co2) {
        this.co2 = co2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Statistics.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("adjustedBytes");
        sb.append('=');
        sb.append(((this.adjustedBytes == null)?"<null>":this.adjustedBytes));
        sb.append(',');
        sb.append("energy");
        sb.append('=');
        sb.append(((this.energy == null)?"<null>":this.energy));
        sb.append(',');
        sb.append("co2");
        sb.append('=');
        sb.append(((this.co2 == null)?"<null>":this.co2));
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
        result = ((result* 31)+((this.adjustedBytes == null)? 0 :this.adjustedBytes.hashCode()));
        result = ((result* 31)+((this.energy == null)? 0 :this.energy.hashCode()));
        result = ((result* 31)+((this.co2 == null)? 0 :this.co2 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Statistics) == false) {
            return false;
        }
        Statistics rhs = ((Statistics) other);
        return ((((this.adjustedBytes == rhs.adjustedBytes)||((this.adjustedBytes!= null)&&this.adjustedBytes.equals(rhs.adjustedBytes)))&&((this.energy == rhs.energy)||((this.energy!= null)&&this.energy.equals(rhs.energy))))&&((this.co2 == rhs.co2)||((this.co2 != null)&&this.co2 .equals(rhs.co2))));
    }

}
