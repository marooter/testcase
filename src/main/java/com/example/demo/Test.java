import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.OneToOne;
import javax.persistence.ManyToOne;
import javax.print.DocFlavor.STRING;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.annotation.Generated;
import javax.persistence.*;
import javax.persistence.Id;

@Data
@Entity
public class Test {
    private @Id @GeneratedValue Long id;

    private String billid;
    private String name;
    private String tel;
    private Date DateIn;

    private Test() {}
    public Test(String billid,String billorder,String name,Date DateIn,String tel){
        this.billid = billid;
        this.billorder = billorder;
        this.name = name;
        this.DateIn = DateIn;
        this.DateOut = DateOut;
        this.tel = tel;
    }
}
