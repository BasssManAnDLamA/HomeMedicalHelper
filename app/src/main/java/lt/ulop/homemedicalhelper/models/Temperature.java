package lt.ulop.homemedicalhelper.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.Date;

/**
 * Created by UlopL on 04.12.2015.
 */
@Table(name = "temperature")
public class Temperature extends Model{
    @Column(name = "value")
    public float value;

    @Column(name = "date")
    public Date date;

    public Temperature(){super();}
}
