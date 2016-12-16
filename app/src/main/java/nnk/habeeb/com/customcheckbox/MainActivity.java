package nnk.habeeb.com.customcheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.mukesh.tinydb.TinyDB;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    ListView lv;
    ArrayList<Contacts> addlist;
    ArrayList newList;
    ArrayList<Contacts> mylist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addlist = new ArrayList();
        et1 = (EditText) findViewById(R.id.editText);
        lv = (ListView)findViewById(R.id.lv);

    }
  /*  public void save(View view) {

        String name = et1.getText().toString().trim();
        Boolean check = false;

        Contacts ca = new Contacts(name,check);
        addlist.add(ca);
        et1.setText("");

    }*/
    public void getList(){

       /* TinyDB tydb = new TinyDB(this);

       tydb.putString("name1",addlist.get(0).getName());
        tydb.putBoolean("check1",addlist.get(0).getCheck());
        tydb.putListObject("list",newList);*/

    }

    @Override
    protected void onPause() {
        super.onPause();
       /* getList();*/
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
       /* getList();*/
    }
}
