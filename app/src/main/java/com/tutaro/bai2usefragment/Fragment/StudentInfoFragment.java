package com.tutaro.bai2usefragment.Fragment;

import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tutaro.bai2usefragment.Activity.MainActivity;
import com.tutaro.bai2usefragment.Object.Student;
import com.tutaro.bai2usefragment.R;

/**
 * Created by KHOE on 28/09/2017.
 */

public class StudentInfoFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_student_info, container, false);

        TextView tvName = view.findViewById(R.id.tv_name_student);
        TextView tvHometown = view.findViewById(R.id.tv_hometown);
        TextView tvMaleOrFemale = view.findViewById(R.id.tv_male_or_female);
        TextView tvBirthday = view.findViewById(R.id.tv_birthday);
        TextView tvClassStudent = view.findViewById(R.id.tv_class);
        TextView tvCourse = view.findViewById(R.id.tv_course);

        Bundle bundle = getArguments();
        if (bundle != null){
            Student studentInfo = (Student) bundle.getParcelable(MainActivity.STUDENT_INFO);

            tvName.setText(getString(R.string.name) + " " + studentInfo.getName());
            tvHometown.setText(getString(R.string.hometown) + " " + studentInfo.getHometown());
            tvMaleOrFemale.setText(getString(R.string.male_or_female) + " " + studentInfo.getMaleOrFemale());
            tvBirthday.setText(getString(R.string.birthday) + " " + studentInfo.getBirthday());
            tvClassStudent.setText(getString(R.string.class_student) + " " + studentInfo.getClassStudent());
            tvCourse.setText(getString(R.string.course) + " " + studentInfo.getCourse());
        }

        return view;
    }
}
