package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,bmul,badd,bsub,bdiv,bdot,beql,btnclr,btnbac;
    TextView ans;
    boolean mul,add,sub,div;
    double var1,var2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1= (Button) findViewById(R.id.btn1);
        btn2= (Button) findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn0=(Button)findViewById(R.id.btn0);
        bmul=(Button)findViewById(R.id.btnmul);
        badd=(Button)findViewById(R.id.btnadd);
        bsub=(Button)findViewById(R.id.btnsub);
        bdiv=(Button)findViewById(R.id.btndiv);
        bdot=(Button)findViewById(R.id.btndot);
        beql=(Button)findViewById(R.id.btneql);
        btnclr=(Button)findViewById(R.id.btnclr);
        btnbac=(Button)findViewById(R.id.btnbac);

        ans=(TextView)findViewById(R.id.ans);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"9");
            }
        });

        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+".");
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(ans.getText()+"");
                mul=true;
                ans.setText(null);
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(ans.getText()+"");
                add=true;
                ans.setText(null);
            }
        });

        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(ans.getText()+"");
                sub = true;
                ans.setText(null);
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(ans.getText()+"");
                div=true;
                ans.setText(null);
            }
        });

        beql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2=Double.parseDouble(ans.getText()+"");
                    if (mul == true) {
                        ans.setText(var1 * var2 + "");
                        mul = false;
                    }
                    if (add == true) {
                        ans.setText(var1 + var2 + "");
                        add = false;
                    }
                    if (sub == true) {
                        ans.setText(var1 - var2 + "");
                        sub = false;
                    }
                    if (div == true) {
                        ans.setText(var1 / var2 + "");
                        div = false;
                    }
                }
        });
            btnclr.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ans.setText("");
                }
            });

            btnbac.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        String str= ans.getText().toString();
                        if (str.length()>1){
                            str=str.substring(0,str.length()-1);
                            ans.setText(str);}
                            else
                        {
                                ans.setText("");
                        }
                }
            });



    }
}
