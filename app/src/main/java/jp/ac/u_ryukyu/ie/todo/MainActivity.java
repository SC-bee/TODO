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
    private CheckBox checkBoxes[] = new CheckBox[10];
    private float yList[] = new float[10];
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
        yList[0] = 200;
        checkBoxes[1] = findViewById(R.id.checkBox1);
        yList[1] = 300;
        checkBoxes[2] = findViewById(R.id.checkBox2);
        yList[2] = 400;
        checkBoxes[3] = findViewById(R.id.checkBox3);
        yList[3] = 500;
        checkBoxes[4] = findViewById(R.id.checkBox4);
        yList[4] = 600;
        checkBoxes[5] = findViewById(R.id.checkBox5);
        yList[5] = 700;
        checkBoxes[6] = findViewById(R.id.checkBox6);
        yList[6] = 800;
        checkBoxes[7] = findViewById(R.id.checkBox7);
        yList[7] = 900;
        checkBoxes[8] = findViewById(R.id.checkBox8);
        yList[8] = 1100;
        checkBoxes[9] = findViewById(R.id.checkBox9);
        yList[9] = 1100;


        // ディスプレイのサイズを取得
        WindowManager wm = getWindowManager();
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        screenWidth = size.x;
        screenHeight = size.y;


        // オブジェクトの初期位置の設定
        button.setX(screenWidth - 220f);
        button.setY(50f);
        editText.setX(80f);
        editText.setY(50f);
        checkBoxes[0].setY(-100f);
        checkBoxes[1].setY(-100f);
        checkBoxes[2].setY(-100f);
        checkBoxes[3].setY(-100f);
        checkBoxes[4].setY(-100f);
        checkBoxes[5].setY(-100f);
        checkBoxes[6].setY(-100f);
        checkBoxes[7].setY(-100f);
        checkBoxes[8].setY(-100f);
        checkBoxes[9].setY(-100f);



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