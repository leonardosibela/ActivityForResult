package br.com.sibela.activityforresult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends Activity {

    EditText resultText;
    Button sendResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        resultText = (EditText) findViewById(R.id.text_for_result);
        sendResult = (Button) findViewById(R.id.send_result_button);

        sendResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendResult();
                finish();
            }
        });
    }

    private void sendResult() {
        Intent returnIntent = new Intent();
        returnIntent.putExtra("result", resultText.getText().toString());
        setResult(Activity.RESULT_OK, returnIntent);
    }
}
