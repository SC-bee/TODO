package jp.ac.u_ryukyu.ie.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editText;
    private CheckBox checkBoxes[] = new CheckBox[6];
    private float yList[] = new float[6];
    private int num = 0;

    // 画面のサイズ
    private int screenWidth;
    private int screenHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        checkBoxes[0] = findViewById(R.id.checkBox0);
        checkBoxes[1] = findViewById(R.id.checkBox1);
        checkBoxes[2] = findViewById(R.id.checkBox2);
        checkBoxes[3] = findViewById(R.id.checkBox3);
        checkBoxes[4] = findViewById(R.id.checkBox4);
        checkBoxes[5] = findViewById(R.id.checkBox5);
        yList[0] = 200;
        yList[1] = 300;
        yList[2] = 400;
        yList[3] = 500;
        yList[4] = 600;
        yList[5] = 700;



        // ディスプレイのサイズを取得
        WindowManager wm = getWindowManager();
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        screenWidth = size.x;
        screenHeight = size.y;


        // オブジェクトの初期位置の設定
        button.setX(screenWidth - 300f);
        button.setY(screenHeight - 300f);
        editText.setX(100f);
        editText.setY(50f);
        checkBoxes[0].setY(-100f);
        checkBoxes[1].setY(-100f);
        checkBoxes[2].setY(-100f);
        checkBoxes[3].setY(-100f);
        checkBoxes[4].setY(-100f);
        checkBoxes[5].setY(-100f);


        // ここからボタンを押したときの処理
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkBoxes[num].setText(editText.getText());
                checkBoxes[num].setY(yList[num]);
                num += 1;
            }
        });

    }
}