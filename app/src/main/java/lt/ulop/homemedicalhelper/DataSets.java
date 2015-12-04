package lt.ulop.homemedicalhelper;

import android.graphics.Color;

import com.activeandroid.query.Select;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import lt.ulop.homemedicalhelper.models.Pressure;
import lt.ulop.homemedicalhelper.models.Pulse;
import lt.ulop.homemedicalhelper.models.Sugar;
import lt.ulop.homemedicalhelper.models.Temperature;

/**
 * Created by UlopL on 04.12.2015.
 */
public class DataSets {
    public static LineData getTemperatureData() {
        ArrayList<String> xVals = new ArrayList<String>();
        List<Temperature> list = new Select().from(Temperature.class).execute();

        Calendar cal = Calendar.getInstance();
        for (int i = 0; i < list.size(); i++) {
            Temperature temperature = list.get(i);
            cal.setTime(temperature.date);
            xVals.add(String.valueOf(cal.get(Calendar.DAY_OF_MONTH)) + "." +
                    String.valueOf(cal.get(Calendar.MONTH)));
        }

        ArrayList<Entry> yVals = new ArrayList<Entry>();

        for (int i = 0; i < list.size(); i++) {
            Temperature temperature = list.get(i);
            yVals.add(new Entry(temperature.value, i));
        }

        // create a dataset and give it a type
        LineDataSet set1 = new LineDataSet(yVals, "Температура");
        // set1.setFillAlpha(110);
        // set1.setFillColor(Color.RED);

        set1.setLineWidth(1.75f);
        set1.setCircleSize(3f);
        set1.setColor(Color.WHITE);
        set1.setCircleColor(Color.WHITE);
        set1.setHighLightColor(Color.WHITE);
        set1.setDrawValues(true);

        ArrayList<LineDataSet> dataSets = new ArrayList<LineDataSet>();
        dataSets.add(set1); // add the datasets

        // create a data object with the datasets
        LineData data = new LineData(xVals, dataSets);

        return data;
    }

    public static LineData getPulseData() {
        ArrayList<String> xVals = new ArrayList<String>();
        List<Pulse> list = new Select().from(Pulse.class).execute();

        Calendar cal = Calendar.getInstance();
        for (int i = 0; i < list.size(); i++) {
            Pulse pulse = list.get(i);
            cal.setTime(pulse.date);
            xVals.add(String.valueOf(cal.get(Calendar.DAY_OF_MONTH)) + "." +
                    String.valueOf(cal.get(Calendar.MONTH)));
        }

        ArrayList<Entry> yVals = new ArrayList<Entry>();

        for (int i = 0; i < list.size(); i++) {
            Pulse pulse = list.get(i);
            yVals.add(new Entry(pulse.value, i));
        }

        // create a dataset and give it a type
        LineDataSet set1 = new LineDataSet(yVals, "Пульс");
        // set1.setFillAlpha(110);
        // set1.setFillColor(Color.RED);

        set1.setLineWidth(1.75f);
        set1.setCircleSize(3f);
        set1.setColor(Color.WHITE);
        set1.setCircleColor(Color.WHITE);
        set1.setHighLightColor(Color.WHITE);
        set1.setDrawValues(true);

        ArrayList<LineDataSet> dataSets = new ArrayList<LineDataSet>();
        dataSets.add(set1); // add the datasets

        // create a data object with the datasets
        LineData data = new LineData(xVals, dataSets);

        return data;
    }

    public static LineData getSugarData() {
        ArrayList<String> xVals = new ArrayList<String>();
        List<Sugar> list = new Select().from(Sugar.class).execute();

        Calendar cal = Calendar.getInstance();
        for (int i = 0; i < list.size(); i++) {
            Sugar sugar = list.get(i);
            cal.setTime(sugar.date);
            xVals.add(String.valueOf(cal.get(Calendar.DAY_OF_MONTH)) + "." +
                    String.valueOf(cal.get(Calendar.MONTH)));
        }

        ArrayList<Entry> yVals = new ArrayList<Entry>();

        for (int i = 0; i < list.size(); i++) {
            Sugar sugar = list.get(i);
            yVals.add(new Entry(sugar.value, i));
        }

        // create a dataset and give it a type
        LineDataSet set1 = new LineDataSet(yVals, "Сахар");
        // set1.setFillAlpha(110);
        // set1.setFillColor(Color.RED);

        set1.setLineWidth(1.75f);
        set1.setCircleSize(3f);
        set1.setColor(Color.WHITE);
        set1.setCircleColor(Color.WHITE);
        set1.setHighLightColor(Color.WHITE);
        set1.setDrawValues(true);

        ArrayList<LineDataSet> dataSets = new ArrayList<LineDataSet>();
        dataSets.add(set1); // add the datasets

        // create a data object with the datasets
        LineData data = new LineData(xVals, dataSets);

        return data;
    }

    public static LineData getPressureData() {
        ArrayList<String> xVals = new ArrayList<String>();
        List<Pressure> list = new Select().from(Pressure.class).execute();

        Calendar cal = Calendar.getInstance();
        for (int i = 0; i < list.size(); i++) {
            Pressure pressure = list.get(i);
            cal.setTime(pressure.date);
            xVals.add(String.valueOf(cal.get(Calendar.DAY_OF_MONTH)) + "." +
                    String.valueOf(cal.get(Calendar.MONTH)));
        }

        ArrayList<Entry> ySYS = new ArrayList<Entry>();

        for (int i = 0; i < list.size(); i++) {
            Pressure pressure = list.get(i);
            ySYS.add(new Entry(pressure.systole, i));
        }

        ArrayList<Entry> yDIS = new ArrayList<Entry>();

        for (int i = 0; i < list.size(); i++) {
            Pressure pressure = list.get(i);
            yDIS.add(new Entry(pressure.diastole, i));
        }

        // create a dataset and give it a type
        LineDataSet set1 = new LineDataSet(ySYS, "SYS");
        LineDataSet set2 = new LineDataSet(ySYS, "DIS");
        // set1.setFillAlpha(110);
        // set1.setFillColor(Color.RED);

        set1.setLineWidth(1.75f);
        set1.setCircleSize(3f);
        set1.setColor(Color.WHITE);
        set1.setCircleColor(Color.WHITE);
        set1.setHighLightColor(Color.WHITE);
        set1.setDrawValues(true);

        set2.setLineWidth(1.75f);
        set2.setCircleSize(3f);
        set2.setColor(Color.RED);
        set2.setCircleColor(Color.RED);
        set2.setHighLightColor(Color.RED);
        set2.setDrawValues(true);

        ArrayList<LineDataSet> dataSets = new ArrayList<LineDataSet>();
        dataSets.add(set1); // add the datasets
        dataSets.add(set2); // add the datasets

        // create a data object with the datasets
        LineData data = new LineData(xVals, dataSets);

        return data;
    }
}
