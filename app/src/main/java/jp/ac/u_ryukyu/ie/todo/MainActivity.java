package jp.ac.u_ryukyu.ie.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button makeTaskButton = (Button) findViewById(R.id.myButton);
        final Button removeTaskButton = (Button) findViewById(R.id.removeButton);
        final EditText editText = (EditText) findViewById(R.id.editText);
        final TableLayout table = (TableLayout) findViewById(R.id.myTable);


        makeTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                makeTask(v);
                editText.getEditableText().clear();
            }
        });


        removeTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                deleteTask(v);
            }});

    }


    public void makeTask(View view) {
        // Do something in response to button
        TableLayout table = (TableLayout) findViewById(R.id.myTable);
        TableRow row = new TableRow(this);
        CheckBox chk = new CheckBox(this);

        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();

        chk.setText(message);
        chk.setHeight(100);
        chk.setTextSize(23);
        row.addView(chk);
        table.addView(row);

    }


    public void deleteTask(View view){
        // DELETEボタンが押されたときの処理
        TableLayout table =(TableLayout) findViewById(R.id.myTable);
        int num_row = table.getChildCount(); // tableレイアウト内の行(TableRow)の数を入手
        for(int i=0; i<num_row; i++){
            TableRow tr = (TableRow) table.getChildAt(i);  // tableの子はTableRow
            CheckBox cb = (CheckBox) tr.getChildAt(0);  // tableRowの子はCheckBox
            if(cb.isChecked()){
                table.removeViewAt(i); // checkBoxにcheckが入ってる行を削除
                i -= 1;  // 削除したら行がずれるため調整
                num_row -= 1;  // 削除したら行の数もずれるため調整
            }
        }
    }




}