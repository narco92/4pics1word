package com.example.admin.a4pics1word;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
//import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.content.Intent;
import android.widget.ImageButton;
import android.widget.TextView;


@TargetApi(Build.VERSION_CODES.GINGERBREAD)
public class Niveau1_3 extends Activity {
    public final static String FAV = "fav";
    public final static String bol3 = "fxcvb1";
    public String pop3 = null;
    public final static int CHOOSE_BUTTON_REQUEST =3 ;
    public final static String BUTTONS3 = "sdz.chapitreTrois.intent.example.Boutons";
    int not=15;
    public void saibi(TextView x) {
        String te = x.getText().toString();
        if (raz1.getText().toString().equals(te) && raz1.isEnabled() == false) {
            raz1.setEnabled(true);
            raz1.setBackgroundResource(R.drawable.sa);
            x.setText("");

        } else {
            if (raz2.getText().toString().equals(te) && raz2.isEnabled() == false) {
                raz2.setEnabled(true);
                raz2.setBackgroundResource(R.drawable.sa);
                x.setText("");

            } else {
                if (raz3.getText().toString().equals(te) && raz3.isEnabled() == false) {
                    raz3.setEnabled(true);
                    raz3.setBackgroundResource(R.drawable.sa);
                    x.setText("");
                } else {
                    if (raz4.getText().toString().equals(te) && raz4.isEnabled() == false) {
                        raz4.setEnabled(true);
                        raz4.setBackgroundResource(R.drawable.sa);
                        x.setText("");
                    } else {
                        if (raz5.getText().toString().equals(te) && raz5.isEnabled() == false) {
                            raz5.setEnabled(true);
                            raz5.setBackgroundResource(R.drawable.sa);
                            x.setText("");
                        } else {
                            if (raz6.getText().toString() == te && raz6.isEnabled() == false) {
                                raz6.setEnabled(true);
                                raz6.setBackgroundResource(R.drawable.sa);
                                x.setText("");
                            } else {
                                if (raz7.getText().toString() == te && raz7.isEnabled() == false) {
                                    raz7.setEnabled(true);
                                    raz7.setBackgroundResource(R.drawable.sa);
                                    x.setText("");}
                                else{
                                    if (raz8.getText().toString() == te && raz8.isEnabled() == false) {
                                        raz8.setEnabled(true);
                                        raz8.setBackgroundResource(R.drawable.sa);
                                        x.setText("");}
                                    else{

                                        if (raz9.getText().toString() == te && raz9.isEnabled() == false) {
                                            raz9.setEnabled(true);
                                            raz9.setBackgroundResource(R.drawable.sa);
                                            x.setText("");}
                                        else{
                                            if (raz10.getText().toString() == te && raz10.isEnabled() == false) {
                                                raz10.setEnabled(true);
                                                raz10.setBackgroundResource(R.drawable.sa);
                                                x.setText("");}
                                            else{
                                                if (raz11.getText().toString() == te && raz11.isEnabled() == false) {
                                                    raz11.setEnabled(true);
                                                    raz11.setBackgroundResource(R.drawable.sa);
                                                    x.setText("");}
                                                else{
                                                    raz12.setEnabled(true);
                                                    raz12.setBackgroundResource(R.drawable.sa);
                                                    x.setText("");

                                                }
                                            }
                                        }
                                    }
                                }}

                        }
                    }
                }

            }
        }

    }


