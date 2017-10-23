package gelal.mus.com.gelalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GelalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gelal);
    }

	private int getLength(char[] input){
		int i = 0;

		if(input==null)
			return -1;
		
		for(; input[i]!="/0"; i++)

		return i;
	}
}
