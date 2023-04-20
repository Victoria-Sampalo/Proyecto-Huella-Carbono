
package apiCarbon;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "url",
    "green",
    "bytes",
    "cleanerThan",
    "statistics",
    "timestamp"
})

public class Api {

    @JsonProperty("url")
    private String url;
    @JsonProperty("green")
    private String green;
    @JsonProperty("bytes")
    private Integer bytes;
    @JsonProperty("cleanerThan")
    private Double cleanerThan;
    @JsonProperty("statistics")
    private Statistics statistics;
    @JsonProperty("timestamp")
    private Integer timestamp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

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
     * @param timestamp
     */
    public Api(String url, String green, Integer bytes, Double cleanerThan, Statistics statistics, Integer timestamp) {
        super();
        this.url = url;
        this.green = green;
        this.bytes = bytes;
        this.cleanerThan = cleanerThan;
        this.statistics = statistics;
        this.timestamp = timestamp;
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
    public String getGreen() {
        return green;
    }

    @JsonProperty("green")
    public void setGreen(String green) {
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

    @JsonProperty("timestamp")
    public Integer getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
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
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.bytes == null)? 0 :this.bytes.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.statistics == null)? 0 :this.statistics.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
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
        return ((((((((this.green == rhs.green)||((this.green!= null)&&this.green.equals(rhs.green)))&&((this.cleanerThan == rhs.cleanerThan)||((this.cleanerThan!= null)&&this.cleanerThan.equals(rhs.cleanerThan))))&&((this.bytes == rhs.bytes)||((this.bytes!= null)&&this.bytes.equals(rhs.bytes))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.statistics == rhs.statistics)||((this.statistics!= null)&&this.statistics.equals(rhs.statistics))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
