package ulab.edu.fragmentpractice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;


public class fragmentOne extends Fragment {
    View view;
    Button displayButton;
    /*
    View view;
    TextView display;
    FragmentManager fragmentManager = getFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();*/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_fragment_one, container, false);
        displayButton = (Button)view.findViewById(R.id.ShowButton);
        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            doSomething();
            }
        });

       /* Button button = (Button)view.findViewById(R.id.ShowButton);
        display = (TextView)view.findViewById(R.id.DisplayText);
        button.setOnClickListener(this);
      */
        return view; }

    void doSomething(){
        TextView displayText = (TextView)view.findViewById(R.id.DisplayText);
        EditText inputText = (EditText)view.findViewById(R.id.userName);

        String userName = "Hello "+ inputText.getText().toString()+", how are you doing? ";
        displayText.setText(userName);
        Toast.makeText(getActivity(), userName, Toast.LENGTH_SHORT).show();
    }

   /* @Override
    public void onClick(View v) {
            display.setText("This Works");
         }*/
}
