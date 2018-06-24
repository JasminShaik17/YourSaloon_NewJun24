package cubex.mahesh.yoursaloon;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class BusinessWomanRegistration1 extends AppCompatActivity {

    TextView sr,services;
    CircleImageView cview;

    Button register;

    CheckBox makeup,bodycare,hennadesign,haircut,eyebrows,hairprotein,hairstyle,hairtreatment,westernbath,wax,massage,photography;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_woman_registration1);

        Typeface tf = Typeface.createFromAsset
                (getAssets(),"B93.ttf");

        sr = findViewById(R.id.sr);
        sr.setTypeface(tf);

        services = findViewById(R.id.services);
        services.setTypeface(tf);

        cview = findViewById(R.id.ciview);


        register = findViewById(R.id.register);
        register.setTypeface(tf);

        makeup=findViewById(R.id.makeup);
        makeup.setTypeface(tf);
        bodycare=findViewById(R.id.bodycare);
        bodycare.setTypeface(tf);
        hennadesign=findViewById(R.id.hennadesign);
        hennadesign.setTypeface(tf);
        haircut=findViewById(R.id.haircut);
        haircut.setTypeface(tf);
        eyebrows=findViewById(R.id.eyebrows);
        eyebrows.setTypeface(tf);
        hairprotein=findViewById(R.id.hairprotein);
        hairprotein.setTypeface(tf);
        hairstyle=findViewById(R.id.hairstyles);
        hairstyle.setTypeface(tf);
        hairtreatment=findViewById(R.id.hairtreatment);
        hairtreatment.setTypeface(tf);
        westernbath=findViewById(R.id.westrenbath);
        westernbath.setTypeface(tf);
        wax=findViewById(R.id.wax);
        wax.setTypeface(tf);
        massage=findViewById(R.id.massage);
        massage.setTypeface(tf);
        photography=findViewById(R.id.photography);
        photography.setTypeface(tf);

    }

   public void register(View v)
    {



    }
}
