package ulab.edu.fragmentpractice;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void changeFragment(View view){
        Fragment newFragment;
        if(view==findViewById(R.id.button)){
            newFragment = new fragmentOne();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

           transaction.replace(R.id.mainFragmentID,newFragment);
            transaction.commit();
        } if(view==findViewById(R.id.button2)){
            newFragment = new fragmentTwo();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.mainFragmentID,newFragment);
            transaction.commit();
        }
    }
}
