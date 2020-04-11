package kaygrafix.com.transformapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
Button sign;
EditText registration,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





sign=(Button)findViewById(R.id.signIn);
registration=(EditText)findViewById(R.id.textView);
password=(EditText)findViewById(R.id.textView2);

sign.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {


        if(registration.getText().toString().equals("2018")&&
        password.getText().toString().equals("admin"))
        { startActivity(new Intent(MainActivity.this, cardview.class));
            Toast.makeText(getApplicationContext(), "log in successful", Toast.LENGTH_SHORT).show();

        }
        else if(registration.getText().toString().equals("")&&
                password.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "fill in the Required fields",Toast.LENGTH_SHORT).show();

        }
        else{
            Toast.makeText(getApplicationContext(),"wrong credentials",Toast.LENGTH_SHORT).show();
        }
    }
});



    }
}
