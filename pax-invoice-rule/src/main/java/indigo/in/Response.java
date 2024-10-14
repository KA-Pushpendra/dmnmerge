package indigo.in;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Response extends SlfeData {

    // private List<String> reasonIds;
  //  private Boolean IsError;
    //private Boolean IsCorrect;
   // private List<String> errorDescription;
    //private List<String> ErrorIds;
    // private String TranType;

    private List<String> reasonIds;
    
    // @DataField(pos = 48, columnName = "IsError")
    private String isError;

    // @DataField(pos = 49, columnName = "IsCorrect")
    private String IsCorrect;

    // @DataField(pos = 50, columnName = "ErrorIds")
    private List<String> errorIds;

    // @DataField(pos = 51, columnName = "AuditTrail")
    private List<String> errorDescription;;

 
    private String tranType;
}
