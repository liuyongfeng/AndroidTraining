package com.nubia.buildinganopenglesenvironment;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by admin on 2017-9-11.
 * A GLSurfaceView is a view container for graphics drawn with OpenGL
 * GLSurfaceView.Renderer controls what is drawn within that view.
 * This lesson explains how to complete a minimal implementation of GLSurfaceView and
 * GLSurfaceView.Renderer in a simple application activity.
 */

public class OpenGLES20Activity extends AppCompatActivity {

    private GLSurfaceView mGLView;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        // Create a GLSurfaceView instance and set it
        // as the ContentView for this Activity.
        mGLView = new MyGLSurfaceView(this);
        setContentView(mGLView);
    }

    class MyGLSurfaceView extends GLSurfaceView{

        private final MyGLRenderer mRenderer;
        public MyGLSurfaceView(Context context){
            super(context);
            // Create an OpenGL ES 2.0 context
            setEGLContextClientVersion(2);
            // Set the Renderer for drawing on the GLSurfaceView
            mRenderer = new MyGLRenderer();
            setRenderer(mRenderer);
        }

    }







}
