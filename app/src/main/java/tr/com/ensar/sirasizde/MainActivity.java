package tr.com.ensar.sirasizde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnAsker,btnTank,btnTop;
    TextView txtMesaj;
    public Asker asker;
    public Tank tank;
    public Top top;
    String mesaj = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAsker = findViewById(R.id.btnAsker);
        btnTank = findViewById(R.id.btnTank);
        txtMesaj = findViewById(R.id.txtMesaj);
        btnTop = findViewById(R.id.btnTop);
        asker =  new Asker();
        tank = new Tank();
        top = new Top();
        btnAsker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesaj = asker.atesEt();
                txtMesaj.setText(mesaj);
            }
        });
        btnTank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesaj = tank.atesEt();
                txtMesaj.setText(mesaj);
            }
        });
        btnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mesaj = top.atesEt();
                txtMesaj.setText(mesaj);
            }
        });
    }
}