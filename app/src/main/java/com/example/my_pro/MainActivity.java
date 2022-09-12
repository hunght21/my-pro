package com.example.my_pro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

//    TextView txtNumber;
//    Button btnClick;
//    EditText edtText1, edtText2;
//    Switch aswith;
//    CheckBox check1,check2,check3;
//    Button xnhan;
//    ProgressBar xuly;
//    Button xnhan;
 //   SeekBar see;
//    GridView gridView;
//    String arrayName[]  = {"a","b", "c ", "d", "e"};
//    Button btnMenu;

    TextView txtlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("dday la app");

//        txtNumber = (TextView) findViewById(R.id.textView);
//        btnClick = (Button) findViewById(R.id.button);
//        edtText1 = (EditText) findViewById(R.id.editTextTextPersonName);
//        edtText2 = (EditText) findViewById(R.id.editTextTextPersonName2);
//
//        btnClick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String chuoi1 = edtText1.getText().toString();
//                String chuoi2 = edtText2.getText().toString();
//                // ep thanh so
//                int min = Integer.parseInt(chuoi1);
//                int max = Integer.parseInt(chuoi2);
//                Random random = new Random();
//                int number = random.nextInt(max - min + 1 ) + min;
//
//                // so ->chuoi
//                txtNumber.setText(String.valueOf(number));

//            }
//        });
//        aswith = (Switch) findViewById(R.id.switch1);
//        aswith.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                if( b){
//                    Toast.makeText(MainActivity.this,"BAt",Toast.LENGTH_SHORT).show();
//                }
//                else{
//                    Toast.makeText(MainActivity.this, "tat", Toast.LENGTH_LONG).show();
//                }
//            }
//        });
//
//        check1 = (CheckBox) findViewById(R.id.checkBox);
//        check2 = (CheckBox) findViewById(R.id.checkBox2);
//        check3 =(CheckBox) findViewById(R.id.checkBox3);
//        xnhan = (Button) findViewById(R.id.button);
//
//        xnhan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String monhoc= "";
//                if(check1.isChecked()){
//                    monhoc += check1.getText();
//                }
//                if (check2.isChecked()){
//                    monhoc += check2.getText();
//                }
//                if(check3.isChecked()){
//                    monhoc += check3.getText();
//                }
//            }
//        });
//
//        check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                if(b){
//                    Toast.makeText(MainActivity.this,"ban da chon text 1",Toast.LENGTH_LONG).show();
//                }
//                else Toast.makeText(MainActivity.this,"ban da tat text 1",Toast.LENGTH_LONG).show();
//            }
//        });
//        xuly = (ProgressBar) findViewById(R.id.progressBar2);
//        xnhan = (Button) findViewById(R.id.button2);
//
//        xnhan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                CountDownTimer countdown = new CountDownTimer(10000, 1000) {
//                    @Override
//                    public void onTick(long l) {
//                        int count = xuly.getProgress();
//                        if (count >= xuly.getMax()) {
//                            count = 0;
//                        }
//                        xuly.setProgress(count + 10);
//                    }
//
//                    @Override
//                    public void onFinish() {
//                        Toast.makeText(MainActivity.this, " hoan thanh", Toast.LENGTH_LONG).show();
//                    }
//                };
//                countdown.start();
//            }
//        });
//
//        see = (SeekBar) findViewById(R.id.seekBar);
//        see.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
//
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });
//        gridView = (GridView) findViewById(R.id.gridview);
//        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1);
//        gridView.setAdapter(arrayAdapter);
//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(MainActivity.this, arrayName[i] ,Toast.LENGTH_LONG).show();
//            }
//        });
//        btnMenu = (Button) findViewById(R.id.button);
//        btnMenu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ShowMenu();
//            }
//        });
//    }
//
//    private  void ShowMenu(){
//        PopupMenu popupMenu = new PopupMenu(MainActivity.this, btnMenu);
//        popupMenu.getMenuInflater().inflate(R.menu.menu_demo, popupMenu.getMenu());
//        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem menuItem) {
//                switch (menuItem.getItemId())
//                {
//                    case R.id.seting: btnMenu.setText("menu set");
//                        break;
//                    case R.id.feeback: btnMenu.setText("menu feeback");
//                        break;
//                        case R.id.xuly: btnMenu.setText("Menu xu ly");
//                            break;
//                }
//                return false;
//            }
//        });
//        popupMenu.show();
        txtlogin = (TextView) findViewById(R.id.textViewlogin);

        txtlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogLogin();
            }
        });
        }
    private void DialogLogin(){
        Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.dialog_custom);

        final
        EditText editUser = (EditText) dialog.findViewById(R.id.editUser);
        EditText editPass = (EditText) dialog.findViewById((R.id.editPassword));
        Button btnDongy = (Button) dialog.findViewById(R.id.dongy);
        Button btnhuy = (Button) dialog.findViewById(R.id.huy);

        btnDongy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editUser.getText().toString().trim();
                String password = editPass.getText().toString().trim();
                if(username.equals("tien") && password.equals("123")){
                    Toast.makeText(MainActivity.this, "Thanh cong",Toast.LENGTH_LONG).show();
                    }
                else{
                    Toast.makeText(MainActivity.this, "LOi that bai",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnhuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
            }
        });

        dialog.show();
    }
}