package com.example.myapplication;


        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;

        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.LinearLayout;
        import android.widget.TextView;
        import android.content.Context;

public class Main2Activity extends AppCompatActivity {

    TextView myTV;
    boolean stanje = true;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTV = findViewById(R.id.textView);
        Button myB = findViewById(R.id.button2);

        myB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stanje = !stanje;
                if (stanje) {
                    myTV.setText(getString(R.string.string_za_srednjeg_roditelja));
                } else {
                    myTV.setText(getString(R.string.string_za_srednjeg_roditelja_2));
                }
                Intent intent = new Intent(packageContext this, SecondActivity.class);
                EditText upisi = findViewById(R.id.editText1);
                Sting message = upisi.getText().toString();

            }
        });



        /*Button noviB = new Button(Context this);
        noviB.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        noviB.setText(R.string.second_button_text);
        noviB.setTransformationMethod(null);

        LinearLayout myLL = findViewById(R.id.middleBox);
        myLL.addView(noviB);*/
    }
}

