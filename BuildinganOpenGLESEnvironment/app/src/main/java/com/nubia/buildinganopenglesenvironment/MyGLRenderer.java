package com.nubia.buildinganopenglesenvironment;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by admin on 2017-9-11.
 */

public class MyGLRenderer implements GLSurfaceView.Renderer {
    //Called once to set up the view's OpenGL ES environment.
    public void onSurfaceCreated(GL10 unused, EGLConfig config) {
        // Set the background frame color
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
    }
    //Called for each redraw of the view.
    public void onDrawFrame(GL10 unused) {
        // Redraw background color
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
    }
   //Called if the geometry of the view changes, for example when the device's screen orientation changes.
    public void onSurfaceChanged(GL10 unused, int width, int height) {
        GLES20.glViewport(0, 0, width, height);
    }
}
