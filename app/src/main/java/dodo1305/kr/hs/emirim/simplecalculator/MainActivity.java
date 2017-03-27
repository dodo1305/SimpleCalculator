package dodo1305.kr.hs.emirim.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edit_first = (EditText) findViewById(R.id.edit_first);
        final EditText edit_second = (EditText) findViewById(R.id.edit_second);
        Button but_plus = (Button) findViewById(R.id.but_plus);
        Button but_minus = (Button) findViewById(R.id.but_minus);
        Button but_multiply = (Button) findViewById(R.id.but_multiply);
        Button but_division = (Button) findViewById(R.id.but_division);
        textResult = (TextView) findViewById(R.id.textResult);

        but_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(edit_first.getText().toString());
                int num2 = Integer.parseInt(edit_second.getText().toString());
                textResult.setText(num1 + num2);
            }
        });
    }
}