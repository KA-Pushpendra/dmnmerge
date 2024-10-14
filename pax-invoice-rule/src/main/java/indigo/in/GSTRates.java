package indigo.in;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class GSTRates {
    // @DataField(pos = 1, columnName = "Product Description")
    private String productDescription;
    // @DataField(pos = 2, columnName = "IGST Rate")
    private double igstRate;  
    // @DataField(pos = 3, columnName = "CGST Rate")
    private double cgstRate; 
}
