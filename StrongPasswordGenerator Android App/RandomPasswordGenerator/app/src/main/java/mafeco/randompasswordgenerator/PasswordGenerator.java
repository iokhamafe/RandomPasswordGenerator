package mafeco.randompasswordgenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class PasswordGenerator extends AppCompatActivity {

    private int numCharsPwd;
    private String powerfulPasswordGen = "~1234567890_!@#$%^&*()aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVxXyYzZ";
    private String weakerPassWordGen = "1234567890aAbBcCdDeEfFgGhHiIkKlLmMnNoOpPqQrRsStTuUvVxXyYzZ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_generator);

        final TextView mTxtNumChars = (TextView) findViewById(R.id.txtNumChars);
        final TextView generatedPassWord = (TextView) findViewById(R.id.generatedPassword);
        Button genMostSecurePwd = (Button) findViewById(R.id.btnStrongPass);
        Button genLessSecurePwd = (Button) findViewById(R.id.btnWeakerPassword);

        genMostSecurePwd.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                numCharsPwd = Integer.parseInt(mTxtNumChars.getText().toString());
                char[] generatedPwd = new char[numCharsPwd];
                for (int i = 0; i < numCharsPwd; i++) {
                    generatedPwd[i] = powerfulPasswordGen.charAt((int)(Math.random() * powerfulPasswordGen.length()));
                }
                String passString = String.valueOf(generatedPwd);
                generatedPassWord.setText(passString);
            }
        });

        genLessSecurePwd.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                numCharsPwd = Integer.parseInt(mTxtNumChars.getText().toString());
                char[] generatedPwd = new char[numCharsPwd];
                for (int i = 0; i < numCharsPwd; i++) {
                    generatedPwd[i] = weakerPassWordGen.charAt((int)(Math.random() * weakerPassWordGen.length()));
                }
                String passString = String.valueOf(generatedPwd);
                generatedPassWord.setText(passString);
            }
        });
    }
}
