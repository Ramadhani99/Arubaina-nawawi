package com.madega.ramadhani.arubainanawawi.Fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import com.madega.ramadhani.arubainanawawi.R;

import java.util.ArrayList;
import java.util.List;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;
import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

public class DailogFeedbackFragment extends DialogFragment {
    private ImageView mCancelBtn,mSendmail,mSendWhatsapp,mSendText;
    private EditText mText;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View dialogView=inflater.inflate(R.layout.dailog_feedback,container,false);
        mText=dialogView.findViewById(R.id.complain);
        mCancelBtn=dialogView.findViewById(R.id.cancelBtn);
        mSendmail=dialogView.findViewById(R.id.sendMail);
        mSendWhatsapp=dialogView.findViewById(R.id.sendWhatspp);
        mSendText=dialogView.findViewById(R.id.sendText);
        mCancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        mSendmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEmailApp(mText.getText().toString());
                dismiss();

            }
        });

        mSendWhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWhatsapp(mText.getText().toString());
                dismiss();
            }
        });
        mSendText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTextmsg(mText.getText().toString());
                dismiss();
            }
        });

        return dialogView;


    }

    @Override
    public void onStart() {
        super.onStart();
        getDialog().getWindow().setLayout(MATCH_PARENT,WRAP_CONTENT);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog d=super.onCreateDialog(savedInstanceState);
                d.setCanceledOnTouchOutside(false);
                return  d;
    }
    private void openEmailApp(String text){
      
        Intent sendmail = new Intent(Intent.ACTION_SENDTO);
        sendmail.setData(Uri.parse("mailto:"));

        sendmail.putExtra(Intent.EXTRA_EMAIL, new String[] { "rsadiki99@gmail.com" });
        sendmail.putExtra(Intent.EXTRA_SUBJECT, "Sugestion from Nawawi Application");
        sendmail.putExtra(Intent.EXTRA_TEXT,text);
        Intent chooserIntent = Intent.createChooser(sendmail, "Select email app:");
        startActivity(chooserIntent);
    }
    private void openWhatsapp(String text){
        Intent whatsapp = new Intent("android.intent.action.MAIN");
        whatsapp.setAction(Intent.ACTION_SEND);
        whatsapp.setPackage("com.whatsapp");
        whatsapp.setType("text/plain");
        whatsapp.putExtra("jid", "255717023787" + "@s.whatsapp.net");
        whatsapp.putExtra(Intent.EXTRA_TEXT, text);
        whatsapp.putExtra("exit_on_sent",true);
        startActivity(whatsapp);
    }
    private void openTextmsg(String text){
        Uri uri = Uri.parse("smsto:" + "255717023787");
        Intent sms = new Intent(Intent.ACTION_SENDTO);
        sms.setData(uri);
        sms.putExtra("sms_body", text);
        sms.putExtra("exit_on_sent",true);

        startActivity(sms);

    }


}
