package lt.ulop.homemedicalhelper.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.Date;

/**
 * Created by UlopL on 04.12.2015.
 */
@Table(name = "pressure")
public class Pressure extends Model {
    @Column(name = "systole")
    public int systole;

    @Column(name = "diastole")
    public int diastole;

    @Column(name = "date")
    public Date date;

    public Pressure(){super();}
}
