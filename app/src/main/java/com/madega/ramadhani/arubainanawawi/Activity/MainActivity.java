package com.madega.ramadhani.arubainanawawi.Activity;


import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.text.Editable;

import android.text.TextWatcher;

import android.view.Gravity;
import android.view.MenuItem;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;


import com.madega.ramadhani.arubainanawawi.Fragment.DailogFeedbackFragment;
import com.madega.ramadhani.arubainanawawi.Fragment.HomeFragment;


import com.madega.ramadhani.arubainanawawi.Fragment.MukadimaFragment;
import com.madega.ramadhani.arubainanawawi.R;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private ImageView mSearchbtn;
    private ImageView mbackbtn;
    private ImageView mSharebtn;
    private LinearLayout mSearchLayout;
    private LinearLayout mMenulayout;
    private DrawerLayout mLayoutDrawer;
    private View mDrawerBtn;
    private HomeFragment fragment;



    private NavigationView nav;
    private  EditText text;




    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment=new HomeFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.addFragment,fragment)
                .commit();

        mSearchLayout = findViewById(R.id.searchlayout);
        mMenulayout = findViewById(R.id.menubarlayout);

        //search btn
        mSearchbtn = findViewById(R.id.searchbtn);
        mSearchbtn.setOnClickListener(this);

        //backbtn
        mbackbtn = findViewById(R.id.backbtn);
        mbackbtn.setOnClickListener(this);

        //sharebtn
        mSharebtn = findViewById(R.id.sharebtn);
        mSharebtn.setOnClickListener(this);
        text = findViewById(R.id.searchtxt);




        //open drawer btn
        mDrawerBtn =findViewById(R.id.drawerbtn);
        mDrawerBtn.setOnClickListener(this);
        mLayoutDrawer=findViewById(R.id.layoutDrawer);

        text.addTextChangedListener(new addTextChangeListener(this,text));

        nav=findViewById(R.id.nav);
        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.hadithitem:
                        mSearchbtn.setVisibility(View.VISIBLE);
                        getSupportFragmentManager()
                                .beginTransaction().replace(R.id.addFragment,fragment)
                                .commit();
                        break;
                    case R.id.mukadima:
                        mSearchbtn.setVisibility(View.GONE);
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.addFragment,new MukadimaFragment())
                                .commit();
                        break;
                    case R.id.feedback:
                        DailogFeedbackFragment feedback=new DailogFeedbackFragment();
                        feedback.show(getSupportFragmentManager(),"Feedback");
                        default:

                            break;
                }

                mLayoutDrawer.closeDrawer(Gravity.START);
                return false;
            }
        });


    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.drawerbtn:
                mLayoutDrawer.openDrawer(Gravity.START);
                break;
            case R.id.searchbtn:
                mMenulayout.setVisibility(View.GONE);
                mSearchLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.backbtn:
                mSearchLayout.setVisibility(View.GONE);
                mMenulayout.setVisibility(View.VISIBLE);
                fragment.updateRecycler("");
                //hAdpter.updateList(hadithList);
                break;
            case R.id.sharebtn:
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share via"));
                break;
            default:
                break;
        }
    }


    private class addTextChangeListener implements TextWatcher {

        Context context;

        EditText editText;

        addTextChangeListener(Context context, EditText editText) {
            this.context = context;
            this.editText = editText;
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable editText) {





            String text = editText.toString().toLowerCase();
            fragment.updateRecycler(text);
            }
        }


}