    public void toggle(TextView x) {

        String te = x.getText().toString();



        if (text1.getText().toString().isEmpty()) {

            text1.setText(te);
            x.setEnabled(false);
            x.setBackgroundColor(Color.TRANSPARENT);

        }


        else {


            if (text2.getText().toString().isEmpty()){
                text2.setText(te);
                x.setEnabled(false);
                x.setBackgroundColor(Color.TRANSPARENT);

            }

            else {
                if (text3.getText().toString().isEmpty()){
                    text3.setText(te);
                    x.setEnabled(false);
                    x.setBackgroundColor(Color.TRANSPARENT);
                }
                else{
                    if(text4.getText().toString().isEmpty()){
                        text4.setText(te);
                        x.setEnabled(false);
                        x.setBackgroundColor(Color.TRANSPARENT);
                    }
                    else
                    if(text5.getText().toString().isEmpty()){
                        text5.setText(te);
                        x.setEnabled(false);
                        x.setBackgroundColor(Color.TRANSPARENT);
                        if (text1.getText().equals("S") && text2.getText().equals("A") && text3.getText().equals("L") && text4.getText().equals("U") && text5.getText().equals("T")) {




                            SharedPreferences preferences = getSharedPreferences("pref", 0);
                            SharedPreferences.Editor editor = preferences.edit();
                            editor.putString(FAV, pop3);
                            editor.putString(bol3, "vrai");

                            editor.commit();

                            Intent secondeActivite = new Intent(Niveau1_3.this, ChoixNiveau.class);

                            secondeActivite.putExtra(BUTTONS3, pop3);
                            startActivity(secondeActivite);

                        }
                    }


                }}
        }



    };





    TextView textv = null;
    TextView textv2 = null;
    TextView text = null;
    TextView text1 = null;
    TextView text2 = null;
    TextView text3 = null;
    TextView text4 = null;
    TextView text5 = null;
    ImageButton appler=null;
    ImageButton app=null;
    TextView raz1 = null;
    TextView raz2 = null;
    TextView raz3 = null;
    TextView raz4 = null;
    TextView raz5 = null;
    TextView raz6 = null;
    TextView raz7 = null;
    TextView raz8 = null;
    TextView raz9 = null;
    TextView raz10 = null;
    TextView raz11 = null;
    TextView raz12 = null;

//Button mButton2 = null;
//Button mButton1 = null;

    ImageButton premier2=null;
    ImageButton premier3=null;
    ImageButton premier4=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.niveau1_3);
        textv = (TextView) findViewById(R.id.textv);
//textv2 = (TextView) findViewById(R.id.textv2);
// text = (TextView) findViewById(R.id.ite0);
        text1 = (TextView) findViewById(R.id.ite1);
        text2 = (TextView) findViewById(R.id.ite2);
        text3 = (TextView) findViewById(R.id.ite3);
        text4 = (TextView) findViewById(R.id.ite4);
        text5 = (TextView) findViewById(R.id.ite5);

// mButton2 = (Button) findViewById(R.id.button2);

        premier2 = (ImageButton) findViewById(R.id.img2);
        premier3 = (ImageButton) findViewById(R.id.img3);
        premier4 = (ImageButton) findViewById(R.id.img4);



        raz1 = (TextView) findViewById(R.id.bot1);
        raz2 = (TextView) findViewById(R.id.bot2);
        raz3 = (TextView) findViewById(R.id.bot3);
        raz4 = (TextView) findViewById(R.id.bot4);
        raz5 = (TextView) findViewById(R.id.bot5);
        raz6 = (TextView) findViewById(R.id.bot6);
        raz7 = (TextView) findViewById(R.id.bot7);
        raz8 = (TextView) findViewById(R.id.bot8);
        raz9 = (TextView) findViewById(R.id.bot9);
        raz10 = (TextView) findViewById(R.id.bot10);
        raz11 = (TextView) findViewById(R.id.bot11);
        raz12 = (TextView) findViewById(R.id.bot12);
        appler = (ImageButton) findViewById(R.id.appler);
        app = (ImageButton) findViewById(R.id.appler);
        raz1.setOnClickListener(enrgis7);
        raz2.setOnClickListener(enrgis7);
        raz3.setOnClickListener(enrgis7);
        raz4.setOnClickListener(enrgis7);
        raz5.setOnClickListener(enrgis7);
        raz6.setOnClickListener(enrgis7);
        raz7.setOnClickListener(enrgis7);
        raz8.setOnClickListener(enrgis7);
        raz9.setOnClickListener(enrgis7);
        raz10.setOnClickListener(enrgis7);
        raz11.setOnClickListener(enrgis7);
        raz12.setOnClickListener(enrgis7);


        text1.setOnClickListener(llll1);
        text2.setOnClickListener(llll1);
        text3.setOnClickListener(llll1);
        text4.setOnClickListener(llll1);
        text5.setOnClickListener(llll1);

        app.setOnClickListener(apple2);
        appler.setOnClickListener(apple);


        premier2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                premier2.setImageResource(R.drawable.bbbo);

            }
        });
        premier3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                premier3.setImageResource(R.drawable.bbboo);

            }
        });
        premier4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                premier4.setImageResource(R.drawable.bbo);

            }
        });




        Intent i=getIntent();
        String jjj=i.getStringExtra(Niveau1_2.BUTTONS2);
        float jjjj= Float.valueOf(jjj);
        jjjj=jjjj+10;
        String jjjjj=String.valueOf(jjjj);
        textv.setText(jjjjj);



        if (jjjj==30) {
            // textv2.setText("Niveau2");
            SharedPreferences preferences = getSharedPreferences("pref", 0);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString(FAV, jjjjj);


            editor.commit();

        }



        SharedPreferences preferenc =getSharedPreferences("pref", 0);
        String la = preferenc.getString(Niveau1_3.bol3, "11");
        if(la.toString().equals("vrai")){
            String ff= textv.getText().toString();
            float dd=Float.valueOf(ff);
            dd=dd-10;
            pop3 =String.valueOf(dd);
            app.setEnabled(false);
            appler.setEnabled(false);
            //  marzouk.setBackgroundColor(Color.RED);

        }
        else{
            pop3=textv.getText().toString();}


