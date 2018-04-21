package com.example.bava.learnandroidproject.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bava.learnandroidproject.Config.Const;
import com.example.bava.learnandroidproject.R;

public class MainActivity extends PTBaseActivity {

  protected TextView textView;
  private  EditText nameEdit;
  private Button btn;
  private String hint = "点击了按钮";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    textView = (TextView) findViewById(R.id.textView);
    btn = (Button)findViewById(R.id.button);
    nameEdit = (EditText)findViewById(R.id.nameEdit);
    nameEdit.addTextChangedListener(editTextListener);
  }



  public void clickAction(View view) {
    Const.shortShow(MainActivity.this, hint);
  }

  /**
   * 处理所有按钮的点击
   * */

  private View.OnClickListener listense = new View.OnClickListener() {

    @Override
    public void onClick(View view) {
      Button btn = (Button) view;

    }

  };


  /**
   * 监听输入框的代理
   */

  private  TextWatcher editTextListener = new TextWatcher() {


    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
      String content = nameEdit.getText().toString();
      Log.v("文字改变了", content);
    }

  };


}
