package guruthinkmobile.com.homework_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1;
    EditText num2;
    Button btnPlus;
    Button btnMinus;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        answer = (TextView) findViewById(R.id.answer);
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int n1, n2, res = 0;
        if (num1.length()>0 && num2.length()>0) {
            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());
            switch (v.getId()) {
                case R.id.btnPlus:
                    res = n1 + n2;
                    break;
                case R.id.btnMinus:
                    res = n1 - n2;
                    break;
            }
            answer.setText(Integer.toString(res));
        }
        else {
            answer.setText("Введіть два цілих числа");
        }
    }
}
