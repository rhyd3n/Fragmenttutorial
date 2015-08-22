package com.example.android.simplefrag;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.android.fragmentexample.R;

public class SimpleFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_fragment);
        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(R.id.container, new PlaceholderFragment()).commit();
        }
    }
    public static class PlaceholderFragment extends Fragment{
        public PlaceholderFragment(){
        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
            View rootView = inflater.inflate(R.layout.fragment_simple,container,false);
            /*
            Button btnClickMedesert = (Button)rootView.findViewById(R.id.btnsimplefragdesert);
            btnClickMedesert.setOnClickListener(
                new onClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getActivity(),"You clicked me desert", Toast.LENGTH_SHORT).show();
                }
                }); */
            return rootView;
        }
    }
}