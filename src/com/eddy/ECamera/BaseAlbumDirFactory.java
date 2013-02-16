package com.eddy.ECamera;

import java.io.File;

import android.os.Environment;

public class BaseAlbumDirFactory extends AlbumStorageDirFactory {
	private static final String CAMERA_DIR = "/ecam/";
	
	@Override
	public File getAlbumStorageDir(String albumName) {
		return new File(Environment.getExternalStorageDirectory() + CAMERA_DIR + albumName);
	}

}
