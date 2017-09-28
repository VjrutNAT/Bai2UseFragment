package com.tutaro.bai2usefragment.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.TextViewCompat;
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

        TextView tvName = view.findViewById(R.id.tv_name_student);
        EditText edtHomeTown = view.findViewById(R.id.edt_hometown);
        EditText edtMaleOrFemale = view.findViewById(R.id.edt_male_or_female);
        EditText edtBirthday = view.findViewById(R.id.edt_birthday);
        EditText edtClassStudent = view.findViewById(R.id.edt_class);
        EditText edtCourse = view.findViewById(R.id.edt_course);
        Button btnSave = view.findViewById(R.id.btn_save);

        Bundle bundle = getArguments();
        Student addStudent = (Student) bundle.getSerializable(MainActivity.NAME_STUDENT);
        tvName.setText(addStudent.getName());

        return view;
    }
}
