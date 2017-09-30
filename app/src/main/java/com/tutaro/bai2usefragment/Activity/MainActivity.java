package com.tutaro.bai2usefragment.Activity;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.tutaro.bai2usefragment.Fragment.StudentAddFragment;
import com.tutaro.bai2usefragment.Fragment.StudentFragment;
import com.tutaro.bai2usefragment.Fragment.StudentInfoFragment;
import com.tutaro.bai2usefragment.Object.Student;
import com.tutaro.bai2usefragment.R;

public class MainActivity extends AppCompatActivity {

    public static final String NAME_STUDENT = "NAME_STUDENT";
    public static final String STUDENT_INFO = "STUDENT_INFO";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init(){

        StudentAddFragment studentAddFragment = new StudentAddFragment();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.container, studentAddFragment).commit();
    }

    public void gotoStudentFragment(String nameStudent){

        StudentFragment studentFragment = new StudentFragment();

        Bundle bundle = new Bundle();
        bundle.putParcelable(NAME_STUDENT, new Student(nameStudent));
        studentFragment.setArguments(bundle);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        transaction.replace(R.id.container, studentFragment).addToBackStack(null).commit();
    }

    public void gotoStudentInfoFragment(String name, String hometown, String maleOrFemale, String birthday, String classStudent, String course){

        StudentInfoFragment studentInfoFragment = new StudentInfoFragment();

        Bundle bundle = new Bundle();
        bundle.putParcelable(STUDENT_INFO, new Student(name, hometown, birthday, maleOrFemale, classStudent, course));
        studentInfoFragment.setArguments(bundle);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        transaction.replace(R.id.container, studentInfoFragment).addToBackStack(null).commit();
    }

}
