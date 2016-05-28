package com.mycompany.mylight_up;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.View;



public class Login extends AppCompatActivity {

    private RelativeLayout RL;
    private ImageView IV;
    private com.mycompany.mylight_up.EditTextWithDel CV1;
    private com.mycompany.mylight_up.PassWordShow CV2,CV3;
    private TextView TV1;
    private TextView TV2;
    private TextView TV3;
    private TextView TV4;
    private TextView TV5;
    private TextView TV6;


    private TimeCount time1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        RL=(RelativeLayout)findViewById(R.id.relativeLayout);
        IV=(ImageView)findViewById(R.id.logo);
        CV1=(com.mycompany.mylight_up.EditTextWithDel)findViewById(R.id.phone);
        CV2=(com.mycompany.mylight_up.PassWordShow)findViewById(R.id.password);
        CV3=(com.mycompany.mylight_up.PassWordShow) findViewById(R.id.password2);
        TV1=(TextView)findViewById(R.id.forgetpassword);
        TV2=(TextView)findViewById(R.id.Login);
        TV3=(TextView)findViewById(R.id.register);
        TV4=(TextView)findViewById(R.id.line1);
        TV5=(TextView)findViewById(R.id.RegisteroReturn);
        TV6=(TextView)findViewById(R.id.line2);

        time1 = new TimeCount(10000, 1000);//构造CountDownTimer对象
        time1.start();

        AnimatorSet set=new AnimatorSet();
        ObjectAnimator anim=ObjectAnimator.ofFloat(RL,"alpha",0f,1f);
        anim.setDuration(3500);
        anim.start();
    }

    public void register(View v)
    {
        TV1.setVisibility(View.GONE);
        TV2.setVisibility(View.GONE);
        TV3.setVisibility(View.GONE);
        TV4.setVisibility(View.GONE);


        IV.setVisibility(View.VISIBLE);
        CV1.setVisibility(View.VISIBLE);
        CV2.setVisibility(View.VISIBLE);
        CV3.setVisibility(View.VISIBLE);
        TV5.setVisibility(View.VISIBLE);
        TV6.setVisibility(View.VISIBLE);
    }

    public void RegisteroReturn(View v)
    {
            TV1.setVisibility(View.VISIBLE);
            TV2.setVisibility(View.VISIBLE);
            TV3.setVisibility(View.VISIBLE);
            TV4.setVisibility(View.VISIBLE);
            IV.setVisibility(View.VISIBLE);
            CV1.setVisibility(View.VISIBLE);
            CV2.setVisibility(View.VISIBLE);

            CV3.setVisibility(View.GONE);
            TV5.setVisibility(View.GONE);
            TV6.setVisibility(View.GONE);
    }

    class TimeCount extends CountDownTimer {
        public TimeCount(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);//参数依次为总时长,和计时的时间间隔
        }

        @Override
        public void onFinish() {//计时完毕时触发
        }

        @Override
        public void onTick(long millisUntilFinished) {//计时过程显示
            if ((millisUntilFinished / 1000) == 6) {
                ObjectAnimator translationup = ObjectAnimator.ofFloat(IV, "Y", 1500, IV.getY() + 100);
                translationup.setDuration(1200);
                translationup.start();
                IV.setVisibility(View.VISIBLE);

                ObjectAnimator translationup2 = ObjectAnimator.ofFloat(CV1, "Y", 1500, CV1.getY() + 200);
                translationup2.setDuration(1200);
                translationup2.start();
                CV1.setVisibility(View.VISIBLE);

                ObjectAnimator translationup3 = ObjectAnimator.ofFloat(CV2, "Y", 1500, CV2.getY() + 300);
                translationup3.setDuration(1200);
                translationup3.start();
                CV2.setVisibility(View.VISIBLE);

                ObjectAnimator translationup4 = ObjectAnimator.ofFloat(TV1, "Y", 1500, TV1.getY() + 400);
                translationup4.setDuration(1200);
                translationup4.start();
                TV1.setVisibility(View.VISIBLE);

                ObjectAnimator translationup5 = ObjectAnimator.ofFloat(TV2, "Y", 1500, TV2.getY() + 400);
                translationup5.setDuration(1200);
                translationup5.start();
                TV2.setVisibility(View.VISIBLE);

                AnimatorSet set = new AnimatorSet();
                ObjectAnimator anim = ObjectAnimator.ofFloat(RL, "alpha", 1f, 0.9f);
                anim.setDuration(500);
                anim.start();
                //RL.setBackground(Login.this.getResources().getDrawable(R.mipmap.whitelogo));
            } else if ((millisUntilFinished / 1000) == 5) {
                TV3.setVisibility(View.VISIBLE);
                TV4.setVisibility(View.VISIBLE);
                //RL.setAlpha((float)0.7);
            }
        }
    }
}
