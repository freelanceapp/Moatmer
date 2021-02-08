package com.semicode.moatmer.geniralUIMethod;

import android.net.Uri;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;

import com.semicode.moatmer.R;
import com.semicode.moatmer.tags.Tags;
import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import de.hdodenhof.circleimageview.CircleImageView;

public class GeneralMethod {

    @BindingAdapter("error")
    public static void errorValidation(View view, String error) {
        if (view instanceof EditText) {
            EditText ed = (EditText) view;
            ed.setError(error);
        } else if (view instanceof TextView) {
            TextView tv = (TextView) view;
            tv.setError(error);


        }
    }


    @BindingAdapter("user_image")
    public static void userImage(View view, String endPoint) {
        if (view instanceof CircleImageView) {
            CircleImageView imageView = (CircleImageView) view;
            if (endPoint != null) {

                Picasso.get().load(Uri.parse(Tags.IMAGE_URL + endPoint)).placeholder(R.drawable.load_image).into(imageView);
            } else {
                Picasso.get().load(R.drawable.load_image).into(imageView);

            }
//        } else if (view instanceof RoundedImageView) {
//            RoundedImageView imageView = (RoundedImageView) view;
//
//            if (endPoint != null) {
//
//                Picasso.get().load(Uri.parse(Tags.IMAGE_URL + endPoint)).placeholder(R.drawable.load_image).fit().into(imageView);
//            } else {
//                Picasso.get().load(R.drawable.load_image).into(imageView);
//
//            }
        } else if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;

            if (endPoint != null) {

                Picasso.get().load(Uri.parse(Tags.IMAGE_URL + endPoint)).placeholder(R.drawable.load_image).fit().into(imageView);
            } else {
                Picasso.get().load(R.drawable.load_image).into(imageView);

            }
        }

    }

    @BindingAdapter({"date"})
    public static void displayDate(TextView textView, long date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm aa", Locale.ENGLISH);
        String m_date = dateFormat.format(new Date(date * 1000));

        textView.setText(String.format(m_date));

    }


    @BindingAdapter("image")
    public static void image(View view, String endPoint) {
        if (view instanceof CircleImageView) {
            CircleImageView imageView = (CircleImageView) view;
            if (endPoint != null) {

                Picasso.get().load(Uri.parse(Tags.IMAGE_URL + endPoint)).placeholder(R.drawable.load_image).into(imageView);
            } else {
                Picasso.get().load(R.drawable.load_image).into(imageView);

            }
        }
//        else if (view instanceof RoundedImageView) {
//            RoundedImageView imageView = (RoundedImageView) view;
//
//            if (endPoint != null) {
//
//                Picasso.get().load(Uri.parse(Tags.IMAGE_URL + endPoint)).placeholder(R.drawable.load_image).fit().into(imageView);
//            } else {
//                Picasso.get().load(R.drawable.load_image).into(imageView);
//
//            }
//        }
        else if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            if (endPoint != null) {

                Picasso.get().load(Uri.parse(Tags.IMAGE_URL + endPoint)).placeholder(R.drawable.load_image).fit().into(imageView);
            } else {
                Picasso.get().load(R.drawable.load_image).into(imageView);

            }
        }

    }


}

