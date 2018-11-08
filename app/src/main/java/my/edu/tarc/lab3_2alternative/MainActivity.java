package my.edu.tarc.lab3_2alternative;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    protected void showMsg(View view) {
        textViewMessage = findViewById(R.id.textViewMessage);
        textViewMessage.setText(R.string.greeting);
    }
}
