package fi.ptm.basicuicontrolsexercise1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 *
 * @author PTM
 */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectButtonClicked(View view) {
        // find RadioGroup
        RadioGroup rg = (RadioGroup) findViewById(R.id.myRadioGroup);
        int id = rg.getCheckedRadioButtonId();
        // find button
        RadioButton rb = (RadioButton) findViewById(id);
        // get RadioButton text
        String text = (String) rb.getText();
        // toast message to screen
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }
}
