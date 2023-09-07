package com.example.wiring_widgets11;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class fragment1 extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment1, container, false);

        EditText num1 = view.findViewById(R.id.firstnum);
        EditText num2 = view.findViewById(R.id.secondnum);
        Button btnresult = view.findViewById(R.id.btnresult);

        btnresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1, n2, res;
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());
                res = n1 + n2;
                String strres = String.valueOf(res);
                TextView displayresult = view.findViewById(R.id.txtresult);
                displayresult.setText("Sum = " + strres);
            }
        });
        return view;
    }
}
