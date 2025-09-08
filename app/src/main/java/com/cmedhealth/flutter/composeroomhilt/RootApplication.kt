package com.cmedhealth.flutter.composeroomhilt

import android.app.Application
import android.content.res.Configuration
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class RootApplication : Application()