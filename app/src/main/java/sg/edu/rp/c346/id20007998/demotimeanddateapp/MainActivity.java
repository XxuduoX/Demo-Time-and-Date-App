package sg.edu.rp.c346.id20007998.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    TimePicker tp;
    Button btnDate;
    Button btnTime;
    Button btnReset;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDate = findViewById(R.id.buttonDisplayDate);
        btnTime = findViewById(R.id.buttonDisplayTime);
        btnReset=findViewById(R.id.resetBtn);
        tvDisplay = findViewById(R.id.textViewDisplay);


        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "Time is ";
                message += tp.getCurrentHour();
                message+=":";
                message += tp.getCurrentMinute();
                tvDisplay.setText(message);

            }
        });

        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "Date is ";
                message+=dp.getDayOfMonth();
                message+="/";
                message+=dp.getMonth()+1;
                message+="/";
                message+=dp.getYear();
                tvDisplay.setText(message);



            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tp.setCurrentHour(0);
                tp.setCurrentMinute(0);
                dp.updateDate(2020,0,1);

            }
        });


    }
}