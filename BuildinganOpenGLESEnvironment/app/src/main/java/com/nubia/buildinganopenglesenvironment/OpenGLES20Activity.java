package com.nubia.buildinganopenglesenvironment;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by admin on 2017-9-11.
 */

public class OpenGLES20Activity extends AppCompatActivity {

    private GLSurfaceView mGLView;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mGLView = new MyGLSurfaceView(this);
        setContentView(mGLView);
    }

    class MyGLSurfaceView extends GLSurfaceView{

        private final MyGLRenderer mRenderer;
        public MyGLSurfaceView(Context context){
            super(context);
            setEGLContextClientVersion(2);
            mRenderer = new MyGLRenderer();
            setRenderer(mRenderer);
        }

    }







}
