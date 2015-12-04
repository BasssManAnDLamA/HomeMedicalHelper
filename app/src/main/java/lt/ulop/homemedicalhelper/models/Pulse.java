package lt.ulop.homemedicalhelper.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.Date;

/**
 * Created by UlopL on 04.12.2015.
 */
@Table(name = "pulse")
public class Pulse extends Model {
    @Column(name = "value")
    public int value;

    @Column(name = "date")
    public Date date;

    public Pulse(){super();}

    public Pulse(int value, Date date) {
        super();
        this.value = value;
        this.date = date;
    }
}
