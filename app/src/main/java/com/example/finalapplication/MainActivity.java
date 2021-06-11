package com.example.finalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    TextView question,score,Best,previous;
    Button Button1,Button2,Button3,Button4;
    int currentScore =0,previously =0,best=0;
    int d1=0,d2=0,m1=0,m2=0,y1=0,y2=0,y3=0,y4=0,rem=0,ans=0;
    int opt1=0,opt2=0,opt3=0,opt4=0;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started");

        question = findViewById(R.id.ques);
        Best = findViewById(R.id.best);
        previous=findViewById(R.id.previous);
        score = findViewById(R.id.score);
        Button1 = findViewById(R.id.btn1);
        Button2 = findViewById(R.id.btn2);
        Button3 = findViewById(R.id.btn3);
        Button4 = findViewById(R.id.btn4);

        getValues();

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: CLicked button one");
                if(ans == 1)
                {
                    currentScore++;
                    if(best<currentScore)
                    {
                        best=currentScore;
                    }
                }
                else
                {
                    previously=currentScore;
                    Best.setText("Best Score :"+best);
                    previous.setText("previous score :" + previously);
                    currentScore=0;
                }
                getValues();
            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: CLicked button two");
                if(ans == 2)
                {
                    currentScore++;
                    if(best<currentScore)
                    {
                        best=currentScore;
                    }
                }
                else
                {
                    previously=currentScore;
                    Best.setText("Best Score :"+best);
                    previous.setText("previous score :" + previously);
                    currentScore=0;
                }
                getValues();
            }
        });
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: CLicked button three");
                if(ans == 3)
                {
                    currentScore++;
                    if(best<currentScore)
                    {
                        best=currentScore;
                    }
                }
                else
                {
                    previously=currentScore;
                    Best.setText("Best Score :"+best);
                    previous.setText("previous score :" + previously);
                    currentScore=0;
                }
                getValues();
            }
        });
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: CLicked button four");
                if(ans == 4)
                {
                    currentScore++;
                    if(best<currentScore)
                    {
                        best=currentScore;
                    }
                }
                else
                {
                    previously = currentScore;
                    Best.setText("Best Score :" + best);
                    previous.setText("previous score :" + previously);
                    currentScore = 0;
                }
                getValues();
            }
        });
    }

    @SuppressLint("SetTextI18n")
    private void getValues()
    {
        previous.setText("previous score :" + previously);
        score.setText("present score :" + currentScore);
        Generatedd();
        Generatemm();
        Generateyy();
        question.setText(""+((d1*10)+d2)+"/"+((m1*10)+m2)+"/"+((y1*1000)+(y2*100)+(y3*10)+y4)+"");

        Generateoption();
    }

    private void Generatedd()
    {
        char[] chars1 = "012".toCharArray();
        char[] chars2 = "0123456789".toCharArray();
        Random random = new Random();
        char a = chars1[random.nextInt(chars1.length)];
        char b = chars2[random.nextInt(chars2.length)];
        while(a=='0'&&b=='0')
        {
            b = chars2[random.nextInt(chars2.length)];
        }
        while(a=='2'&&b=='9')
        {
            b = chars2[random.nextInt(chars2.length)];
        }
        d1=a-'0';
        d2=b-'0';
    }
    private void Generatemm()
    {
        char[] chars1 = "01".toCharArray();
        char[] chars2 = "123456789".toCharArray();
        Random random = new Random();
        char a = chars1[random.nextInt(chars1.length)];
        char b = chars2[random.nextInt(chars2.length)];
        while(a=='1'&&b>'2')
        {
            b = chars2[random.nextInt(chars2.length)];
        }
        m1=a-'0';
        m2=b-'0';
    }

    private void Generateyy()
    {
        char[] chars1 = "12".toCharArray();
        char[] chars2 = "123456".toCharArray();
        char[] chars3 = "0123456789".toCharArray();
        Random random = new Random();
        char a = chars1[random.nextInt(chars1.length)];
        char b = chars2[random.nextInt(chars2.length)];
        while(a=='1'&&b<'6')
        {
            b = chars2[random.nextInt(chars2.length)];
        }
        while(a=='2'&&b>'3')
        {
            b = chars2[random.nextInt(chars2.length)];
        }
        char c = chars3[random.nextInt(chars3.length)];
        char d = chars3[random.nextInt(chars3.length)];
        while(a=='0'&&b=='0'&&c=='0'&&d=='0')
        {
            d = chars3[random.nextInt(chars3.length)];
        }
        y1=a-'0';
        y2=b-'0';
        y3=c-'0';
        y4=d-'0';
    }

    @SuppressLint("SetTextI18n")
    private void Generateoption()
    {
        char[] chars = "0123456".toCharArray();
        Random random = new Random();
        char p = chars[random.nextInt(chars.length)];
        char q = chars[random.nextInt(chars.length)];
        char r = chars[random.nextInt(chars.length)];
        char s = chars[random.nextInt(chars.length)];
        while(q==p)
        {
            q= chars[random.nextInt(chars.length)];
        }
        while(r==p||r==q)
        {
            r = chars[random.nextInt(chars.length)];
        }
        while(s==p||s==q||s==r)
        {
            s = chars[random.nextInt(chars.length)];
        }
        int f,d,y,m,c;

        d = (d1*10)+d2;
        m = (m1*10)+m2;
        c = (y1*10)+y2;
        y = (y3*10)+y4;

        if(m==1||m==2)
        {
            m=m+12;
            y=y-1;
        }

        int temp1,temp2,temp3;

        temp1 = 13*(m+1);
        temp1 = temp1/5;
        temp2 = y/4;
        temp3 = c/4;

        f = d+temp1+y+temp2+temp3+(5*c);

        rem = f%7;

        opt1 = p-'0';
        opt2 = q-'0';
        opt3 = r-'0';
        opt4 = s-'0';
        if(opt1 == rem)
        {
            ans = 1;
        }
        if(opt2 == rem)
        {
            ans = 2;
        }
        if(opt3 == rem)
        {
            ans = 3;
        }
        if(opt1 != rem && opt2 != rem && opt3 != rem)
        {
            opt4 = rem;
            ans = 4;
        }

        String option1 = getoption(opt1);
        String option2 = getoption(opt2);
        String option3 = getoption(opt3);
        String option4 = getoption(opt4);
        Button1.setText(""+option1);
        Button2.setText(""+option2);
        Button3.setText(""+option3);
        Button4.setText(""+option4);
    }

    private String getoption(int x)
    {
        if(x == 0)
        {
            return "saturday";
        }
        if(x == 1)
        {
            return "sunday";
        }
        if(x == 2)
        {
            return "monday";
        }
        if(x == 3)
        {
            return "tuesday";
        }
        if(x == 4)
        {
            return "wednesday";
        }
        if(x == 5)
        {
            return "thursday";
        }
        return "friday";
    }
}