//+++++++++++++++++++++++++++++++++++++-----------------------------------------------------------------------------------------------


//---------------------------------------------+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    }








    private View.OnClickListener llll1 = new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            switch (v.getId()) {

                case R.id.ite1:
                    saibi(text1);
                    break;
                case R.id.ite2:
                    saibi(text2);
                    break;
                case R.id.ite3:
                    saibi(text3);
                    break;
                case R.id.ite4:
                    saibi(text4);
                    break;
                case R.id.ite5:
                    saibi(text5);
                    break;
            }
        }
    };


    //***************************************************************************************
    private View.OnClickListener enrgis7 = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {

                case R.id.bot1:
                    toggle(raz1);
                    break;
                case R.id.bot2:
                    toggle(raz2);
                    break;
                case R.id.bot3:
                    toggle(raz3);
                    break;
                case R.id.bot4:
                    toggle(raz4);
                    break;
                case R.id.bot5:
                    toggle(raz5);
                    break;
                case R.id.bot6:
                    toggle(raz6);
                    break;
                case R.id.bot7:
                    toggle(raz7);
                    break;
                case R.id.bot8:
                    toggle(raz8);
                    break;
                case R.id.bot9:
                    toggle(raz9);
                    break;
                case R.id.bot10:
                    toggle(raz10);
                    break;
                case R.id.bot11:
                    toggle(raz11);
                    break;
                case R.id.bot12:
                    toggle(raz12);
                    break;
            }


        }

    };


    private View.OnClickListener apple = new View.OnClickListener() {


        public void onClick(View v) {


            String fff= textv.getText().toString();
            float ddd=Float.valueOf(fff);
            ddd=ddd-2;
            String aid =String.valueOf(ddd);
            textv.setText(aid);
            raz1.setEnabled(false);
            raz1.setVisibility(View.INVISIBLE);
            raz6.setEnabled(false);
            raz6.setVisibility(View.INVISIBLE);;
            app.setEnabled(false);
            appler.setEnabled(false);


            // Uri telephone = Uri.parse("tel:0795845395");
            // Intent secondeActivite = new Intent(Intent.ACTION_DIAL, telephone);
            //   secondeActivite.CATEGORY_LEANBACK_LAUNCHER.toString();


            //  startActivity(secondeActivite);

        }

    };

    private View.OnClickListener apple2 = new View.OnClickListener() {


        public void onClick(View v) {



            String fff= textv.getText().toString();
            float ddd=Float.valueOf(fff);
            ddd=ddd-2;
            String aid =String.valueOf(ddd);
            textv.setText(aid);
            text3.setText("L");
            text3.setEnabled(false);

            text1.setText("S");
            text1.setEnabled(false);
            appler.setEnabled(false);
            app.setEnabled(false);

            // Uri marzouk = Uri.parse("http://www.google.com");
            // Intent secondeActivite = new Intent(Intent.ACTION_VIEW, marzouk);


            // startActivity(secondeActivite);

        }

    };


//*********************************************************************************************************************************************














};



