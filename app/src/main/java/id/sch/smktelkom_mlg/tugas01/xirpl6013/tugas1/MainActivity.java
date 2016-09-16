package id.sch.smktelkom_mlg.tugas01.xirpl6013.tugas1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox tkj, rpl, mm;
    RadioButton boy, girl;
    EditText nama, alamat;
    Button daftar;
    TextView hasil;
    RadioGroup jk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tkj = (CheckBox) findViewById(R.id.tkj);
        rpl = (CheckBox) findViewById(R.id.rpl);
        mm = (CheckBox) findViewById(R.id.mm);

        boy = (RadioButton) findViewById(R.id.boy);
        girl = (RadioButton) findViewById(R.id.girl);

        nama = (EditText) findViewById(R.id.nama);
        alamat = (EditText) findViewById(R.id.alamat);

        daftar = (Button) findViewById(R.id.daftar);

        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doProses();
            }
        });
    }

    private void doProses() {
        if (isValid()) ;
        {

        }
    }

    private boolean isValid() {
        boolean valid = true;

        return valid;
    }
}
