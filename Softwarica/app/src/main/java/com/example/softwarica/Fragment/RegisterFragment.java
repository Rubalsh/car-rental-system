package com.example.softwarica.Fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.softwarica.MainActivity;
import com.example.softwarica.Model.Student;
import com.example.softwarica.R;


public class RegisterFragment extends Fragment {

    EditText name,age,address;
    int image;
    RadioGroup rdoGender;
    Button btnSubmit;
    RadioButton btnGender;
    public RegisterFragment() {

        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view= inflater.inflate(R.layout.fragment_register, container, false);
        name=view.findViewById(R.id.etName);
        age=view.findViewById(R.id.etAge);
        rdoGender = view.findViewById(R.id.grpGender);
        address=view.findViewById(R.id.etAddress);
        btnSubmit=view.findViewById(R.id.btnSubmit);



        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Validation
                if (name.equals("")) {
                    name.setError( "You did not enter a username");
                    return;
                }
                if(age.equals("")){
                    age.setError("Enter age");
                    return;

                }
                if(address.equals("")){
                    address.setError("Enter address");
                    return;

                }

                int selectGender=rdoGender.getCheckedRadioButtonId();
                btnGender=view.findViewById(selectGender);

//        For image of gender
                switch (btnGender.getText().toString()){
                    case "Male":
                        image=R.drawable.male;
                        break;
                    case "Female":
                        image=R.drawable.female;
                        break;
                    case "Other":
                        image=R.drawable.others;
                        break;
                        default:
                            image=R.drawable.male;
                            break;
                }

                MainActivity.students.add(new Student(name.getText().toString(),Integer.parseInt(age.getText().toString()),btnGender.getText().toString(),address.getText().toString(),image));
                Toast toast=Toast.makeText(getContext(),"Student created",Toast.LENGTH_LONG);
                toast.show();

            }
        });


        return view;
    }

}
