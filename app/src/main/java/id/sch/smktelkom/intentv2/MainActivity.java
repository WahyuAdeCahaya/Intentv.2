package id.sch.smktelkom.intentv2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnFace = findViewById(R.id.btn_face);
        btnFace.setOnClickListener(this);

        Button btnCuci = findViewById(R.id.btn_cuci);
        btnCuci.setOnClickListener(this);

        Button btnMasker = findViewById(R.id.btn_masker);
        btnMasker.setOnClickListener(this);

        Button btnDialPhone = findViewById(R.id.btn_dial_number);
        btnDialPhone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_face:
                Intent moveIntent = new Intent(MainActivity.this, act2.class);
                startActivity(moveIntent);
                break;

            case R.id.btn_cuci:
                Intent moveIntent2 = new Intent(MainActivity.this, act3.class);
                startActivity(moveIntent2);
                break;

            case R.id.btn_masker:
                Intent moveIntent3 = new Intent(MainActivity.this, act4.class);
                startActivity(moveIntent3);
                break;

            case R.id.btn_dial_number:
                String phoneNumber = "911";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
                startActivity(dialPhoneIntent);
                break;
        }
    }
}
