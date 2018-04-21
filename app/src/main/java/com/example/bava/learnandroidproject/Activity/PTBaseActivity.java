package com.example.bava.learnandroidproject.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;


//  基类

/**
 * Created by bava on 2018/4/21.
 */

public class PTBaseActivity extends AppCompatActivity {
    /**
     * 退键盘
     * */
    @Override
    public boolean onTouchEvent(MotionEvent event) {

//    Object obj = getSystemService(this.INPUT_METHOD_SERVICE);
        if(event.getAction() == MotionEvent.ACTION_DOWN){
            if(getCurrentFocus()!=null && getCurrentFocus().getWindowToken()!=null){
                InputMethodManager manager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                manager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
            }
        }

        return super.onTouchEvent(event);
    }

}
