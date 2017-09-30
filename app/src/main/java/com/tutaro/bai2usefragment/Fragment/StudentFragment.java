package com.tutaro.bai2usefragment.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.tutaro.bai2usefragment.Activity.MainActivity;
import com.tutaro.bai2usefragment.Object.Student;
import com.tutaro.bai2usefragment.R;

/**
 * Created by KHOE on 28/09/2017.
 */

public class StudentFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_student, container, false);

        final TextView tvName = view.findViewById(R.id.tv_name_student);
        final EditText edtHomeTown = view.findViewById(R.id.edt_hometown);
        final EditText edtMaleOrFemale = view.findViewById(R.id.edt_male_or_female);
        final EditText edtBirthday = view.findViewById(R.id.edt_birthday);
        final EditText edtClassStudent = view.findViewById(R.id.edt_class);
        final EditText edtCourse = view.findViewById(R.id.edt_course);
        Button btnSave = view.findViewById(R.id.btn_save);

        Bundle bundle = this.getArguments();

        if (bundle != null) {
            Student student = (Student) bundle.getParcelable(MainActivity.NAME_STUDENT);
            tvName.setText(student.getName());
        }

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).gotoStudentInfoFragment(tvName.getText().toString(), edtHomeTown.getText().toString(),
                        edtMaleOrFemale.getText().toString(), edtBirthday.getText().toString(), edtClassStudent.getText().toString(),
                        edtCourse.getText().toString());
            }
        });

        return view;
    }
}
