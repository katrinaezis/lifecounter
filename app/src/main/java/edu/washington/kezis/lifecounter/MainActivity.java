package edu.washington.kezis.lifecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    public TextView p1;
    public TextView p2;
    public TextView p3;
    public TextView p4;
    public TextView p1l;
    public TextView p2l;
    public TextView p3l;
    public TextView p4l;
    public TextView lm;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p1l = (TextView) findViewById(R.id.p1l);
        p2l = (TextView) findViewById(R.id.p2l);
        p3l = (TextView) findViewById(R.id.p3l);
        p4l = (TextView) findViewById(R.id.p4l);
        lm = (TextView) findViewById(R.id.lm);

        final Button p1m5 = (Button) findViewById(R.id.p1m5);
        final Button p1m1 = (Button) findViewById(R.id.p1m1);
        final Button p1p1 = (Button) findViewById(R.id.p1p1);
        final Button p1p5 = (Button) findViewById(R.id.p1p5);
        final Button p2m5 = (Button) findViewById(R.id.p2m5);
        final Button p2m1 = (Button) findViewById(R.id.p2m1);
        final Button p2p1 = (Button) findViewById(R.id.p2p1);
        final Button p2p5 = (Button) findViewById(R.id.p2p5);
        final Button p3m5 = (Button) findViewById(R.id.p3m5);
        final Button p3m1 = (Button) findViewById(R.id.p3m1);
        final Button p3p1 = (Button) findViewById(R.id.p3p1);
        final Button p3p5 = (Button) findViewById(R.id.p3p5);
        final Button p4m5 = (Button) findViewById(R.id.p4m5);
        final Button p4m1 = (Button) findViewById(R.id.p4m1);
        final Button p4p1 = (Button) findViewById(R.id.p4p1);
        final Button p4p5 = (Button) findViewById(R.id.p4p5);

        p1m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(p1l.getText().toString());
                num -= 5;
                p1l.setText(num + "");
                if (num <= 0) {
                    lm.setText("Player 1 is a total loser. Sad!");
                }
            }
        });
        p1m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(p1l.getText().toString());
                num -= 1;
                p1l.setText(num + "");
                if (num <= 0) {
                    lm.setText("Player 1 is a total loser. Sad!");
                }
            }
        });
        p1p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(p1l.getText().toString());
                num += 1;
                p1l.setText(num + "");
                if (num <= 0) {
                    lm.setText("Player 1 is a total loser. Sad!");
                }
            }
        });
        p1p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(p1l.getText().toString());
                num += 5;
                p1l.setText(num + "");
                if (num <= 0) {
                    lm.setText("Player 1 is a total loser. Sad!");
                }
            }
        });
        p2m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(p2l.getText().toString());
                num -= 5;
                p2l.setText(num + "");
                if (num <= 0) {
                    lm.setText("Player 2 is a total loser. Sad!");
                }
            }
        });
        p2m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(p2l.getText().toString());
                num -= 1;
                p2l.setText(num + "");
                if (num <= 0) {
                    lm.setText("Player 2 is a total loser. Sad!");
                }
            }
        });
        p2p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(p2l.getText().toString());
                num += 1;
                p2l.setText(num + "");
                if (num <= 0) {
                    lm.setText("Player 2 is a total loser. Sad!");
                }
            }
        });
        p2p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(p2l.getText().toString());
                num += 5;
                p2l.setText(num + "");
                if (num <= 0) {
                    lm.setText("Player 2 is a total loser. Sad!");
                }
            }
        });
        p3m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(p3l.getText().toString());
                num -= 5;
                p3l.setText(num + "");
                if (num <= 0) {
                    lm.setText("Player 3 is a total loser. Sad!");
                }
            }
        });
        p3m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(p3l.getText().toString());
                num -= 1;
                p3l.setText(num + "");
                if (num <= 0) {
                    lm.setText("Player 3 is a total loser. Sad!");
                }
            }
        });
        p3p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(p3l.getText().toString());
                num += 1;
                p3l.setText(num + "");
                if (num <= 0) {
                    lm.setText("Player 3 is a total loser. Sad!");
                }
            }
        });
        p3p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(p3l.getText().toString());
                num += 5;
                p3l.setText(num + "");
                if (num <= 0) {
                    lm.setText("Player 3 is a total loser. Sad!");
                }
            }
        });
        p4m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(p4l.getText().toString());
                num -= 5;
                p4l.setText(num + "");
                if (num <= 0) {
                    lm.setText("Player 4 is a total loser. Sad!");
                }
            }
        });
        p4m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(p4l.getText().toString());
                num -= 1;
                p4l.setText(num + "");
                if (num <= 0) {
                    lm.setText("Player 4 is a total loser. Sad!");
                }
            }
        });
        p4p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(p4l.getText().toString());
                num += 1;
                p4l.setText(num + "");
                if (num <= 0) {
                    lm.setText("Player 4 is a total loser. Sad!");
                }
            }
        });
        p4p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(p4l.getText().toString());
                num += 5;
                p4l.setText(num + "");
                if (num <= 0) {
                    lm.setText("Player 4 is a total loser. Sad!");
                }
            }
        });


    }
}
