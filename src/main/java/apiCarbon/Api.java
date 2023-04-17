
package apiCarbon;

import java.io.Serializable;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "url",
    "green",
    "bytes",
    "cleanerThan",
    "statistics"
})
@Generated("jsonschema2pojo")
public class Api implements Serializable
{

    @JsonProperty("url")
    private String url;
    @JsonProperty("green")
    private Boolean green;
    @JsonProperty("bytes")
    private Integer bytes;
    @JsonProperty("cleanerThan")
    private Double cleanerThan;
    @JsonProperty("statistics")
    private Statistics statistics;
    private final static long serialVersionUID = 520583007133543074L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Api() {
    }

    /**
     * 
     * @param green
     * @param cleanerThan
     * @param bytes
     * @param url
     * @param statistics
     */
    public Api(String url, Boolean green, Integer bytes, Double cleanerThan, Statistics statistics) {
        super();
        this.url = url;
        this.green = green;
        this.bytes = bytes;
        this.cleanerThan = cleanerThan;
        this.statistics = statistics;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("green")
    public Boolean getGreen() {
        return green;
    }

    @JsonProperty("green")
    public void setGreen(Boolean green) {
        this.green = green;
    }

    @JsonProperty("bytes")
    public Integer getBytes() {
        return bytes;
    }

    @JsonProperty("bytes")
    public void setBytes(Integer bytes) {
        this.bytes = bytes;
    }

    @JsonProperty("cleanerThan")
    public Double getCleanerThan() {
        return cleanerThan;
    }

    @JsonProperty("cleanerThan")
    public void setCleanerThan(Double cleanerThan) {
        this.cleanerThan = cleanerThan;
    }

    @JsonProperty("statistics")
    public Statistics getStatistics() {
        return statistics;
    }

    @JsonProperty("statistics")
    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Api.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("green");
        sb.append('=');
        sb.append(((this.green == null)?"<null>":this.green));
        sb.append(',');
        sb.append("bytes");
        sb.append('=');
        sb.append(((this.bytes == null)?"<null>":this.bytes));
        sb.append(',');
        sb.append("cleanerThan");
        sb.append('=');
        sb.append(((this.cleanerThan == null)?"<null>":this.cleanerThan));
        sb.append(',');
        sb.append("statistics");
        sb.append('=');
        sb.append(((this.statistics == null)?"<null>":this.statistics));
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
        result = ((result* 31)+((this.green == null)? 0 :this.green.hashCode()));
        result = ((result* 31)+((this.cleanerThan == null)? 0 :this.cleanerThan.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.bytes == null)? 0 :this.bytes.hashCode()));
        result = ((result* 31)+((this.statistics == null)? 0 :this.statistics.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Api) == false) {
            return false;
        }
        Api rhs = ((Api) other);
        return ((((((this.green == rhs.green)||((this.green!= null)&&this.green.equals(rhs.green)))&&((this.cleanerThan == rhs.cleanerThan)||((this.cleanerThan!= null)&&this.cleanerThan.equals(rhs.cleanerThan))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.bytes == rhs.bytes)||((this.bytes!= null)&&this.bytes.equals(rhs.bytes))))&&((this.statistics == rhs.statistics)||((this.statistics!= null)&&this.statistics.equals(rhs.statistics))));
    }

}
