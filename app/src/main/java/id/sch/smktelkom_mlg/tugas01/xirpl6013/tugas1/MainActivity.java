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
        String na = nama.getText().toString();
        String al = alamat.getText().toString();

        if (na.isEmpty()) {
            nama.setError("Please enter your name");
            valid = false;
        } else {
            nama.setError(null);
        }

        if (al.isEmpty()) {
            alamat.setError("Please enter your address");
            valid = false;
        }

        String jurusan = "Jurusan yang Anda Pilih : \n ";
        int startlen = jurusan.length();
        if (rpl.isChecked()) jurusan += rpl.getText() + "\n";
        if (tkj.isChecked()) jurusan += tkj.getText() + "\n";
        if (mm.isChecked()) jurusan += mm.getText() + "\n";

        if (jurusan.length() == startlen)
            jurusan = "Please choose your school majors";
        String jenis = null;

        if (jk.getCheckedRadioButtonId() != -1) {
            RadioButton rb = (RadioButton)
                    findViewById(jk.getCheckedRadioButtonId());
            jenis = rb.getText().toString();
        }

        if (jenis == null) {
            hasil.setText("Please choose your gender");
            valid = false;
        } else {
            hasil.setText("Congratulation" + nama + "From" + alamat + "is Already Registed.\n" +
                    jurusan);
        }
        return valid;
    }
}
