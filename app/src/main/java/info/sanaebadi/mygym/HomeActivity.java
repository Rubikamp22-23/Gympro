package info.sanaebadi.mygym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        AppCompatTextView memberName= findViewById(R.id.textview_member_name);

        Member member= new Member();
        member.setMemberName("Sara");
        member.setMemberName("Ali");
        member.setMemberName("Mari");

        Mike mike= new Mike();
        memberName.setText(mike.getMemberName());

    }
}