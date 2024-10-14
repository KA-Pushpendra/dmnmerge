package indigo.in;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GST6E {

    // @DataField(pos = 1, columnName = "State")
    private String state;
    // @DataField(pos = 2, columnName = "Place of Embarkation")
    private String placeOfEmbarkation;
    // @DataField(pos = 3, columnName = "State code")
    private String stateCode;
    // @DataField(pos = 4, columnName = "6E GSTIN")
    @JsonProperty("6egstin")
    // @DataField(pos = 17, columnName = "6E GSTIN")
    private String e6gstin;
    // @DataField(pos = 5, columnName = "6E RegisteredAddress")
    @JsonProperty("6eRegisteredAddress")
    private String e6RegisteredAddress;
    
}
