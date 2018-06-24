package cubex.mahesh.yoursaloon;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class BusinessGuestRegistration extends AppCompatActivity {

    TextView sr;
    CircleImageView cview;

    EditText email, pass, phno, city, location ;

    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_guest_registration);

        Typeface tf = Typeface.createFromAsset
                (getAssets(),"B93.ttf");

        sr = findViewById(R.id.sr);
        sr.setTypeface(tf);

        cview = findViewById(R.id.ciview);

        email = findViewById(R.id.email);
        email.setTypeface(tf);

        pass = findViewById(R.id.pass);
        pass.setTypeface(tf);

        phno = findViewById(R.id.phno);
        phno.setTypeface(tf);

        city = findViewById(R.id.city);
        city.setTypeface(tf);


        location = findViewById(R.id.location);
        location.setTypeface(tf);

        next = findViewById(R.id.next);
        next.setTypeface(tf);


    }

   public void next(View v)
    {

    startActivity(new Intent(this,
                    SalonRegistration1.class));

    }
}
