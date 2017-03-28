package dodo1305.kr.hs.emirim.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  /*implements View.OnClickListener*/{
    TextView textResult;

    EditText edit_first,edit_second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_first = (EditText) findViewById(R.id.edit_first);
        edit_second = (EditText) findViewById(R.id.edit_second);
        Button but_plus = (Button) findViewById(R.id.but_plus);
        Button but_minus = (Button) findViewById(R.id.but_minus);
        Button but_multiply = (Button) findViewById(R.id.but_multiply);
        Button but_division = (Button) findViewById(R.id.but_division);
        textResult = (TextView) findViewById(R.id.text_result);

        but_plus.setOnClickListener(butHandler); //이거 없으면 아무리 클릭해도 할 수 없음
        but_minus.setOnClickListener(butHandler);
        but_multiply.setOnClickListener(butHandler);
        but_division.setOnClickListener(butHandler);


           /* @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(edit_first.getText().toString());
                int num2 = Integer.parseInt(edit_second.getText().toString());
                textResult=Integer.parseInt(num1)+Integer.parseInt(num2);
                textResult.setText("계산 결 :" + textResult.toString());
            }
        });

        but_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(edit_first.getText().toString());
                int num2 = Integer.parseInt(edit_second.getText().toString());
                textResult.setText(num1 - num2);
                textResult.setText("계산 결과 :" + textResult.toString());
            }
        });

        but_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(edit_first.getText().toString());
                int num2 = Integer.parseInt(edit_second.getText().toString());
                textResult.setText(num1 * num2);
                textResult.setText("계산 결과 :" + textResult.toString());
            }
        });

        but_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(edit_first.getText().toString());
                int num2 = Integer.parseInt(edit_second.getText().toString());
                textResult.setText(num1 / num2);

            }

        });*/
    }

    View.OnClickListener butHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int num1 = Integer.parseInt(edit_first.getText().toString());
            int num2 = Integer.parseInt(edit_second.getText().toString());
            int result=0;

            switch(view.getId()) { //이벤트가 발생된 위젯의 객체 참조값을 전달 받는다
                case R.id.but_plus:
                    result=num1+num2;
                    break;
                case R.id.but_minus:
                    result=num1-num2;
                    break;
                case R.id.but_multiply:
                    result=num1*num2;
                    break;
                case R.id.but_division:
                    result=num1/num2;
                    break;


            }
        }
    };

    /*@Override
    public void onClick(View view) {
            int num1 = Integer.parseInt(edit_first.getText().toString());
            int num2 = Integer.parseInt(edit_second.getText().toString());
            int result=0;

            switch(view.getId()) { //이벤트가 발생된 위젯의 객체 참조값을 전달 받는다
                case R.id.but_plus:
                    result=num1+num2;
                    break;
                case R.id.but_minus:
                    result=num1-num2;
                    break;
                case R.id.but_multiply:
                    result=num1*num2;
                    break;
                case R.id.but_division:
                    result=num1/num2;
                    break;


            }
            textResult.setText(num1 / num2);
        }*/

    }
