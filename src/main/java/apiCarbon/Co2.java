
package apiCarbon;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
    "grid",
    "renewable"
})

public class Co2 implements Serializable
{

    @JsonProperty("grid")
    private Grid grid;
    @JsonProperty("renewable")
    private Renewable renewable;
    private final static long serialVersionUID = 4712639716511267826L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Co2() {
    }

    /**
     * 
     * @param grid
     * @param renewable
     */
    public Co2(Grid grid, Renewable renewable) {
        super();
        this.grid = grid;
        this.renewable = renewable;
    }

    @JsonProperty("grid")
    public Grid getGrid() {
        return grid;
    }

    @JsonProperty("grid")
    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    @JsonProperty("renewable")
    public Renewable getRenewable() {
        return renewable;
    }

    @JsonProperty("renewable")
    public void setRenewable(Renewable renewable) {
        this.renewable = renewable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Co2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("grid");
        sb.append('=');
        sb.append(((this.grid == null)?"<null>":this.grid));
        sb.append(',');
        sb.append("renewable");
        sb.append('=');
        sb.append(((this.renewable == null)?"<null>":this.renewable));
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
        result = ((result* 31)+((this.grid == null)? 0 :this.grid.hashCode()));
        result = ((result* 31)+((this.renewable == null)? 0 :this.renewable.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Co2) == false) {
            return false;
        }
        Co2 rhs = ((Co2) other);
        return (((this.grid == rhs.grid)||((this.grid!= null)&&this.grid.equals(rhs.grid)))&&((this.renewable == rhs.renewable)||((this.renewable!= null)&&this.renewable.equals(rhs.renewable))));
    }

}
