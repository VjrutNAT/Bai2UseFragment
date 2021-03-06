package com.tutaro.bai2usefragment.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.tutaro.bai2usefragment.Activity.MainActivity;
import com.tutaro.bai2usefragment.Object.Student;
import com.tutaro.bai2usefragment.R;

/**
 * Created by KHOE on 28/09/2017.
 */

public class StudentAddFragment extends Fragment {

    private EditText edtAddName;

    private GotoStudentFragment studentFragment;

    public StudentAddFragment() {
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        studentFragment = (GotoStudentFragment) context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_student_add, container, false);

        edtAddName = view.findViewById(R.id.edt_add_name);
        Button btnAdd = view.findViewById(R.id.btn_add);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                ((MainActivity) getActivity()).gotoStudentFragment(edtAddName.getText().toString());
                studentFragment.onGotoStudentFragment(edtAddName.getText().toString());
            }
        });

        return view;
    }

    public  interface GotoStudentFragment{
        void onGotoStudentFragment(String name);
    }
}
