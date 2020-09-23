package com.example.controlstructure_bai2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText hsA,hsB;
    TextView result;
    Button caculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hsA = (EditText)findViewById(R.id.etA);
        hsB = (EditText)findViewById(R.id.etB);
        result = (TextView)findViewById(R.id.tvKQ);
        caculate = (Button)findViewById(R.id.btnTH);

        caculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a,b,x;
                try {
                    a = Double.parseDouble(hsA.getText().toString());
                    b = Double.parseDouble(hsB.getText().toString());
                    if(a != 0)
                    {
                        x = -b/a;
                        result.setText("Phương trình có nghiệm duy nhất x=" + x);
                    }
                    else {
                        if (b == 0)
                        {
                            result.setText("Phương trình có nghiệm đúng với mọi x");
                        }
                        else {
                            result.setText("Phương trình vô nghiệm");
                        }
                    }
                }catch (Exception e)
                {
                    /*AlertDialog.Builder ad = new AlertDialog.Builder(MainActivity.this);
                    ad.setTitle("Lỗi");
                    ad.setMessage("Vui lòng nhập đầy đủ thông tin!!");
                    ad.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
                    ad.create().show();*/
                    Toast toast = Toast.makeText(MainActivity.this,"Vui lòng nhập đầy đủ thông tin!!",Toast.LENGTH_SHORT);
                    toast.show();
                }


            }
        });
    }

}
