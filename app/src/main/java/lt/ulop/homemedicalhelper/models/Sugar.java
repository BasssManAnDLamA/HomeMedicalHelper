package lt.ulop.homemedicalhelper.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.Date;

/**
 * Created by UlopL on 04.12.2015.
 */
@Table(name = "sugar")
public class Sugar extends Model {

    @Column(name = "value")
    public float value;

    @Column(name = "date")
    public Date date;

    @Column(name = "afterMeal")
    public boolean afterMeal;

    public Sugar(float value, Date date, boolean afterMeal) {
        super();
        this.value = value;
        this.date = date;
        this.afterMeal = afterMeal;
    }

    public Sugar(){super();}
}
