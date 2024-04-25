package com.example.raddiobutton1;


import androidx.appcompat.app.AppCompatActivity;
import com.example.raddiobutton1.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String outputStr = "";

                RadioButton boy = findViewById(R.id.rdbBoy);
                RadioButton girl = findViewById(R.id.rdbGirl);
                if (boy.isChecked())
                    outputStr += "男生\n";
                else if (girl.isChecked())
                    outputStr += "女生\n";

                RadioGroup type = findViewById(R.id.rgType);
                int checkedId = type.getCheckedRadioButtonId();
                if (checkedId ==  R.id.rdbAdult)
                    outputStr += "全票\n";
                else if (checkedId ==  R.id.rdbChild)
                    outputStr += "兒童票\n";
                else
                    outputStr += "學生票\n";

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("result", outputStr);
                startActivity(intent);
            }
        });
    }
}